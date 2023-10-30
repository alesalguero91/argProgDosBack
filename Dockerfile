FROM amazoncorretto:8-alpine-jdk
MAINTAINER salguero

#COPY 
#ENTRYPOINT 

COPY target/argprog-0.0.1-SNAPSHOT.jar  app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
