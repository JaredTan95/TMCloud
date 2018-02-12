# TMCloud
    TMCloud是Trailer Music Cloud的简称。
 
>  *Trailer music (a subset of production music) is the background music used for film previews, which is not always from the film's soundtrack. The purpose of this music is to complement, support and integrate the sales messaging of the mini-movie that is a film trailer. Because the score for a movie is usually composed after the film is finished (which is much after trailers are released), a trailer will incorporate music from other sources. Sometimes music from other successful films or hit songs is used as a subconscious tie-in method.*
>  ————From [Wikipedia][1]

## 待定内容...

## 技术选型
| 模块 | 说明 | 技术点 | 
| - | :-: | :-: | 
| tmcloud-discovery-eureka-server(port:8761/8762) | 服务注册与发现。 | Spring Cloud Eureka | 
| tmcloud-admin-ui(port:10000) | 服务监控界面。 | Spring Boot Admin | 
| tmcloud-api-gataway(port:10001) | api网关服务提供者。 | Spring Cloud Zuul | 
| tmcloud-auth(port:11111) | auth认证中心。 | Spring Cloud Security、JWT、Spring Data JPA | 
| tmcloud-hystrix-dashboard-with-turbine(port:10002) | 服务容错监控面板。 | Spring Cloud Hysrtix、Turbine | 
| tmcloud-provider-song(port:9902) | 歌曲服务提供者。 | Spring Cloud Eureka、Spring Data JPA | 
| tmcloud-provider-singer(port:9903) | 歌手服务提供者。 | Spring Cloud Eureka、Spring Data JPA | 
| tmcloud-provider-album(port:9904) | 专辑服务提供者。 | Spring Cloud Eureka、Spring Data JPA | 
| tmcloud-provider-usercomment(port:9905) | 用户评论服务提供者。 | Spring Cloud Eureka、Spring Data JPA | 
| tmcloud-provider-type(port:9906) | 歌曲类型服务提供者。 | Spring Cloud Eureka、Spring Data JPA | 
| tmcloud-provider-aggregate-musicalbum(port:9911) | 歌曲专辑聚合服务提供者。 | Spring Cloud Eureka、Spring Data JPA | 
| tmcloud-bus-rabbitmq | 事件、消息总线服务。 | Spring Cloud Bus | 

## 运行
 ***前提条件：***
 >将以下内容添加到或根据实际情况修改hosts文件：
 ```
 127.0.0.1 discovery gateway localhost
 ```
 - discovery：为Eureka注册中心的hostname
 - gateway：为网关的hostname
 
 ```
  mvn clean
  mvn clean package -Dmaven.test.skip=true # 将每个项目打包
 ```
 - 1. 初始化数据库

 - 2. 依次将每个module里面的Dockerfile构建成镜像
    例如:
    ```
      cd ./tmcloud-discovery-eureka-server/
      docker build -t tmcloud-discovery-docker . #将当前目录下的Dockerfile构建成镜像名为'tmcloud-discovery-docker'的一个镜像
      docker run -p 8761:8761 -d tmcloud-discovery-docker #运行上面构建的镜像,同时将容器的8761端口映射到宿主机的8761端口
      打开浏览器访问 http://localhost:8761或者http://127.0.0.1:8761/ 可以查看运行效果
    ```
    

  [1]: https://en.wikipedia.org/wiki/Trailer_music
