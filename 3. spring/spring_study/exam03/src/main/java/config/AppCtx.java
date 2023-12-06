package config;

import models.member.JoinService;
import models.member.JoinValidator;
import models.member.ListService;
import models.member.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

  //빈의 인스턴스를 생성하고 반환하는 역할을 합니다.
  // 이 메서드는 일반적으로 Spring 컨테이너가 관리하는 다른 빈들과 협력하여 객체 간의 의존성을 설정
  @Bean
  public MemberDao memberDao(){
    return new MemberDao();
  }
  @Bean
  public JoinValidator joinValidator(){
    return new JoinValidator(memberDao());
  }
  @Bean
  public JoinService joinService(){
    return new JoinService(memberDao(), joinValidator());
  }
  @Bean
  public ListService listService(){
    ListService listService = new ListService();
    listService.setMemberDao(memberDao());

    return listService;
  }
}
