"# quarkus-multimodule-test" 

Quarkus multimodule config problem:

- Running quarkus:dev the @ConfigProperty doens't work, even with the defaultValue

> mvnw compile quarkus:dev  
> curl --verbose http://localhost:8080/app/hello/greeting
```
*   Trying ::1...
* Connected to localhost (::1) port 8080 (#0)
> GET /app/hello/greeting HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.47.0
> Accept: */*
>
< HTTP/1.1 204 No Content
< Date: Fri, 10 May 2019 12:16:17 GMT
<
* Connection #0 to host localhost left intact
```


- But running the jar it does work

> mvn clean package  
> java -jar runner\target\quarkus-quickstart-multimodule-main-1.0-SNAPSHOT-runner.jar
> curl --verbose http://localhost:8080/app/hello/greeting
```
*   Trying ::1...
* Connected to localhost (::1) port 8080 (#0)
> GET /app/hello/greeting HTTP/1.1
> Host: localhost:8080
> User-Agent: curl/7.47.0
> Accept: */*
>
< HTTP/1.1 200 OK
< Connection: keep-alive
< Content-Type: text/plain;charset=UTF-8
< Content-Length: 7
< Date: Fri, 10 May 2019 12:18:52 GMT
<
* Connection #0 to host localhost left intact
bonjour
```