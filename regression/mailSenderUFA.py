#!/usr/bin/env python

import smtplib
import sys
import os
from email.mime.base import MIMEBase
from email import Encoders
from email.mime.multipart import MIMEMultipart
from email.mime.text import MIMEText

headline = sys.argv[1]
message = sys.argv[2]
day = sys.argv[3]
senderUsername = sys.argv[4]
mailTo = sys.argv[5]
#file1 = sys.argv[6]
#file2 = sys.argv[7]

# sender == my email address
# recipients == recipient's email address
sender = senderUsername+"@mellanox.com"
recipients = mailTo

# Create message container - the correct MIME type is multipart/alternative.
msg = MIMEMultipart('alternative')
msg['Subject'] = headline
msg['From'] = sender
msg['To'] = recipients


# Record the MIME types of both parts - text/plain and text/html.
#part1 = MIMEText(text, 'plain')
part2 = MIMEText(message, 'html')

# Attach parts into message container.
# According to RFC 2046, the last part of a multipart message, in this case
# the HTML message, is best and preferred.
#msg.attach(part1)
msg.attach(part2)

for file in sys.argv[6:]:
    if not os.path.isfile(file):
        continue
    part3 = MIMEBase('application', "octet-stream")
    part3.set_payload( open(file,"rb").read() )
    Encoders.encode_base64(part3)
    part3.add_header('Content-Disposition', 'attachment; filename="%s"' % os.path.basename(file))
    msg.attach(part3)

#part4 = MIMEBase('application', "octet-stream")
#part4.set_payload( open(file2,"rb").read() )
#Encoders.encode_base64(part4)
#part4.add_header('Content-Disposition', 'attachment; filename="%s"' % os.path.basename(file2))
#msg.attach(part4)


# Send the message via local SMTP server.
s = smtplib.SMTP('localhost')
# sendmail function takes 3 arguments: sender's address, recipient's address
# and message to send - here it is sent as one string.
s.sendmail(sender, recipients.split(","), msg.as_string())
s.quit()
