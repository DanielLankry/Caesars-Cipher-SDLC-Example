<div id="top">

<div align="center">

# Caesar Cipher SDLC

<em>A comprehensive demonstration of the Software Development Life Cycle using Caesar cipher encryption in Java.</em>

<img src="https://img.shields.io/github/last-commit/DanielLankry/Caesar-cipher-SLDC?style=flat&logo=git&logoColor=white&color=0080ff" alt="last-commit">
<img src="https://img.shields.io/github/languages/top/DanielLankry/Caesar-cipher-SLDC?style=flat&color=0080ff" alt="repo-top-language">
<img src="https://img.shields.io/github/languages/count/DanielLankry/Caesar-cipher-SLDC?style=flat&color=0080ff" alt="repo-language-count">
<img src="https://circleci.com/gh/DanielLankry/Caesar_cipher_SLDC.svg?style=svg" alt="CircleCI">

</div>
<br>

<div align="center">
  <img src="https://user-images.githubusercontent.com/yourusername/caesar-cipher-demo.gif" alt="Caesar Cipher Demo" width="600">
</div>
<br>

---

## ✨ Overview

**Caesar Cipher SDLC** is a practical demonstration of the complete Software Development Life Cycle (SDLC) using a Caesar cipher implementation in Java. This project showcases industry best practices from initial development through automated testing and continuous integration.

### 🎯 Project Goals:

- 🎓 **Educational**: Demonstrate the complete SDLC process for beginners and experienced developers
- 🔐 **Functional**: Implement a working Caesar cipher with proper alphabet wrapping
- 🧪 **Testing**: Show comprehensive unit testing with JUnit 5
- 🚀 **CI/CD**: Demonstrate automated testing and deployment with CircleCI

### 🛠️ Built With:

- **Language**: Java 21
- **Build Tool**: Gradle 8.9
- **Testing**: JUnit 5 (Jupiter)
- **CI/CD**: CircleCI
- **IDE**: Eclipse with Buildship
- **Version Control**: Git & GitHub

---

## ✨ Features

This project demonstrates comprehensive SDLC practices:

* 🔐 **Caesar Cipher Implementation**: Complete encryption/decryption with proper alphabet wrapping and space preservation
* 🧪 **Comprehensive Testing**: JUnit 5 test suite covering normal cases and edge cases (empty strings, overflow handling)
* 🏗️ **Modern Build System**: Gradle-based project with dependency management and automated builds
* 🔄 **Continuous Integration**: CircleCI pipeline with automated testing on every push
* 📚 **Educational Structure**: Well-documented code following Java best practices and SOLID principles
* 🛠️ **IDE Integration**: Eclipse project setup with proper classpath and build configurations

### 🧠 Key Benefits:

- 📖 **Learning-Focused**: Perfect for understanding SDLC concepts with hands-on examples
- 🔒 **Secure Implementation**: Demonstrates proper cryptographic algorithm implementation
- ⚡ **Automated Quality**: CI/CD ensures code quality and prevents regressions
- 🎯 **Production-Ready**: Follows industry standards for Java development and testing

<br>

```
Original Message: how are you doing today
Encrypted Message: Zai SdW kag Va[`Y faVSk
```

<div align="center">
  <em>Example of Caesar cipher encryption with offset 12</em>
</div>

---

## 🚀 Getting Started

Follow these instructions to get a copy of the project up and running on your local machine.

### ✅ Prerequisites

Before you begin, ensure you have the following installed:

* **Java Development Kit**: JDK 21 or higher
* **Gradle**: Version 8.9+ (or use the included Gradle wrapper)
* **Git**: For cloning the repository
* **IDE**: Eclipse, IntelliJ IDEA, or VS Code (Eclipse recommended for full project compatibility)

**System Requirements:**
- OS: Windows 10+, macOS 10.14+, or Linux
- RAM: 2GB minimum, 4GB recommended
- Storage: 100MB available space

### ⚙️ Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/lankdaniel14/Caesar_cipher_SLDC.git
   cd Caesar_cipher_SLDC
   ```

