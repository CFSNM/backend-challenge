FROM centos:7
RUN yum install -y java-11
ADD target target
ADD start_api.sh start_api.sh
ENTRYPOINT exec sh start_api.sh >> backend-challenge-api.log