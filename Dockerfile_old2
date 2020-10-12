FROM python:3

WORKDIR /root/gitdir_2

COPY requirements.txt ./
RUN pip install --no-cache-dir -r requirements.txt

COPY . .

CMD [ "python", "./python_1.py" ]
