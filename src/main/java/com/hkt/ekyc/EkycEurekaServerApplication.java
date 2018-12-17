import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.context.ApplicationPidFileWriter;


@EnableEurekaServer
@SpringBootApplication
public class EkycEurekaServerApplication {

	public static void main(String[] args) {
        SpringApplication app = new SpringApplication(EkycEurekaServerApplication.class);
        app.addListeners(new ApplicationPidFileWriter());
        app.run(args);

	}
}
