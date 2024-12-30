FROM openjdk:11-jdk
WORKDIR /app
COPY target/maven-standalone-app*.jar maven-standalone-application.jar 
CMD ["java","-jar","maven-standalone-application.jar"]
