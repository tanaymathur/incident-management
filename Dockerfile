FROM java:8
EXPOSE 8080
VOLUME /tmp
ADD target/incident-management-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app.jar"]