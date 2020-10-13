FROM python:3

WORKDIR /root/gitdir_2
ADD python_1.py /

RUN pip install pystrich

CMD [ "python", "./python_1.py" ]
