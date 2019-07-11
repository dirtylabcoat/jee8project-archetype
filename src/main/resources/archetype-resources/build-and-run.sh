#!/bin/bash
LABEL=$(date +'%Y%m%d-%H%M%S')
mvn clean package && docker build -t ${groupId}/${artifactId}:$LABEL .
docker rm -f ${artifactId} || true && docker run -it -p 8080:8080 -p 4848:4848 --name ${artifactId} ${groupId}/${artifactId}:$LABEL

