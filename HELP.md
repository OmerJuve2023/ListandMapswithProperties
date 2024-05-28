
# Information about List and Maps Properties Project

This project is a Spring Boot application written in Java, built with Maven. It demonstrates the use of lists and maps properties.

## Project Structure

The project is structured as follows:

- `src/main/java/com/omersolutions/listandmapswithproperties`: This is the main package of the application. It contains the `ListMapsWithPropertiesApplication.java` which is the entry point of the application.

- `src/test/java/com/omersolutions/listandmapswithproperties/list`: This package contains the tests for the application. The `SocialMediaPropertiesTests.java` file contains tests for validating the properties of social media accounts.

- `.github/workflows/maven.yml`: This file contains the GitHub Actions workflow for building and testing the Java project with Maven.

## Technologies Used

- **Java**: The main programming language used in this project.
- **Spring Boot**: The framework used for creating stand-alone, production-grade Spring based Applications.
- **Maven**: A build automation tool used primarily for Java projects.

## Continuous Integration

The project uses GitHub Actions for continuous integration. The workflow is defined in the `.github/workflows/maven.yml` file. It is triggered on every push and pull request to the master branch. The workflow sets up JDK 17, builds the project with Maven, and runs the tests.

## Social Media Properties

The application manages social media accounts. The `SocialMediaPropertiesTests.java` file contains tests for validating the properties of these accounts.

## Bookmark Properties

The application also manages bookmark properties. The `BookmarkProperties.java` file contains the implementation for this.

## Running the Application

You can run the application using Maven or Docker. Instructions for both methods are provided in the `README.md` file.

## Author

The project is developed by OmerJuve2023. You can find more about the author in the `README.md` file.

## License

This project is licensed under the MIT License. You can find more details in the `LICENSE.md` file.
