FROM openjdk:8
COPY ./target/jenkins.docker.spring.react_person-database-1.0.jar ./jenkins.docker.spring.react_person-database-1.0.jar
CMD ["java","-jar","jenkins.docker.spring.react_person-database-1.0.jar"]
