package config;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcut {
  @Pointcut("execution(* aopex..*(long))") //따로 관리하는 Pointcut
  public void publicTarget(){

  }
}
