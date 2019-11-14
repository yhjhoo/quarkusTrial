# quarkusTrial

To run project
```shell script
mvn compile quarkus:dev
```


use curl to get result
```shell script
curl -H "Content-Type: application/json" -X POST -d "hello"  http://0.0.0.0:8080/hello/app/hi -H "HeaderTest:Test"
```


### Uber jar configuration
```xml
<configuration>
    <uberJar>true</uberJar>
</configuration>
```



## Generate project

### Use maven command to generate project 
```shell script
mvn io.quarkus:quarkus-maven-plugin:create -DprojectGroupId=me.prince.quarkus -DprojectArtifactId=quarkus-project -DclassName="me.prince.quarkus.HelloResource" -Dpath="/hello"
```

### Use Web UI to generate project (Similar to Spring-boot project)
https://code.quarkus.io/


Note: 
Response DTO object must be public class


