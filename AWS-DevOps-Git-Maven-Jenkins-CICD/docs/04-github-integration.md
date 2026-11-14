# 4. GitHub integration

From the project directory:

```bash
git init
git add .
git commit -m "Initial project"
git branch -M main
git remote add origin https://github.com/YOUR-USERNAME/aws-devops-cicd.git
git push -u origin main
```

In Jenkins:
1. Install/confirm the Pipeline and Git plugins.
2. Create a new item → Pipeline.
3. Under Pipeline, select **Pipeline script from SCM**.
4. SCM: Git; Repository URL: your GitHub URL; Branch: `*/main`; Script Path: `Jenkinsfile`.
5. Save and select **Build Now**.

For automatic builds, configure a GitHub webhook to your Jenkins endpoint only after securing Jenkins and making the endpoint reachable. For a private repository, configure credentials in Jenkins; never put a GitHub token in the Jenkinsfile.
