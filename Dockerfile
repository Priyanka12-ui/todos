FROM openjdk:11.0.15-jre
add target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]