2. **Build the project:**
   ```bash
   # Using Gradle wrapper (recommended)
   ./gradlew build
   
   # Or on Windows
   gradlew.bat build
   
   # Using system Gradle
   gradle build
   ```

3. **Run tests to verify installation:**
   ```bash
   ./gradlew test
   ```

### 🏎️ Usage

#### Running the Application

1. **Compile and run the main class:**
   ```bash
   # Using Gradle
   ./gradlew run
   
   # Or compile and run manually
   ./gradlew build
   java -cp lib/build/classes/java/main _Caesar_cipher_SLDC.Main
   ```

2. **Expected Output:**
   ```
   Original Message: how are you doing today
   Encrypted Message: Zai SdW kag Va[`Y faVSk
   ```

#### Using the Caesar Cipher Class

```java
import _Caesar_cipher_SLDC.CaesarCipher;

public class Example {
    public static void main(String[] args) {
        CaesarCipher cipher = new CaesarCipher();
        
        // Encrypt a message
        String original = "hello world";
        String encrypted = cipher.cipher(original, 13);
        System.out.println("Encrypted: " + encrypted);
        
        // Decrypt by using negative offset
        String decrypted = cipher.cipher(encrypted, -13);
        System.out.println("Decrypted: " + decrypted);
    }
}
```

#### Command Line Usage

```bash
# Run with different parameters by modifying Main.java
# Example modifications:
# - Change the message variable
# - Change the offset value
# - Add command line argument parsing
```

### ⚙️ Running Tests

```bash
# Run all tests
./gradlew test

# Run tests with detailed output
./gradlew test --info

# Run specific test class
./gradlew test --tests "CaesarCipherTest"

# Generate test report
./gradlew test jacocoTestReport
```

**Test Output Example:**
```
CaesarCipherTest > testCipheredMessageWithOffset12() PASSED
CaesarCipherTest > testEmptyString() PASSED

BUILD SUCCESSFUL in 2s
3 actionable tasks: 3 executed
```

---

## 🔐 Caesar Cipher Algorithm

### How It Works

The Caesar cipher is a simple substitution cipher where each letter is shifted by a fixed number of positions in the alphabet.

```java
public String cipher(String message, int offset) {
    offset %= ALPHABET_SIZE; // Handle overflow (offset > 26)
    char[] character = message.toCharArray();
    offsetby(character, offset);
    return new String(character);
}
```

### Key Features

* **Alphabet Wrapping**: When shifting past 'z', the algorithm wraps back to 'a'
* **Space Preservation**: Spaces in the message remain unchanged
* **Overflow Protection**: Large offsets are handled using modulo operation

### Algorithm Example

```
Original: "hello"
Offset: 3
Process: h->k, e->h, l->o, l->o, o->r
Result: "khoor"
```

### Mathematical Representation

For encryption: `E(x) = (x + k) mod 26`
For decryption: `D(x) = (x - k) mod 26`

Where:
- `x` = position of letter in alphabet (a=0, b=1, ..., z=25)
- `k` = offset value
- `mod 26` = ensures wrapping within alphabet

---

## 🧪 Testing

### Test Coverage

The project includes comprehensive JUnit 5 tests:

```java
@Test
void testCipheredMessageWithOffset12() {
    assertEquals("Zai SdW kag Va[`Y faVSk", 
                 caesarCipher.cipher("how are you doing today", 12));
}

@Test
void testEmptyString() {
    assertEquals("", caesarCipher.cipher("", 12));
}
```

### Test Cases Covered

* ✅ **Normal Operation**: Standard message encryption with various offsets
* ✅ **Edge Cases**: Empty strings, single characters
* ✅ **Boundary Conditions**: Alphabet wrapping (z→a transitions)
* ✅ **Space Handling**: Messages with spaces preserved correctly

### Running Specific Tests

```bash
# Run individual test methods
./gradlew test --tests "*CaesarCipherTest.testCipheredMessageWithOffset12"

# Run all tests in a class
./gradlew test --tests "*CaesarCipherTest"

