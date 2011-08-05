#!/bin/bash

start() {
	PWD_OLD=`pwd`
	rm -rf gregServer;mkdir -p gregServer;cd gregServer; screen -A -m -d -S gregServer java -jar ../org.kevoree.experiment.trace.server-1.2.0-SNAPSHOT.jar &
#	cd $PWD_OLD
}

stop() {
	screen -p 0 -S gregServer -X eval "'stuff q\\015'"
}


#Start-Stop here
case "$1" in
  start)
    start
    ;;
  stop)
    stop
    ;;
  restart)
    stop
    start
    ;;
  *)
  echo "Usage: /etc/init.d/<SERVICE>  {start|stop|restart}"
  exit 1
  ;;
esac

exit 0