FROM centos:7
RUN yum install -y java-11
ADD target/backend-challenge-1.0.0.jar backend-challenge-1.0.0.jar
ENTRYPOINT exec java -jar backend-challenge-1.0.0.jar