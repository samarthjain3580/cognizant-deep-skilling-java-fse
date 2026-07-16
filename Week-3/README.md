# Spring REST using Spring Boot 3



## Overview



This module is part of the \*\*Cognizant Digital Nurture 5.0 – Java FSE Deep Skilling Program\*\*.



It demonstrates the fundamentals of developing RESTful Web Services using \*\*Spring Boot 3\*\*. The exercises cover creating REST endpoints, returning JSON responses, handling path variables, and testing APIs using a web browser and Postman.



---



## Exercises Completed



### Exercise 1 – Spring REST Basics



Implemented a simple RESTful Web Service using Spring Boot.



\*\*Topics Covered\*\*



- Spring Boot project setup

- REST Controller

- `@GetMapping`

- Running Spring Boot applications

- Testing REST APIs



\*\*Endpoint\*\*



```

GET /hello

```



\*\*Response\*\*



```

Hello World!!

```



---



### Exercise 2 – Spring REST Handson



Implemented REST APIs that return country information.



#### 1. Get All Countries



\*\*Endpoint\*\*



```

GET /countries

```



\*\*Sample Response\*\*





[

&#x20; {

&#x20;   "code": "IN",

&#x20;   "name": "India"

&#x20; },

&#x20; {

&#x20;   "code": "US",

&#x20;   "name": "United States"

&#x20; },

&#x20; {

&#x20;   "code": "JP",

&#x20;   "name": "Japan"

&#x20; }

]





#### 2. Get Country by Country Code



\*\*Endpoint\*\*



```

GET /countries/{code}

```



\*\*Example\*\*



```

GET /countries/IN

```



\*\*Sample Response\*\*



```

{

&#x20; "code": "IN",

&#x20; "name": "India"

}

```



---



## Folder Structure



```

Spring REST using SpringBoot-3

│

├── Exercise-1\_SpringRest

│   ├── spring-learn

│   ├── output.png

│   ├── structure.png

│   

│

├── Exercise-2\_SpringRest

│   ├── spring-rest-handson

│   └── output.png

│

└── README.md

```



---



## Technologies Used



- Java 17

- Spring Boot 3

- Spring Web

- Maven

- Eclipse IDE

- Postman



---



## Learning Outcomes



- Spring Boot project creation

- Building RESTful Web Services

- REST Controllers

- `@GetMapping`

- Returning JSON responses

- Using Path Variables

- Reading XML data

- Testing REST APIs using Browser and Postman



---



## Status



\*\*Completed Successfully ✅\*\*

