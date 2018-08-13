# PermTest

Install and run perm:

```
 4670  2018-08-13 14:01:15 echo $GOPATH
 4671  2018-08-13 14:01:26 cd ~/go
 4672  2018-08-13 14:01:27 ls
 4673  2018-08-13 14:01:33 cd src/code.cloudfoundry.org/
 4674  2018-08-13 14:01:51 git clone git@github.com:cloudfoundry-incubator/perm
 4675  2018-08-13 14:01:54 cd perm
 4676  2018-08-13 14:01:57 gst
 4677  2018-08-13 14:01:59 git pull -r
 4678  2018-08-13 14:02:54 go install code.cloudfoundry.org/perm/cmd/perm
 4679  2018-08-13 14:03:06 echo $PATH | grep go
 4680  2018-08-13 14:03:10 perm
 4681  2018-08-13 14:03:19 perm serve -h
 4682  2018-08-13 14:04:13 perm serve --db-driver in-memory --log-level debug --tls-certificate /tmp/perm-cert.crt --tls-key /tmp/perm-key.pem
```
