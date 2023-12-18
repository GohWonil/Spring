package tests;

import configs.ControllerConfig;
import configs.Dbconfig;
import configs.MvcConfig;
import controllers.member.JoinService;
import controllers.member.RequestJoin;
import models.member.Member;
import models.member.MemberDao;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Connection;
//@SpringJUnitWebConfig
@Transactional
@SpringJUnitConfig
@ContextConfiguration(classes = {Dbconfig.class, ControllerConfig.class})
public class JoinServiceTest {

  @Autowired
  private DataSource dataSrouce;
  @Autowired
  private JoinService service;
  @Autowired
  private MemberDao memberDao;
  @Test
  @DisplayName("데이터베이스 연결 테스트")
  void connectionTest() {
    try (Connection conn = dataSrouce.getConnection()) {
      System.out.println(conn);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  @Test
  @DisplayName("MemberDao - exist 메서드 테스트")
  void existsTest(){
    String userId = "USER01";
    boolean result = memberDao.exist(userId);
  }
  @Test
  @DisplayName("JoinService - join 메서드 테스트")
  void joinTest(){
    RequestJoin form = new RequestJoin();
    form.setUserId("user01");
    form.setUserPw("123456");
    form.setUserNm("사용자01");
    form.setEmail("user01@test.org");

    service.join(form);

    Member member = memberDao.get(form.getUserId());
    System.out.println(member);
  }

}
