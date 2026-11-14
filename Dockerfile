FROM eclipse-temurin:21-jre

WORKDIR /app

COPY JavaPractice.jar JavaPractice.jar

CMD ["java","-jar","JavaPractice.jar"]