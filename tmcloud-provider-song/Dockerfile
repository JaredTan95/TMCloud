FROM java

COPY /target/tmcloud-provider-song-1.0-SNAPSHOT.jar /usr/src/myapp/app.jar

RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo "Asia/Shanghai" > /etc/timezone

WORKDIR /usr/src/myapp/

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","./app.jar"]
EXPOSE 9902