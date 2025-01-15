# Java Spring Boot Interview

## Instructions

You will need access to an IDE for thie exercise. This is an open book exercise.

Create a controller with three RESTful endpoints.  
The first endpoint should return the list of customers that is shown in the array.  
The second endpoint should return a single customer by id.  
The third endpoint should return a single account.
OPTIONAL:  The fourth endpoint should return account information for a single customer.

`/customers`

`/customer/{id}`

`/account/{accountNumber}`

`/customer/{id}/account`

All are GET operations.  You can create one or more new controllers for these operations or use an existing controller in the environment.

You will need to create all controllers, service objects, data persistance objects, and domain objects for your Customer and Account data.

If a database is not available, you are allowed to hard code data in the service layer of the application.

**BONUS:** Write unit tests for all of your code if time permits.

Your code must compile and run when it is added to an existing application.  

Data configuration files are provided in the exercise.

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
