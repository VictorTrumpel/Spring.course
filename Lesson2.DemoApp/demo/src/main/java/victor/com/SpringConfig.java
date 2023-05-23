package victor.com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("victor.com")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
