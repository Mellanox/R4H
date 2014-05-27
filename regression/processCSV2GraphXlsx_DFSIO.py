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
from xlsxwriter.utility import xl_rowcol_to_cell

def create_formula_str(line, row1, row2, function):
   return '=' + str(xl_rowcol_to_cell(line, row1)) + function + str(xl_rowcol_to_cell(line, row2))

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
   chart.set_size({'width': max(600, (100 + (to_row-from_row)*12)), 'height': 384})

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
   headings = ['X-Axis Title', 'File Size', 'File Count', 'R4H BW [MB/s]', 'R4H BW min [MB/s]', 'R4H BW max [MB/s]', 'R4H [Failed]', 'Vanilla BW [MB/s]', 'Vanilla BW min [MB/s]', 'Vanilla BW max [MB/s]', 'Vanilla [Failed]', 'R4H [sec]', 'R4H min [sec]', 'R4H max [sec]', 'Vanilla [sec]', 'Vanilla min [sec]', 'Vanilla max [sec]', 'R4H [AVG CPU %]', 'Vanilla [AVG CPU %]', 'R4H Total BW [MB/s]', 'Vanilla Total BW [MB/s]', 'R4H [CPU*time]', 'Vanilla [CPU*time]']
   line = 0
   filecount = str()
   filesize = str()
   uda_error_max = []
   uda_error_min = []
   vanilla_error_max = []
   vanilla_error_min = []

   workbook = xlsxwriter.Workbook(outputfile)
   worksheet = workbook.add_worksheet()
   num_format = workbook.add_format({'num_format': '#,##0.00'})
   red_call_format = workbook.add_format({'bg_color': '#FFC7CE', 'font_color': '#9C0006'})

   bold = workbook.add_format({'bold': 1})

   # Add the worksheet data that the charts will refer to.

   worksheet.write_row('A1', headings, bold)
   worksheet.set_column(1, 19, 8)

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
      time_value_min =  row[3]
      time_value_max =  row[4]
      time_value =      row[5]
      bw_value_min =    row[6]
      bw_value_max =    row[7]
      bw_value =        row[8]
      failed_attempts = row[9]
      avg_cpu =         row[10].strip()
      if (filesize != row[2] or filecount != row[1]):
         filesize = row[2]
         filecount = row[1]
         line += 1
         # Formulas for Total's
         worksheet.write_formula(line, 19, create_formula_str(line, 2, 3, '*'), num_format)
         worksheet.write_formula(line, 20, create_formula_str(line, 2, 7, '*'), num_format)
         worksheet.write_formula(line, 21, create_formula_str(line, 11, 17, '*'), num_format)
         worksheet.write_formula(line, 22, create_formula_str(line, 14, 18, '*'), num_format)

      worksheet.write_string(line, 0, '{0} {1}'.format(filesize, filecount))
      worksheet.write_number(line, 1, float(filesize.replace("MB","")))
      worksheet.write_number(line, 2, float(filecount.replace("_files","")))
      if row[0] == 'UFA':
         worksheet.write_number(line, 3, float(bw_value), num_format)
         worksheet.write_number(line, 4, float(bw_value_min), num_format)
         worksheet.write_number(line, 5, float(bw_value_max), num_format)
         uda_error_max.append(str(float(bw_value_max) - float(bw_value)))
         uda_error_min.append(str(float(bw_value) - float(bw_value_min)))
         worksheet.write_number(line, 6, float(failed_attempts))
         worksheet.write_number(line, 11, float(time_value), num_format)
         worksheet.write_number(line, 12, float(time_value_min), num_format)
         worksheet.write_number(line, 13, float(time_value_max), num_format)
         worksheet.write_number(line, 17, float(avg_cpu), num_format)
      else:
         worksheet.write_number(line, 7, float(bw_value), num_format)
         worksheet.write_number(line, 8, float(bw_value_min), num_format)
         worksheet.write_number(line, 9, float(bw_value_max), num_format)
         vanilla_error_max.append(str(float(bw_value_max) - float(bw_value)))
         vanilla_error_min.append(str(float(bw_value) - float(bw_value_min)))
         worksheet.write_number(line, 10, float(failed_attempts))
         worksheet.write_number(line, 14, float(time_value), num_format)
         worksheet.write_number(line, 15, float(time_value_min), num_format)
         worksheet.write_number(line, 16, float(time_value_max), num_format)
         worksheet.write_number(line, 18, float(avg_cpu), num_format)

   # Add BAD values condition formatting (RED cells for HDFS FAILUREs)
   worksheet.conditional_format(1, 6, line, 6, {'type': 'cell', 'criteria': '>', 'value': 0, 'format': red_call_format})

   line += 1 # include last line which we prepared


   # Create BW chart
   chart1 = create_chart(workbook, "R4H vs. Vanilla (AVG BW)", 'A', 'D', 'H', 1, 2, line, uda_error_max, uda_error_min, vanilla_error_max, vanilla_error_min)
   # Insert the chart into the worksheet (with an offset)
   worksheet.insert_chart('A10', chart1, {'x_offset': 25, 'y_offset': 10})

   # Create Time chart
   chart2 = create_chart(workbook, "R4H vs. Vanilla (Time)", 'A', 'L', 'O', 1, 2, line)
   # Insert the chart into the worksheet (with an offset)
   worksheet.insert_chart('K10', chart2, {'x_offset': 25, 'y_offset': 10})
   
   # Create CPU chart
   chart3 = create_chart(workbook, "R4H vs. Vanilla (AVG CPU Usage)", 'A', 'R', 'S', 1, 2, line)
   # Insert the chart into the worksheet (with an offset)
   worksheet.insert_chart('U10', chart3, {'x_offset': 25, 'y_offset': 10})
   
   # Create Total BW chart
   chart4 = create_chart(workbook, "R4H vs. Vanilla (Total BW)", 'A', 'T', 'U', 1, 2, line)
   # Insert the chart into the worksheet (with an offset)
   worksheet.insert_chart('A31', chart4, {'x_offset': 25, 'y_offset': 10})
   
   # Create Total CPU chart
   chart5 = create_chart(workbook, "R4H vs. Vanilla (Total CPU Usage)", 'A', 'V', 'W', 1, 2, line)
   # Insert the chart into the worksheet (with an offset)
   worksheet.insert_chart('K31', chart5, {'x_offset': 25, 'y_offset': 10})
   
   workbook.close()


if __name__ == "__main__":
   main(sys.argv[1:])


