FROM maven:3-amazoncorretto-11

WORKDIR /app

COPY . .

CMD mvn exec:java
