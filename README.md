# Java-pappers-api
Spring Boot - Simple Pappers Api - Maven - Docker - Kubernetes

# Simple Api
Find and Collect legal and financial information on the companies of your choice (statutes, social accounts, brands, managers ...)

# Config API
In application.properties add your pappers api token
 
# Run Project
 - ./mvnw spring-boot:run
 - http://localhost:8080/

# Build Project
 - ./mvnw package
 - java -jar target/pappers-0.0.1-SNAPSHOT.jar

# Dockerise Project
 - docker build -t IMAGE_NAME .
 - docker run -d --name pappers-api -p 8080:8080 IMAGE_NAME

# Deploy Project
This project is deploy on a VM using Kubernetes

 - Push Docker Image on Dockerhub.
 - Deploy project using Kubernetes

 - Link project => http://peermohummad.ddns.net:30190/
