FROM python:3

ADD /root/python_1.py /

RUN pip install pystrich

CMD [ "python", "./python_1.py" ]
