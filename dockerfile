FROM adoptopenjdk/openjdk13:jre-13.0.2_8-alpine
COPY target/*.jar app.jar
COPY datos.txt datos.txt

ENTRYPOINT ["java", "-jar", "app.jar"]

