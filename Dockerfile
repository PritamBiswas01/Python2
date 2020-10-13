FROM python:3

WORKDIR /root/gitdir_2
ADD python_1.py /temp

CMD [ "python", "temp/python_1.py" ]
