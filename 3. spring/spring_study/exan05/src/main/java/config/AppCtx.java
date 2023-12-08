package config;

import aopex.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration // 객체 컨테이너
@EnableAspectJAutoProxy(proxyTargetClass = true)
//프록시 설정 활성화:객체를 따로 생성하지 않고 객체를 만들어주는 어노테이션(@EnableAspectJAutoProxy) (하위클래스기반프록시)
public class AppCtx {
  @Bean //객체
  public RecCalculator calculator() {
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
