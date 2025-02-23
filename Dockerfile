#COMANDOS A EJECUTAR

## docker build -t nombre-imagen .
## docker run -d -p 8080:8080 nombre-app




# EL PREFIJO ENV ES PARA QUE LLAME LOS DATOS DESDE APPLICARTION.PROPERTIES
# ENV DATABASE_URL jdbc:mysql://localhost:8080/bbdd

#LABEL  author= YOMISMO

#COPY target/app

# Stage 1: Build the application
FROM eclipse-temurin:8-jdk AS builder

# Set the working directory
WORKDIR /app

# Copy the application code
COPY . .

# Given permissions to mvnw
RUN chmod +x mvnw

# Build the application (requires Maven or Gradle)
RUN ./mvnw clean package -DskipTests

# Stage 2: Run the application
FROM eclipse-temurin:8-jre

# Set the working directory
WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Expose the port the app will run on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]