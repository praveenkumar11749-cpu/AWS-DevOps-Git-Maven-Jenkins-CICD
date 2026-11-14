# 6. Troubleshooting

## Jenkins package not found
Confirm the official Jenkins LTS repository and signing key are configured for your Ubuntu version, then run:

```bash
sudo apt update
apt-cache policy jenkins
```

## Jenkins service does not start

```bash
sudo systemctl status jenkins
sudo journalctl -u jenkins --no-pager -n 100
```

Check Java compatibility and available memory.

## Port 8080 is unreachable
Check Jenkins status, EC2 security-group inbound rules, and host firewall. Restrict access to your own IP.

## Maven command not found

```bash
mvn -version
which mvn
```

Install Maven or configure its location in Jenkins Global Tool Configuration.

## Jenkins says tool not configured
Ensure `Java21` and `Maven3` names in Jenkins Global Tool Configuration exactly match the Jenkinsfile, or adjust the Jenkinsfile.

## Tests fail
Run locally:

```bash
mvn -B clean test
```

Read the first compilation or test assertion error in the output.
