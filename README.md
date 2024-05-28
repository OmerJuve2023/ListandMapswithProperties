# List and Maps Properties

This project is a Spring Boot application written in Java, built with Maven. It demonstrates the use of lists and maps
properties.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing
purposes.

### Prerequisites

- Java 17 or higher
- Maven
- Docker (optional)

### Installing

1. Clone the repository

```bash
git clone https://github.com/OmerJuve2023/listandmapswithproperties.git
```

2. Change directory to the project

```bash
cd ListandMapswithProperties
```

3. Build the project

```bash
mvn clean install
```

4. Run the project

```bash
mvn spring-boot:run
```

5. Open your browser and navigate to `http://localhost:8080`

### Running the tests

To run the tests, run the following command:

```bash
mvn test
```

### Running the application with Docker

1. Build the Docker image

```bash
docker build -t list-and-maps-properties
```

2. Run the Docker container

```shell
docker run -p 8080:8080 list-and-maps-properties
```

### Running the application with GraalVM

1. Build the GraalVM native image

```bash
mvn -Pnative spring-boot:build-image
```

2. Run the GraalVM native image

```bash
docker run -p 8080:8080 list-and-maps-properties:1.0.0
```

## Authors

* **Omer Juve** - *Initial work* - [OmerJuve2023](https://github.com/OmerJuve2023)