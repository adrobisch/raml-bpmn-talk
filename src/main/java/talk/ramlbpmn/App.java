package talk.ramlbpmn;

import brainslug.spring.SpringBrainslugConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@Import(SpringBrainslugConfiguration.class)
public class App {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
