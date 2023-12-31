package main;

import config.AppCtx;
import config.AppCtx2;
import config.AppCtx3;
import config.AppCtx4;
import models.member.JoinService;
import models.member.ListService;
import models.member.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class Ex01 {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx =
        new AnnotationConfigApplicationContext(AppCtx4.class);
    //AnnotationConfigApplicationContext(...)이랑 같음 가변적매개변수 여러가 가능

    JoinService joinService = ctx.getBean("joinService", JoinService.class); //name 생략 가능
    ListService listService = ctx.getBean(ListService.class); //name 생략한 경우도 작동됨

    Member member = new Member();
    member.setUserId("user01");
    member.setUserPw("123456");
    member.setConfirmPw("123456");
    member.setUserNw("사용자01");
    member.setRegDt(LocalDateTime.now());

    joinService.join(member);

    listService.print();

    ctx.close();
  }
}
