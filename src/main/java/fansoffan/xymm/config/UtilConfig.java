package fansoffan.xymm.config;

import org.simpleframework.xml.core.Persister;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sean Yu
 */
@Configuration
public class UtilConfig {

    @Bean
    public Persister persister(){
        return new Persister();
    }
}
