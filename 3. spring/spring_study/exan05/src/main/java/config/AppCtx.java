package config;

import aopex.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration // 객체 컨테이너
@EnableAspectJAutoProxy //프록시 설정 활성화
public class AppCtx {
  @Bean //객체
  public Calculator calculator() {
    return new RecCalculator();
  }
  @Bean
  public ProxyCache proxyCache(){
    return new ProxyCache();
  }
  @Bean //객체
  public ProxyCalculator proxyCalculator(){
    return new ProxyCalculator();
  }
}
