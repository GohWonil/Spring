package main;

import config.AppCtx;
import models.Greeter;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
// AnnotationConfig 설정 ApplicationContext : 어노테이션을 기반으로 한 자바 설정 클래스를 읽어들여 스프링 컨테이너를 초기화 (즉, 객체관리)
    Greeter g1 = ctx.getBean("greeter", Greeter.class);
    g1.hello("이이름");

    Greeter g2 = ctx.getBean("greeter", Greeter.class);
    System.out.println(g1 == g2);
    System.out.println(g1.equals(g2));

    ctx.close();
  }
}
