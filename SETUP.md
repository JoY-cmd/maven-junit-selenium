# Maven JUnit Selenium

A sample Maven project configured with JUnit 4 and Selenium WebDriver for automated testing.

## Project Structure

```
maven-junit-selenium/
├── src/
│   ├── main/
│   │   ├── java/com/example/     # Main source code
│   │   └── resources/            # Main resources
│   └── test/
│       ├── java/com/example/     # Test code
│       └── resources/            # Test resources
├── pom.xml                       # Maven configuration
└── README.md                     # This file
```

## Prerequisites

- Java 21 (LTS) or higher
- Maven 3.6.0 or higher
- Chrome browser (for Selenium tests)

## Setup

1. Clone or download the project
2. Navigate to the project directory:
   ```bash
   cd maven-junit-selenium
   ```

3. Install Maven dependencies:
   ```bash
   mvn clean install
   ```

## Running Tests

Run all tests:
```bash
mvn test
```

Run a specific test class:
```bash
mvn test -Dtest=SeleniumTest
```

Run a specific test method:
```bash
mvn test -Dtest=SeleniumTest#testGoogleSearch
```

## Dependencies

- **Selenium WebDriver**: 4.15.0 - Browser automation framework
- **JUnit**: 4.13.2 - Unit testing framework
- **WebDriverManager**: 5.7.3 - Automatic WebDriver management

## Features

- Configured Maven project structure
- Sample Selenium test class with JUnit
- WebDriverManager for automatic ChromeDriver setup
- Maven Surefire Plugin for test execution

## Example Test

See `src/test/java/com/example/SeleniumTest.java` for sample tests demonstrating:
- Page navigation
- Title verification
- URL verification
- Element locating and assertions

## Build

To build the project:
```bash
mvn clean package
```

This will create a JAR file in the `target/` directory.

## IDE Setup

### VS Code
1. Install Extension Pack for Java
2. Open the project folder
3. Maven dependencies will be automatically downloaded

### IntelliJ IDEA
1. File → Open → Select project directory
2. IntelliJ will automatically detect Maven configuration
3. Project will be configured automatically

### Eclipse
1. File → Import → Existing Maven Projects
2. Select the project directory
3. Eclipse will configure the project

## Notes

- The WebDriverManager library automatically downloads the appropriate ChromeDriver version
- Tests use WebDriverWait for explicit waits to ensure elements are available
- Chrome browser must be installed for tests to run successfully

## License

See LICENSE file for details.
