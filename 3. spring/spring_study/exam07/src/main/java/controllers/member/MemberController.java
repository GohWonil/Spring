package controllers.member;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import models.member.JoinService;
import models.member.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import models.member.Member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
  private final JoinValidator joinValidator; // @RequiredArgsConstructor 생성자 매개변수
  private final JoinService joinService;
  private final LoginValidator loginValidator;
  private final LoginService loginService;
  @ModelAttribute("hobbies")
  public List<String> hobbies() {
    return Arrays.asList("자바", "오라클", "JSP", "스프링");
  }
//  @GetMapping("/member/join")
//  public String join(Model model){
//    Member member = Member.builder()
//        .userNo(1L)
//        .userPw("1234")
//        .userId("user01")
//        .userNm("<h1>사용자01</h1>")
//        .email("user01@test.org")
//        .regDt(LocalDateTime.now())
//        .build();
//
//    model.addAttribute("member", member);
//    model.addAttribute("pageTitle","회원가입");
//    return "member/join";
//  }
  @GetMapping("/join")
  //@RequestMapping("/member") //공통 주소를 입력하면 아래 맵핑시 생략이 가능
  public String join(@ModelAttribute RequestJoin form , Model model) {

//    String[] addCss = {"member/style1", "member/style2"};
//    List<String> addScript = Arrays.asList("member/scrip1.js", "member/script2.js");
//
//    model.addAttribute("addCss",addCss);
//    model.addAttribute("addScript", addScript);
//    model.addAttribute("pageTitle", "회원가입");
//    model.addAttribute("requestJoin", new RequestJoin());
    model.addAttribute("pageTitle", "회원가입");

    return "member/join";
  }

  @PostMapping("/join")
  public String joinPs(@Valid RequestJoin form, Errors errors, Model model){ //Errors는 커멘더 객체인  RequestJoin 바로 뒤에 넣어준다

    joinValidator.validate(form, errors);

    if(errors.hasErrors()) { //검증 실패시
      return "member/join";
    }
//    회원가입 처리
    joinService.join(form);
//    System.out.println(form);
//    model.addAttribute("requestJoin", form);

    return "redirect:/member/login"; //사이트 이동
//    return "forward:/member/login"; //주소를 바꾸지 않고 버퍼만 바뀜
  }
  @GetMapping("/login") // /member/login
  public String login(@ModelAttribute RequestLogin form) {

    return "member/login";
  }
  @PostMapping("/login") // /member/login
  public String loginPs(@Valid RequestLogin form, Errors errors) {

    loginValidator.validate(form, errors);

    if (errors.hasErrors()) {
      return "member/login";
    }

    //로그인 처리
    loginService.login(form);

    return "redirect:/"; // 로그인 성공시 메인페이지 / 이동
  }
  @RequestMapping("/logout")
  public String logout(HttpSession session){
    session.invalidate(); //세션 비우기

    return  "redirect:/member/login";// 로그인 페이지 이동
  }
  @GetMapping("/list")
  public String members(Model model){
    List<Member> members = new ArrayList<>();
    for(int i = 1; i <= 5; i++){
      Member member = Member.builder()
          .userNo(Long.valueOf(i))
          .userPw("1234")
          .userId("user" + i)
          .userNm("사용자" + i)
          .email("user" + i + "@test.org")
          .regDt(LocalDateTime.now())
          .build();
      members.add(member);
    }
    model.addAttribute("members", members);

    return "member/list";
  }

//  @InitBinder
//  protected void initBinder(WebDataBinder binder){
//    binder.setValidator(joinValidator);
//  }
}
