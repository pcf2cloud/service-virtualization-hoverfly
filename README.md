# service-virtualization-hoverfly

![hoverfly](https://user-images.githubusercontent.com/40490811/44535291-46e06e80-a717-11e8-8be9-5b54e1042c2c.JPG)

java -jar -Dmode=proxy target\hoverfly-actual-service-client-0.0.1-SNAPSHOT.jar.

 hoverctl mode capture

Now with these settings, in the browser window run the client service couple of times while hoverfly is in capture mode.

hoverctl export simulations.json

 hoverctl import simulations.json

D:\hoverfly>hoverctl mode capture
Hoverfly has been set to capture mode

D:\hoverfly>hoverctl mode capture
Hoverfly has been set to capture mode

D:\hoverfly>hoverctl export simulations.json
Successfully exported simulation to simulations.json

D:\hoverfly> hoverctl import simulations.json
Successfully imported simulation from simulations.json

D:\hoverfly>hoverctl mode simulate
Hoverfly has been set to simulate mode with a matching strategy of 'strongest'

D:\hoverfly>hoverctl stop
Hoverfly has been stopped

D:\hoverfly>hoverctl start --proxy-port 8600
Hoverfly is now running

+------------+------+
| admin-port | 8888 |
| proxy-port | 8600 |
+------------+------+

D:\hoverfly>hoverctl mode capture
Hoverfly has been set to capture mode

D:\hoverfly>hoverctl export simulations.json
Successfully exported simulation to simulations.json

D:\hoverfly> hoverctl import simulations.json
Successfully imported simulation from simulations.json

D:\hoverfly>hoverctl mode simulate
Hoverfly has been set to simulate mode with a matching strategy of 'strongest'

D:\hoverfly>
