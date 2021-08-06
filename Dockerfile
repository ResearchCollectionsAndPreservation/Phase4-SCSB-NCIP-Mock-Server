FROM jetty:9.4-jre8

ADD build/libs/Phase4-SCSB-NCIP-Mock-Server*.war /var/lib/jetty/webapps/root.war

EXPOSE 9103
