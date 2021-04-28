# java-cli-maven-spring-activemq-map-hello-world

## Description
A POC for active mq in springframework.
Sends and receives a HashMap on a single
topic `mytopic1`.

## Tech stack
- java
- active mq
- maven

## Docker stack
- maven:3-openjdk-17

## To run
`sudo ./install.sh -u`
- ActiveMQ console available at http://localhost:8161
- Login with admin/admin

## To stop (optional)
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credits
- https://spring.io/guides/gs/messaging-jms/
- https://www.javainuse.com/spring/sprboot_activemq
