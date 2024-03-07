# To Do App Backend

This project is the backend for a full stack To Do app using Spring/Java and MySQL.
The corresponding frontend repo can be found [here.](https://github.com/xbmac2/nology-todo-app-project-xandra)

## Setup

Check application.properties file:

- In MySQL, create a database according to the name specified at spring.datasource.url
- Change username and password (if using) according to your MySQL setup

## Logging

Currently, requests being processed are logged to the console. (See Future Updates)

## Documentation

Utilises Swagger to generate documentation. To see endpoints and schemas, run the app and go to http://localhost:8080/swagger-ui/index.html#/

## Future Updates

- use environment variables in application.properties to protect sensitive information
- persist the logs by saving them to a file instead of merely having them in the console
- implement many-to-one relationship with another table: eg. A feature where users can add tasks to "Lists" or "Categories" (a homework todo list, a cleaning todo list etc)
