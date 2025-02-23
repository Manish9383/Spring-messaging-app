Spring Messaging App

This is a Spring Boot application that provides RESTful APIs for handling different types of HTTP requests.

API Endpoints and Testing Instructions

UC1: Basic GET Request
Description: Returns a simple greeting message.

cURL Command:
curl -X GET "http://localhost:8080/hello"

Expected Output:
Hello from BridgeLabz - GET Method

---

UC2: GET Request with Query Parameter
Description: Returns a greeting message by accepting a name as a query parameter.

cURL Command:
curl -X GET "http://localhost:8080/hello/query?name=Manish"

Expected Output:
Hello Manish from BridgeLabz

---

UC3: GET Request with Path Variable
Description: Returns a greeting message by passing a name in the URL path.

cURL Command:
curl -X GET "http://localhost:8080/hello/param/Manish"

Expected Output:
Hello Manish from BridgeLabz

---

UC4: POST Request with JSON Body
Description: Accepts a JSON request body with firstName and lastName attributes and returns a greeting message.

Steps to Test in Postman:
1. Open Postman and click on "New Request".
2. Select "POST" as the request type.
3. Enter the URL:  
   http://localhost:8080/hello/post
4. Go to the "Body" tab and select "raw", then choose "JSON" as the format.
5. Enter this JSON data:
   {
     "firstName": "Mark",
     "lastName": "Taylor"
   }
6. Click "Send" and check the response. You should get:
   Hello Mark Taylor from BridgeLabz

---

UC5: PUT Request with Path Variable and Query Parameter
Description: Uses a path variable for firstName and a query parameter for lastName to return a greeting message.

cURL Command:
curl -X PUT "http://localhost:8080/hello/put/Mark?lastName=Taylor"

Expected Output:
Hello Mark Taylor from BridgeLabz

---

Bonus: DELETE Request
Description: Returns a message indicating a DELETE method was called.

cURL Command:
curl -X DELETE "http://localhost:8080/hello"

Expected Output:
Hello from BridgeLabz - DELETE Method

---

Bonus: POST & PUT Without Parameters
If you want to test the plain POST and PUT methods without parameters:

- POST
  curl -X POST "http://localhost:8080/hello"
  Expected Output:
  Hello from BridgeLabz - POST Method

- PUT
  curl -X PUT "http://localhost:8080/hello"
  Expected Output:
  Hello from BridgeLabz - PUT Method
