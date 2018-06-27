FROM openjdk:8
ADD target/demoproject.jar demoproject.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","demoproject.jar","container-entrypoint"]
