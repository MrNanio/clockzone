FROM alpine
RUN apk add openjdk11

ADD target/clockzone-0.0.1-SNAPSHOT.jar .
EXPOSE 8000
CMD java -jar clockzone-0.0.1-SNAPSHOT.jar

