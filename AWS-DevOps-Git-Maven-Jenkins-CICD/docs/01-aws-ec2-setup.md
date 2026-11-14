# 1. AWS EC2 setup

1. Open AWS Console → EC2 → Launch instance.
2. Choose Ubuntu Server 22.04 LTS or 24.04 LTS.
3. For a learning lab, select an instance size that meets Jenkins memory requirements; 2 GiB RAM can be restrictive, so 4 GiB or more is preferable.
4. Create/select a key pair and launch.
5. In the security group, allow SSH (TCP 22) only from your IP.
6. Allow Jenkins TCP 8080 only from your IP while configuring it. Avoid exposing Jenkins publicly.
7. Connect from your computer:

```bash
chmod 400 your-key.pem
ssh -i your-key.pem ubuntu@EC2_PUBLIC_IP
```

On Windows PowerShell, use the SSH command with the downloaded `.pem` file path; `chmod` is not required in PowerShell.
