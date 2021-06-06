#Requirements

In order to run this application, these tools must be installed:
- git
- maven  
- docker
- curl
- jdk8

#How to build & run

- 1) Clone the repository from Github: `git clone https://github.com/CFSNM/backend-challenge.git`
- 2) Move to the repository folder: `cd backend-challenge`
- 3) Build the JAR using Maven: `mvn clean package`
- 4) Move to the target folder: `cd target`
- 5) Run the application: `java -jar backend-challenge-1.0.0.jar`
    
The application will run on the port 8080
    
#API calls
```
Operation                  | HTTP Method  |  Endpoint                     | Accept   | Content-Type | Request Body Class           | Response Body Class
------------------------------------------------------------------------------------------------------------------------------------------------------------------
Create a Basket            | POST         |  /basket                      | JSON     | JSON         | com.cfsnm.lana.model.Basket  | com.cfsnm.lana.model.Basket
Add a Product to a Basket  | PUT          |  /basket/{basketid}/products  | JSON     | JSON         | com.cfsnm.lana.model.Product | com.cfsnm.lana.model.Basket
Get the Price of a Basket  | GET          |  /basket/{basketid}           | JSON     |              |                              | com.cfsnm.lana.model.BasketPrice
Delete a Basket            | DELETE       |  /basket/{basketid}           |          |              |                              | 
```

#Client scripts
- To create a Basket: `sh createBasket.sh {IPADDRESS} {PORT} {BASKET_NAME}`
- To add a Product to a Basket: `sh addProductToBasket.sh {IPADDRESS} {PORT} {BASKET_UUID} {PRODUCT_TYPE}`
- To get the Price of a Basket: `sh getBasketPrice.sh {IPADDRESS} {PORT} {BASKET_UUID}`
- Delete a Basket: `sh deleteBasket.sh {IPADDRESS} {PORT} {BASKET_NAME}`


#Example of use
sh createBasket.sh localhost 8080 Basket_Name
{"id":"165eab67-b5d7-4d66-a24b-9d615aa0d3ad","name":"Basket_Name","products":[]}

sh addProductToBasket.sh localhost 8080 165eab67-b5d7-4d66-a24b-9d615aa0d3ad PEN
{"id":"165eab67-b5d7-4d66-a24b-9d615aa0d3ad","name":"Basket_Name","products":[{"productType":"PEN"}]}

sh getBasketPrice.sh localhost 8080 165eab67-b5d7-4d66-a24b-9d615aa0d3ad
{"price":"70,00€"}

sh deleteBasket.sh localhost 8080 165eab67-b5d7-4d66-a24b-9d615aa0d3ad
No Content


#Bonus Track: Run the application on a Docker Container

1) Build the Docker image: `docker build -t backend-challenge:latest .`
2) Run the container: `docker run -d -p 8080:8080 --name backend-challenge-container backend-challenge:latest`
`
`



