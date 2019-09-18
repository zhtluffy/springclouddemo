需要扩展
tig

liquibase

git history

maven repo config

扩展

``` java
    <mirror>
      <id>alimaven</id>
      <name>aliyun maven</name>
      <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
      <mirrorOf>central</mirrorOf>
    </mirror>
```

1. 看配置文件是否正确配置
2. idea中是否指明的是这个配置文件
3. 这个配置文件是否指明了正确的repository

## springcloud开篇

[总篇概述](http://ityouknow.com/spring-cloud.html)


[微服务架构与SOA架构](https://blog.csdn.net/chszs/article/details/78515231)

### 三种注册中心
1. eureka
2. consul
3. zookeeper

### 一个公司
1. netfix

### springcloud -- 版本问题
boot版本降配到 2.0.7.RE 以适配


**父工程依赖**
``` maven
<dependencyManagement>
   <dependencies>
      <dependency>
         <groupId>org.springframework.cloud</groupId>
         <artifactId>spring-cloud-dependencies</artifactId>
         <version>Finchley.SR2</version>
         <type>pom</type>
         <scope>import</scope>
      </dependency>
   </dependencies>
</dependencyManagement>
```

**注册中心依赖**

``` maven
<dependency>
   <groupId>org.springframework.cloud</groupId>
   <artifactId>spring-cloud-starter</artifactId>
</dependency>
<dependency>
   <groupId>org.springframework.cloud</groupId>
   <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>
```

**配置文件**
``` property
spring.application.name=spring-cloud-eureka

server.port=8000
#eureka.client.register-with-eureka=false
#eureka.client.fetch-registry=false

eureka.client.serviceUrl.defaultZone=http://localhost:${server.port}/eureka/
```


消费服务的调用方式 类似于爬虫的http请求模拟 在 spring中就是resttemplate

> 使用了springcloud的starter以及eureka server就必须结合使用,除非另建立一个工程项目

扩展 -- 可以稍微演示一下resttemplate 以及爬虫相关的一些
springboot的静态文件的暴露
使用别名注册中心代号调用时的依赖
