FROM arm64v8/openjdk:22-ea-19
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} portal-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/portal-0.0.1-SNAPSHOT.jar"]
