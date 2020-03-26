FROM openjdk:8-jre

# 下载 Docker Rize 插件
ENV DOCKERIZE_VERSION v0.6.1
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && rm dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz

RUN mkdir /app

COPY app.jar /app/app.jar

# 监控 config 是否启动，等待 config 启动后启动
ENTRYPOINT ["dockerize","-timeout","5m","-wait","http://10.211.55.12:8888/myshop-eureka/prod/master","java","-jar","/app/app.jar","--spring.profiles.active=prod"]

EXPOSE 8761