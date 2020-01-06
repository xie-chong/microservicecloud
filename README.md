# 01、【初级架构搭建】SpringCloud从零搭建微服务架构视频教程

## 1. microservicecloud-provider-dept-8001 部门微服务提供者Module

### 1.1 构建步骤：   
1. 新建microservicecloud-provider-dept-8001（创建完成后请回到父工程查看pom文件变化）   
2. POM（约定 > 配置> 编码）   
3. YML   
4. 工程src/main/resources目录下新建mybatis文件夹后新建mybatis.cfg.xml文件   
5. MySQL创建部门数据库脚本   
6. DeptDao部门接口   
7. 工程src/main/resources/mybatis目录下新建mapper文件夹后再建DeptMapper.xml   
8. DeptService部门服务接口   
9. DeptServiceImpl部门服务接口实现类   
10. DeptController部门微服务提供者REST   
11. DeptProvider8001_App主启动类DeptProvider8001_App   
12. 测试 http://localhost:8001/dept/list


## 2. microservicecloud-consumer-dept-80 部门微服务消费者Module   
### 2.1 RestTemplate   
RestTemplate提供了多种便捷访问远程Http服务的方法， 是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的**客户端模板工具集**

RestTemplate提供了多种便捷访问远程Http服务的方法，是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问Rest服务的客户端模板工具集

使用：   
使用restTemplate访问restful接口非常的简单粗暴无脑。(url, requestMap, ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。

官网地址:https://docs.spring.io/spring-framework/docs/4.3.7.RELEASE/javadoc-api/org/springframework/web/client/RestTemplate.html


### 2.2 构建步骤：   
1. 新建microservicecloud-consumer-dept-80   
2. POM（约定 > 配置> 编码）   
3. YML   
4. com.atguigu.springcloud.cfgbeans包下ConfigBean的编写（类似spring里面的applicationContext.xml写入的注入Bean）   
5. com.atguigu.springcloud.controller包下新建DeptController_Consumer部门微服务消费者REST   
6. DeptConsumer80_App主启动类   
17. 测试 http://localhost/consumer/dept/get/2   
http://localhost/consumer/dept/list   
http://localhost/consumer/dept/add?dname=AI
