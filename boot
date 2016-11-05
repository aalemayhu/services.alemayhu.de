#!/bin/sh

docker run -u root -p 5000:8080 -p 50000:50000 -v /srv/jenkins:/var/jenkins_home jenkins &
docker run -p 8000:8000 frikanalen/frikanalen &
