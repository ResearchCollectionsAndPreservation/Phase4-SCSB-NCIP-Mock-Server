# Phase4-SCSB-NCIP-Mock-Server
Receives and responds to NCIP requests

## Build and run:
gradle build
<br>
gradle appRun
### build Docker image
Build the application
```
./gradlew clean build
```
Build the container:
```
docker build -t phase4-scsb-ncip-mock-server .
```
Run the container (example)
```
docker run --name phase4-scsb-ncip-mock-server -p 9103:8080 -d phase4-scsb-ncip-mock-server
```

## Endpoints

#### All NCIP requests should use the endpoint (POST): http://localhost:9103/ncip  (you can adjust the port in the build file)

#### The following GET endpoints can be used for pulling data out/ testing
##### Patrons
http://localhost:9103/api/patrons/