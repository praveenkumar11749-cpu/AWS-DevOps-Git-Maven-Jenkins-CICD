# AWS DevOps Project: Git + Maven + Jenkins CI/CD Pipeline

A beginner-friendly Java/Maven project demonstrating a Jenkins CI pipeline on AWS EC2.

## Project flow
Developer → GitHub → Jenkins on EC2 → Maven test/package → archived JAR

## Folder structure
```text
AWS-DevOps-Git-Maven-Jenkins-CICD/
├── README.md
├── pom.xml
├── Jenkinsfile
├── .gitignore
├── docs/
│   ├── 01-aws-ec2-setup.md
│   ├── 02-java-maven-git-setup.md
│   ├── 03-jenkins-installation.md
│   ├── 04-github-integration.md
│   ├── 05-pipeline-execution.md
│   └── 06-troubleshooting.md
└── src/
    ├── main/java/com/devops/App.java
    └── test/java/com/devops/AppTest.java
```

## Requirements
- AWS account
- Ubuntu EC2 instance (22.04/24.04 recommended)
- Java 21
- Git
- Maven
- Jenkins LTS
- GitHub repository

## Run locally
```bash
java -version
mvn -version
mvn clean test
mvn package
java -jar target/aws-devops-cicd-1.0.0.jar
```

## Push to GitHub
```bash
git init
git add .
git commit -m "Initial AWS DevOps CI/CD project"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/aws-devops-cicd.git
git push -u origin main
```

Replace the remote URL with your own GitHub repository URL.

## Jenkins
Create a Pipeline job, select **Pipeline script from SCM**, choose Git, enter your repository URL, and set the script path to `Jenkinsfile`.

The pipeline checks out source, runs unit tests, packages the JAR, and archives the artifact. Configure a GitHub webhook or SCM polling to trigger builds.

## Important
This starter pipeline builds and archives a console application. It does not expose a web port or run continuously as a web service. Do not enable server deployment commands unless you have intentionally configured a suitable runtime and permissions.
