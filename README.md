# Clean Architecture with Spring Boot
I decided to build a clean architecture app (after reading Clean Architecture book from Uncle Bob).

Created following https://www.baeldung.com/spring-boot-clean-architecture.

### What this app does?
Nothing special. It should provide an endpoint to create a movie record and an endpoint to show all inserted movies.

### Notes
After defining entities we should be able to write tests without mocks. The absence of test mocks is a good sign for
this layer.

In the use case layer we define the rules related to automatization of our system (interactors).
Also interfaces and models for details (web, db) are exposed.

In next step, we implement our adapters. This layer should contain details for web and db.

In the last step, framework and db driver are defined, along with the nastiest of all, 
the main class.
