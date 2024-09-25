FROM openjdk:17
EXPOSE 8080
ADD target/lab-2-arqui-0.0.1-SNAPSHOT.jar labcicd-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/labcicd-0.0.1-SNAPSHOT.jar"]