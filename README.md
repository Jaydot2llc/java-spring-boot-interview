# Java Spring Boot Interview

## Instructions

You will need access to an IDE for thie exercise.  You may use the spring initializer website (https://start.spring.io/) to generate the starter application.  This is an open book exercise.

Create a controller with three RESTful endpoints.  
The first endpoint should return the list of customers that is shown in the array.  
The second endpoint should return a single customer by id.  
The third endpoint should return a single account.
The fourth endpoint should return account information for a single customer.

`/customers`

`/customer/{id}`

`/account/{accountNumber}`

`/customer/{id}/account`

All are GET operations.  You can create one or more new controllers for these operations or use an existing controller in the environment.

Create the domain objects for your Customer and Account data.

If a database is not available, you are allowed to hard code data in the service layer of the application.

Your code must compile and run when it is added to an existing application.  Here is the starter code below:

```java

//TODO add any import statements

//TODO add any annotations
public class CustomerController {
    //TODO add your logic below
    
}

```

### Data

```json
customers
[
    {
        "id": 1,
        "firstName": "John",
        "lastName": "Doe",
        "accountNumber": "1234"
    },
    {
        "id": 2,
        "firstName": "Jane",
        "lastName": "Doe",
        "accountNumber": "5678"
    },
    {
        "id": 3,
        "firstName": "Sam",
        "lastName": "Doe",
        "accountNumber": "9012"
    }
]
```

```json
accounts
[
    {
        "accountNumber": "1234",
        "balance": "100.00"
    },
    {
        "accountNumber": "5678",
        "balance": "125.00"
    },
    {
        "accountNumber": "9012",
        "balance": "75.00"
    }
]
```
## Resources
- [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa)
- [Spring Boot With H2 Database](https://www.baeldung.com/spring-boot-h2-database)
- [Quick Guide on Loading Initial Data with Spring Boot](https://www.baeldung.com/spring-boot-data-sql-and-schema-sql)

## Repository Setup

### …or create a new repository on the command line
```sh
echo "# java-spring-boot-interview" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:Jaydot2llc/java-spring-boot-interview.git
git push -u origin main
```

### …or push an existing repository from the command line
```sh
git remote add origin git@github.com:Jaydot2llc/java-spring-boot-interview.git
git branch -M main
git push -u origin main
```