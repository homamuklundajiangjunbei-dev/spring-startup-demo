# Spring Startup Demo

A minimal Spring Boot web application generated with [Spring Initializr](https://start.spring.io/) for Java 21 and Maven. This baseline has no custom endpoint or business logic. It is the starting point for a small startup-message change.

## Run locally

```bash
./mvnw spring-boot:run
```

The application starts an embedded web server on port 8080. Stop it with Ctrl+C. Start of application will print Application Started.

## Verify the baseline

```bash
./mvnw test
```

The generated `contextLoads` test checks that the Spring application context starts. The Spring Boot parent version in `pom.xml` was normalized from the Initializr response (`4.1.1.RELEASE`) to the Maven Central version (`4.1.1`) so the project builds.
