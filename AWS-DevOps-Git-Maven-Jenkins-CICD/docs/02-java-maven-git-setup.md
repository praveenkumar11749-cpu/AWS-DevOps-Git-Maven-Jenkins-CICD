# 2. Install Java, Maven, and Git

On Ubuntu:

```bash
sudo apt update
sudo apt install -y fontconfig openjdk-21-jdk git maven
java -version
javac -version
git --version
mvn -version
```

If Java 21 is not available in the Ubuntu repositories for your image, use a supported OpenJDK 21 distribution and follow its official Ubuntu installation instructions.

Copy/clone your project and test it:

```bash
git clone https://github.com/YOUR-USERNAME/aws-devops-cicd.git
cd aws-devops-cicd
mvn clean test
mvn package
java -jar target/aws-devops-cicd-1.0.0.jar
```
