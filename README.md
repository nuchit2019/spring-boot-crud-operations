 # Spring Boot API CRUD Operations
The following was discovered as part of building this project:

* The original package name 'com.janawat.spring boot crud perations' is invalid and this project uses 'com.janawat.spring.boot.crud.perations' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.6.3/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.6.3/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.6.3/reference/htmlsingle/#boot-features-jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)

### Spring Boot CRUD Operations
* What is the CRUD operation?
* The CRUD stands for Create, Read/Retrieve, Update, and Delete. These are the four basic functions of the persistence storage.

### HTTP action verbs.
* POST: Creates a new resource
* GET: Reads a resource
* PUT: Updates an existing resource
* DELETE: Deletes a resource

### Spring Boot CrudRepository
Spring Boot provides an interface called CrudRepository
in the package [org.springframework.data.repository].
It extends the Spring Data Repository interface.
It provides generic Crud operation on a repository.
