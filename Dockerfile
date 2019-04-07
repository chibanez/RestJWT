FROM tomcat:8-jre8-alpine
WORKDIR /usr/local/tomcat/webapps
COPY target/RestJWT.war RestJWT.war

