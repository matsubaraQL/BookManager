# BookManager
====

## 起動方法

1. 当プロジェクトをIntelliJ IDEAにGradleProjectとしてclone  
2. docker-composeよりPostgres,SonarQubeを起動  
    `$ cd docker`  
    `$ docker-compose -f docker-compose.yml build`  
    `$ docker-compose -f docker-compose.yml up -d`  
3. GradleタスクよりbootRun(`:micro-api -> Tasks -> application -> bootRun`)

## 停止方法

1. bootRunの停止  
2. docker-composeより停止  
    `$ cd docker`  
    `$ docker-compose -f docker-compose.yml stop`
    
## 構成

Gradleのマルチプロジェクト構成をとっています。

```
BookManager                           … rootプロジェクト
- config                              … build.gradleから使用するTool群の設定ファイル格納フォルダ
- docker                              … docker-compose格納フォルダ
- - postgres                          … 
- - sonarqube                         … 
- - docker-compose.yaml               … dockerコンテナ起動ファイル
- gradle                              … 
- micro-api                           … RestApiプロジェクト
- micro-interfaces                    … RestApiのI/Oを定義したプロジェクト
- micro-test                          … Testツールを格納したプロジェクト
- micro-validator                     … 
- build.gradle                        … Gradle プロジェクト定義
- gradle.properties                   … Gradle プロジェクト定義
- settings.gradle                     … Gradle プロジェクト設定
```    

## Endpoints

[SonarQube][]  
[BookManager][]  

## 環境

### Middleware

| name              | version
| :---------------- | :-------
| OpenJdk           | 1.9
| DockerCompose     | 1.20
| Gradle            | 4.7 
| SonarQube         | 7.x

### Library

| name               | version
| :----------------- | :------
| SpringBoot         | 2.0.x
| SpringFox          | 2.x

[BookManager]: http://localhost:8085/swagger-ui.html     "BookManager"
[SonarQube]: http://localhost:9000/sonarqube/     "SonarQube"