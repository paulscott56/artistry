FROM java:8
VOLUME /tmp
ADD artistry-0.0.1-SNAPSHOT.jar artistry.jar
RUN bash -c 'touch /artistry.jar'
EXPOSE 9988
ENTRYPOINT exec java $JAVA_OPTS -jar /artistry.jar

# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/artistry.jar"]