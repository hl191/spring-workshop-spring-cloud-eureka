package workshop.spring.discovery.gtddiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GtdDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtdDiscoveryServiceApplication.class, args);
	}

}
