FROM alpine
RUN apk add openjdk11

WORKDIR /usr/src/app
ADD clockzone-0.0.1-SNAPSHOT.jar .
EXPOSE 8000

CMD java -jar clockzone-0.0.1-SNAPSHOT.jar

