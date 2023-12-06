package config;

import models.member.JoinService;
import models.member.JoinValidator;
import models.member.ListService;
import models.member.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppCtx3.class)//(value = {AppCtx3.class})으로 표현하지만 하나일 땐 저렇게 표현
public class AppCtx2 {
  @Bean
  public MemberDao memberDao(){
    return new MemberDao();
  }
  @Bean
  public JoinValidator joinValidator(){
    return new JoinValidator();
  }
  @Bean
  public JoinService joinService(){
    return new JoinService();
  }
  @Bean
  public ListService listService(){
    return new ListService();
  }

}

