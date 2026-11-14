# 3. Install Jenkins LTS on Ubuntu

Use the current official Jenkins Linux installation instructions for your Ubuntu release. The repository signing-key URL and package instructions can change.

Typical sequence from the official guide:

```bash
sudo apt update
sudo apt install -y fontconfig openjdk-21-jre
```

Then add the current Jenkins LTS apt repository and signing key exactly as shown at:
https://www.jenkins.io/doc/book/installing/linux/

Install and start Jenkins:

```bash
sudo apt update
sudo apt install -y jenkins
sudo systemctl enable --now jenkins
sudo systemctl status jenkins
sudo cat /var/lib/jenkins/secrets/initialAdminPassword
```

Open `http://EC2_PUBLIC_IP:8080` from an IP allowed by your security group. Complete the unlock and setup wizard. Install suggested plugins.

If `apt` reports that Jenkins has no installation candidate, check that the official Jenkins repository was added successfully and that its instructions support your Ubuntu release; then run `sudo apt update` again.
