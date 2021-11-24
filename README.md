# NCIP-Mock-Server

  A NCIP mock  server imitates a real server by providing realistic responses to requests. Dynamic response can make your mock API more realistic. Responses can be static or dynamic, and simulate the data the real API would return, matching the schema with data types, objects, and arrays. The data can be randomly generated based on the type of field and requirements you determine. For getting the request and sending the response it uses RESTful API Services. 

## Software Required

      - Java 11
      - Docker 19.03.13  
      
## Prerequisite
      
1. Update the below Property Values in scsb_properteis_t table.

      - UPDATE `recap`.`scsb_properties_t` SET `P_VALUE`='http://${DOCKERIPOFNCIPMOCKSERVER}:9103/ncip' WHERE `P_KEY`='ils.server' AND `INSTITUTION_CODE`='PUL';
      - UPDATE `recap`.`scsb_properties_t` SET `P_VALUE`='http://${DOCKERIPOFNCIPMOCKSERVER}:9103/ncip' WHERE `P_KEY`='ils.server' AND `INSTITUTION_CODE`='HL';
  
  
## Build

Download the Project , navigate inside project folder and build the project using below command

**./gradlew clean build**

## Docker Image Creation

Naviagte Inside project folder where Dockerfile is present and Execute the below command

**docker build -t phase4-scsb-ncip-mock-server .**

## Docker Run

User the below command to Run the Docker
  
**docker run --name phase4-scsb-ncip-mock-server -p 9103:8080 -d phase4-scsb-ncip-mock-server**

## Endpoints

#### All NCIP requests should use the endpoint (POST): http://localhost:9103/ncip  (you can adjust the port in the build file)

#### The following GET endpoints can be used for pulling data out/ testing
##### Patrons
http://localhost:9103/api/patrons/
