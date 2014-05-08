#######################################################################
#
# creating Excel Line chart for HDFS csv results
#
# XlsxWriter sources from: https://xlsxwriter.readthedocs.org/getting_started.html
#   curl -O -L http://github.com/jmcnamara/XlsxWriter/archive/master.tar.gz
#   tar zxvf master.tar.gz
#   cd XlsxWriter-master/
#   sudo python setup.py install


import sys, getopt
import csv
import collections
import xlsxwriter


def add_series_in_chart(chart, x_colomn, y_colomn, name_row, from_row, to_row, y_error_plus=[], y_error_minus=[]):
   sheet_name = 'Sheet1'
   chart.add_series({
      'line':   {'width': 2.25},
      'marker': {'type': 'x'},
      'name':       '={0}!${1}${2}'.format(sheet_name, y_colomn, name_row),
      'categories': '={0}!${1}${2}:${1}${3}'.format(sheet_name, x_colomn, from_row, to_row),
      'values':     '={0}!${1}${2}:${1}${3}'.format(sheet_name, y_colomn, from_row, to_row),
      'y_error_bars': {
          'type':         'custom',
          'plus_values':  y_error_plus,
          'minus_values': y_error_minus,
      },
   })

def create_chart(workbook, graph_title, x_colomn, y1_colomn, y2_colomn, name_row, from_row, to_row, y1_error_plus=[], y1_error_minus=[], y2_error_plus=[], y2_error_minus=[]):
   # Create a new chart object
   chart = workbook.add_chart({'type': 'line'})

   # Configure UDA series
   add_series_in_chart(chart, x_colomn, y1_colomn, name_row, from_row, to_row, y1_error_plus, y1_error_minus)

   # Configure Vanilla series
   add_series_in_chart(chart, x_colomn, y2_colomn, name_row, from_row, to_row, y2_error_plus, y2_error_minus)

   # Add a chart title and some axis labels
   chart.set_title({'name': graph_title})
   chart.set_x_axis({'name': 'File Size * File Count'})
   chart.set_size({'width': max(600, (100 + (to_row-from_row)*12)), 'height': 576})

   # Set an Excel chart style. Colors with white outline and shadow
   chart.set_style(10)

   return chart

def main(argv):
   inputfile = 'report.csv'
   outputfile = 'hdfs_chart.xlsx'
   try:
      opts, args = getopt.getopt(argv,"hi:o:",["ifile=","ofile="])
   except getopt.GetoptError:
      print 'options: [-i <', inputfile ,'>] [-o <', outputfile, '>]'
      sys.exit(2)
   for opt, arg in opts:
      if opt == '-h':
         print 'options: [-i <', inputfile ,'>] [-o <', outputfile, '>]'
         sys.exit()
      elif opt in ("-i", "--ifile"):
         inputfile = arg
      elif opt in ("-o", "--ofile"):
         outputfile = arg
   print 'Input file is "', inputfile, '"'
   print 'Output file is "', outputfile, '"'


   graph_title = "R4H testing"
   graph_title_agg_bw = "R4H Agg. BW Testing"
   graph_title_time =   "R4H Time Testing"
   headings = ['X-Axis Title', 'File Size', 'File Count', 'R4H [Agg BW]', 'R4H min [Agg BW]', 'R4H max [Agg BW]', 'Vanilla [Agg BW]', 'Vanilla min [Agg BW]', 'Vanilla max [Agg BW]', 'Vanilla [Failed]', 'R4H [sec]', 'R4H min [sec]', 'R4H max [sec]', 'Vanilla [sec]', 'Vanilla min [sec]', 'Vanilla max [sec]', 'R4H [Failed]']
   line = 0
   filecount = str()
   filesize = str()
   uda_error_max = []
   uda_error_min = []
   vanilla_error_max = []
   vanilla_error_min = []

   workbook = xlsxwriter.Workbook(outputfile)
   worksheet = workbook.add_worksheet()
   bold = workbook.add_format({'bold': 1})

   # Add the worksheet data that the charts will refer to.

   worksheet.write_row('A1', headings, bold)


   csvreader = csv.reader(open(inputfile, 'rb'))

   # Test Title
   row = csvreader.next()
   if row[0] == 'test_details':
      graph_title = row[1]

      # Test CSV headers
      csvreader.next()

   # Test CSV results
   for row in csvreader:
      if not row:
         break
      program =         row[0]
      time_value_min =  row[3]
      time_value_max =  row[4]
      time_value =      row[5]
      bw_value_min =    row[6]
      bw_value_max =    row[7]
      bw_value =        row[8]
      agg_bw_value_min = row[9]
      agg_bw_value_max = row[10]
      agg_bw_value =          row[11]
      failed_attempts = row[12]
      if (filesize != row[2] or filecount != row[1]):
         filesize = row[2]
         filecount = row[1]
         line += 1
      worksheet.write_string(line, 0, '{0} {1}'.format(filesize, filecount))
      worksheet.write_string(line, 1, filesize)
      worksheet.write_string(line, 2, filecount)
      if program == 'UFA':
         worksheet.write_number(line, 3, float(agg_bw_value))
         worksheet.write_number(line, 4, float(agg_bw_value_min))
         worksheet.write_number(line, 5, float(agg_bw_value_max))
         uda_error_max.append(str(float(agg_bw_value_max) - float(agg_bw_value)))
         uda_error_min.append(str(float(agg_bw_value) - float(agg_bw_value_min)))
         worksheet.write_number(line, 10, float(time_value))
         worksheet.write_number(line, 11, float(time_value_min))
         worksheet.write_number(line, 12, float(time_value_max))
         worksheet.write_number(line, 16, float(failed_attempts))
      else:
         worksheet.write_number(line, 9, float(failed_attempts))
         worksheet.write_number(line, 6, float(agg_bw_value))
         worksheet.write_number(line, 7, float(agg_bw_value_min))
         worksheet.write_number(line, 8, float(agg_bw_value_max))
         vanilla_error_max.append(str(float(agg_bw_value_max) - float(agg_bw_value)))
         vanilla_error_min.append(str(float(agg_bw_value) - float(agg_bw_value_min)))
         worksheet.write_number(line, 13, float(time_value))
         worksheet.write_number(line, 14, float(time_value_min))
         worksheet.write_number(line, 15, float(time_value_max))

   line += 1 # include last line which we prepared


   # Create Agg BW chart
   chart1 = create_chart(workbook, graph_title_agg_bw, 'A', 'D', 'G', 1, 2, line, uda_error_max, uda_error_min, vanilla_error_max, vanilla_error_min)
   # Insert the chart into the worksheet (with an offset)
   worksheet.insert_chart('A2', chart1, {'x_offset': 25, 'y_offset': 10})

   # Create Time chart
   chart2 = create_chart(workbook, graph_title_time, 'A', 'K', 'N', 1, 2, line)
   # Insert the chart into the worksheet (with an offset)
   worksheet.insert_chart('A36', chart2, {'x_offset': 25, 'y_offset': 10})

   
   workbook.close()


if __name__ == "__main__":
   main(sys.argv[1:])


