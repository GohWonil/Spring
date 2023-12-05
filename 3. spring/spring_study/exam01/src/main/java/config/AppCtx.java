package config;

import models.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //객체를 알려주는 애너테이션
public class AppCtx {
  @Bean
  public Greeter greeter(){
    return new Greeter();
  }
}
