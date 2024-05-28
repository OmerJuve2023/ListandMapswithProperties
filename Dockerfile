FROM eclipse-temurin:17-jdk-alpine
COPY target/list-and-maps-properties-1.0.0.jar list-and-maps-properties-1.0.0.jar
ENTRYPOINT ["java","-jar","/list-and-maps-properties-1.0.0.jar"]