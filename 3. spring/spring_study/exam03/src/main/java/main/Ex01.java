package main;

import config.AppCtx;
import config.AppCtx2;
import config.AppCtx3;
import models.member.JoinService;
import models.member.ListService;
import models.member.Member;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class Ex01 {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx =
        new AnnotationConfigApplicationContext(AppCtx2.class, AppCtx3.class);
    //AnnotationConfigApplicationContext(...)이랑 같음 가변적매개변수 여러가 가능

    JoinService joinService = ctx.getBean("joinService", JoinService.class);
    ListService listService = ctx.getBean("listService", ListService.class);

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
