package config;

import models.member.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;


@Configuration
//@ComponentScan(value = "models", excludeFilters = @ComponentScan.Filter
//    (type = FilterType.ANNOTATION, classes = ManualBean.class))
//@ComponentScan(value = "models", excludeFilters = @ComponentScan.Filter
//    (type = FilterType.ASSIGNABLE_TYPE, classes = MemberDao.class))
@ComponentScan(value = "models", excludeFilters = @ComponentScan.Filter
    (type = FilterType.ASPECTJ, pattern = "models..*Dao")) //..하위 패키지의 모든 Dao를 배재
public class AppCtx {
  @Bean //이름이 같을 때는 자동 등록 Bean 보다 수동 Bean 부터 적용된다.
  public MemberDao memberDao(){
    System.out.println("수동 등록빈 우선순위 1등");
    return new MemberDao();
  }
}
