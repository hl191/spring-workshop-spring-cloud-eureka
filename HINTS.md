# Hints

**Spoiler Alert**

We encourage you to work on the assignment yourself or together with your peers. However, situations may present themselves to you where you're stuck on a specific assignment. Thus, this document contains a couple of hints that ought to guide you through a specific task of the lab assignment.

In any case, don't hesitate to talk to us if you're stuck on a given problem!

## Task #1.2

Add the dependency on the Eureka Server to the build (`spring-cloud-starter-netflix-eureka-server`).

## Task #1.3

The modules section of the parent `pom.xml` should look something like this:

```xml
<modules>
    <module>gtd-events</module>
    <module>gtd-command-service</module>
    <module>gtd-query-service</module>
    <module>gtd-common</module>
    <module>gtd-discovery-service</module>
</modules>
```

## Task #1.4

Add the `@EnableEurekaServer` annotation to the application starter class.

## Task #1.5

```yaml
server:
  port: 8761

eureka:
  instance:
    hostname: localhost
  # This is the standard configuration for a standalone Eureka server.
  client:
    register-with-eureka: false
    fetch-registry: false
    service-url:
      default-zone: http://${eureka.instance.hostname}:${server.port}/eureka/
  # We'll override some parameters to minimize startup delay. You should go
  # with the defaults in production-grade setup and change them based as
  # appropriate based on evidence.
  server:
    wait-time-in-ms-when-sync-empty: 1000
    response-cache-update-interval-ms: 5000
```

## Task #2.3 and #2.4:

* Use a configuration for `eureka.client.serviceUrl.defaultZone` that is suitable for local development (value: `http://localhost:8761/eureka).
* Don't forget to set `spring.application.name`!

## Task #2.5:

* Don't forget to override `EUREKA_CLIENT_SERVICEURL_DEFAULTZONE` with the appropriate value!
* `EUREKA_CLIENT_SERVICEURL_DEFAULTZONE` should target the configured `eureka.instance.hostname` of the discovery service.