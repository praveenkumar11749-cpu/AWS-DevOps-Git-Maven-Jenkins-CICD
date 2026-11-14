# 5. Configure and run the pipeline

In **Manage Jenkins → Tools**, configure:
- JDK installation name: `Java21` (use an installed JDK or enable automatic installation if appropriate).
- Maven installation name: `Maven3` (use an installed Maven or automatic installation).

These names must match the `tools` section in `Jenkinsfile`. If you prefer system-installed tools, configure their paths in Jenkins or remove the `tools` block and ensure `java` and `mvn` are on the Jenkins service PATH.

Run the Pipeline job. Expected stages:
1. Checkout
2. Build and Test
3. Package
4. Archive Artifact

The generated JAR is archived by Jenkins and can be downloaded from the build page under **Build Artifacts**.

This project is a console application. Deployment as a long-running web service is intentionally not included.
