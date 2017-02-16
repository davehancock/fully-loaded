FROM java:openjdk-8-jre-alpine

COPY ./build/libs/java-coffee-consumer.jar /app/dist/java-coffee-consumer.jar
WORKDIR /app/dist

EXPOSE  4242

ENTRYPOINT exec java $JAVA_OPTS -jar java-coffee-consumer.jar
