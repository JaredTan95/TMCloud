FROM java

COPY /project/target/tmcloud-discovery-eureka-server-1.0-SNAPSHOT.jar /usr/src/myapp/app.jar

WORKDIR /usr/src/myapp/

RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo "Asia/Shanghai" > /etc/timezone

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8761