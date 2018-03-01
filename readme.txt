LoaderBalance

SpringCloud do load balance on client side.(service-hi)

topology
EurekaServer(8761)

service-hi(8762) -> service-user(8763)
                 -> service-user(8764)
                 
http://localhost:8762/hi?id=1
{"id":1,"name":"michael","age":33,"port":8763}
{"id":1,"name":"michael","age":33,"port":8764}


@EnableDiscoveryClient
@EnableEurekaClient


Client Side Load Balance
1) ribbon + rest template
Eureka server has already include ribbon, so basically not more jar need to be introduced.
so we only need to using spring to create one RestTemplate bean and inject it to service dependency 
point.

2) feign
talk later


-Dspring.profiles.active=node2


circuit breaker-Hystrix on ribbon + rest template
need to include maven 
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-hystrix</artifactId>
</dependency>

need to add annotation to Main class @EnableHystrix
and add @HystrixCommand to service dependency method and set fallback method (in same class)

