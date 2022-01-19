FROM openjdk:14
EXPOSE 8082
EXPOSE 3306
ADD target/spring-boot-docker.war spring-boot-docker.war
ENTRYPOINT ["java","-jar","/spring-boot-docker.war"]