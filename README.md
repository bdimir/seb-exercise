# seb-exercise
App is a rest service, which returns suggested bank services based upon answers to questions that the
customer has given.

## Run app
1. Open in Spring Tool Suite 3 or later
2. Right click src/main/java -> run as -> Spring Boot App

## Endpoint
By default the app local url:
http://localhost:8080/products




### Test Example
Use Postman or similar software. 
Select POST method. 
Set post-man headers:
* Content-Type      application/json
* Accept            application/json

#### Sample
Body:

``` 
{"age": 30, "isStudent": false, "income": 45000}
``` 

Expected result:
``` 
[
    "Current Account",
    "Current Account Plus",
    "Credit Card",
    "Gold Credit Card"
]
``` 
