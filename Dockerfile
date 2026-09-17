FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY src/ /app/

RUN javac Main.java Customer.java

ENTRYPOINT ["java", "Main"]