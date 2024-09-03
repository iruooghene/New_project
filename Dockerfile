FROM maven:3.8.7 as build
COPY . .
RUN mvn -B clean package -DskipTests
FROM openjdk:17
COPY --from=build /target/*.jar  NewProject.jar
ENTRYPOINT ["java", "-jar", "-Dserver.port=8083", "NewProject.jar"]