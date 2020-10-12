FROM python:3

ADD /root/gitdir_2/python_1.py /

RUN pip install pystrich

CMD [ "python", "./my_script.py" ]
