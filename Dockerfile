FROM python:3

ADD python_1.py /

RUN pip install pystrich

CMD [ "python", "./my_script.py" ]