# Run with verbose output
./gradlew test --info
```

---

## 🚀 CI/CD Pipeline

### CircleCI Configuration

The project uses CircleCI for automated testing:

```yaml
version: 2.1

jobs:
  build-and-test:
    docker:
      - image: cimg/openjdk:17.0
    steps:
      - checkout
      - run:
          name: Set Gradle permissions
          command: chmod +x ./gradlew
      - run:
          name: Run Gradle Tests
          command: ./gradlew test

workflows:
  build-and-test-workflow:
    jobs:
      - build-and-test
```

### Pipeline Features

* 🔄 **Automated Testing**: Tests run on every push and pull request
* 🐳 **Docker Environment**: Consistent testing environment using OpenJDK 17
* ⚡ **Fast Feedback**: Quick build and test cycle (typically < 2 minutes)
* 📊 **Build Status**: Visual feedback through README badges

  <img width="1575" height="527" alt="image" src="https://github.com/user-attachments/assets/e7a0cee6-d263-4237-afe2-53137df8b632" />


### Monitoring Build Status

- **Build Status**: [![CircleCI](https://circleci.com/gh/lankdaniel14/Caesar_cipher_SLDC.svg?style=svg)](https://circleci.com/gh/lankdaniel14/Caesar_cipher_SLDC)
- **View Details**: Click the badge above to see detailed build history
- **Notifications**: Configure email/Slack notifications for build failures

---

## 📁 Project Structure

```
Caesar_cipher_SLDC/
├── .circleci/
│   └── config.yml                 # CircleCI pipeline configuration
├── gradle/
│   ├── libs.versions.toml         # Dependency version catalog
│   └── wrapper/                   # Gradle wrapper files
├── lib/
│   ├── src/
│   │   ├── main/java/
│   │   │   └── _Caesar_cipher_SLDC/
│   │   │       ├── CaesarCipher.java    # Core cipher implementation
│   │   │       ├── Library.java         # Generated library class
│   │   │       └── Main.java            # Application entry point
│   │   └── test/java/
│   │       └── _Caesar_cipher_SLDC/
│   │           ├── CaesarCipherTest.java # Unit tests
│   │           └── LibraryTest.java      # Generated test
│   └── build.gradle.kts           # Module build configuration
├── .gitignore                     # Git ignore patterns
├── build.gradle                   # Root build configuration
├── gradlew                        # Gradle wrapper script (Unix)
├── gradlew.bat                    # Gradle wrapper script (Windows)
├── settings.gradle.kts            # Project settings
└── README.md                      # This file
```

### Key Files Explained

| File | Purpose |
|------|---------|
| `CaesarCipher.java` | Core encryption/decryption logic |
| `Main.java` | Demonstrates cipher usage |
| `CaesarCipherTest.java` | Comprehensive test suite |
| `build.gradle.kts` | Dependencies and build configuration |
| `.circleci/config.yml` | CI/CD pipeline definition |

---

## 🤝 Contributing

We welcome contributions! This project serves as an educational example, so contributions that improve clarity, add features, or enhance the learning experience are especially valuable.

### Development Setup

1. **Fork and clone the repository**
2. **Set up your development environment:**
   ```bash
   # Clone your fork
   git clone https://github.com/YOUR-USERNAME/Caesar_cipher_SLDC.git
   cd Caesar_cipher_SLDC
   
   # Build and test
   ./gradlew build test
   ```

3. **Import into your IDE:**
   - **Eclipse**: File → Import → Existing Gradle Project
   - **IntelliJ IDEA**: File → Open → Select build.gradle
   - **VS Code**: Open folder and install Java Extension Pack

### Making Changes

1. **Create a feature branch:**
   ```bash
   git checkout -b feature/improve-algorithm
   ```

2. **Make your changes and add tests:**
   ```java
   // Example: Adding a new test case
   @Test
   void testCipherWithNegativeOffset() {
       String result = caesarCipher.cipher("abc", -1);
       assertEquals("zab", result);
   }
   ```

3. **Ensure code quality:**
   ```bash
   # Run tests
   ./gradlew test
   
   # Check build
   ./gradlew build
   
   # Verify CI configuration
   ./gradlew clean build test
   ```

4. **Commit and push:**
   ```bash
   git add .
   git commit -m "Add negative offset test case"
   git push origin feature/improve-algorithm
   ```

5. **Create a Pull Request** with a clear description of your changes

### Contribution Ideas

- 🧪 **Additional Test Cases**: Edge cases, performance tests, parameterized tests
- 📚 **Documentation**: Code comments, JavaDoc, additional examples
- 🔧 **Algorithm Improvements**: Support for uppercase letters, numbers, special characters
- 🎯 **New Features**: Decryption method, file I/O, GUI interface
- 🚀 **DevOps**: Additional CI providers, code coverage reporting, automated releases

### Code Style Guidelines

- Follow standard Java naming conventions
- Use meaningful variable and method names
- Add JavaDoc comments for public methods
- Keep methods focused and single-purpose
- Maintain test coverage for new features

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

### Educational Use

This project is specifically designed for educational purposes. Feel free to:
- Use it in coursework and assignments
- Modify it for learning exercises
- Share it with students and colleagues
- Build upon it for your own projects

---

### Educational Resources

- 📺 **Video Tutorial**: [Complete SDLC Walkthrough](https://youtu.be/9PgZCJNzY9M) - Step-by-step guide building this project
- 📚 **Documentation**: [Java JUnit 5 Guide](https://junit.org/junit5/docs/current/user-guide/)
- 🛠️ **Tools**: [Gradle User Manual](https://docs.gradle.org/current/userguide/userguide.html)
- 🚀 **CI/CD**: [CircleCI Documentation](https://circleci.com/docs/)

---

## 🙏 Acknowledgments

* **JUnit Team** - For providing excellent testing framework and documentation
* **Gradle Team** - For the powerful build automation tool
* **CircleCI** - For free CI/CD services for open source projects
* **Eclipse Foundation** - For the robust IDE platform
* **Java Community** - For continuous language improvements and best practices

### Learning Resources

* [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/) - Official Java learning materials
* [Test Driven Development Guide](https://martinfowler.com/bliki/TestDrivenDevelopment.html) - TDD best practices
* [SDLC Methodologies](https://www.tutorialspoint.com/sdlc/index.htm) - Software development lifecycle overview

---

<div align="center">
  
**[⬆ Back to Top](#top)**

Made with ❤️ for learning by [lankdaniel14](https://github.com/lankdaniel14)

</div>
   ```

