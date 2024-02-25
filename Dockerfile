FROM eclipse-temurin:21-alpine
VOLUME /tmp
EXPOSE 9010
COPY /target /tmp
ARG JAR_FILE=target/eurojacpot-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]