from java:8
# VOLUME指令创建挂载点
VOLUME /docker/springboot
ADD ./demo-0.0.1-SNAPSHOT.jar springTest2.jar
#项目的启动方式
ENTRYPOINT ["java","-jar","/springTest.jar"]