4. **Run tests:**
   ```bash
   pytest
   ```

5. **Commit and push:**
   ```bash
   git add .
   git commit -m "Add amazing feature"
   git push origin feature/amazing-feature
   ```

6. **Create a Pull Request**

### Code Style

- Follow [PEP 8](https://pep8.org/) for Python code
- Use [Black](https://black.readthedocs.io/) for code formatting
- Write docstrings for all public functions and classes
- Maintain test coverage above 80%

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

### Third-Party Licenses

- [Library Name](link): License Type
- [Another Library](link): License Type

---

## 📞 Contact

**Your Name** - [@your_twitter](https://twitter.com/your_twitter) - your.email@example.com

**Project Link**: [https://github.com/YOUR-USERNAME/YOUR-REPO-NAME](https://github.com/YOUR-USERNAME/YOUR-REPO-NAME)

### Additional Resources

- 📚 [Documentation](https://your-project-docs.com)
- 🐛 [Issue Tracker](https://github.com/YOUR-USERNAME/YOUR-REPO-NAME/issues)
- 💬 [Discussions](https://github.com/YOUR-USERNAME/YOUR-REPO-NAME/discussions)
- 📢 [Changelog](CHANGELOG.md)

---

## 🙏 Acknowledgments

* [Youtube Vudeo tutorial](https://www.youtube.com/watch?v=9PgZCJNzY9M&t=315s) - For providing the core functionality


---

<div align="center">
  
**[⬆ Back to Top](#top)**

Made with ❤️ by [Your Name](https://github.com/YOUR-USERNAME)

</div>
