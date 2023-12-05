package models.member;

import commons.exceptions.BadRequestException;
import commons.valdators.RequiredValidator;
import commons.valdators.Valdator;



public class JoinValidator implements Valdator<Member>, RequiredValidator {
  public void validate(Member member){
    //필수 항목 검증(아이디, 비밀번호, 비밀번호 확인, 회원명)
    String userId = member.getUserId();
    String userPw = member.getUserPw();
    String confirmPw = member.getConfirmPw();
    String userNm = member.getUserNw();

    //필수 항목 - null 또는 빈 공 백 문자 " "
//    if(userId == null || userId.isBlank()){
//      throw new BadRequestException("아이디를 입력하세요");
//    }
//    if (userPw == null || userPw.isBlank()){
//      throw new BadRequestException("비밀번호를 입력하세요");
//    }

    //위의 문장을 RequiredValidator 를 이용해 한줄로 표현
    checkRequired(userId, new BadRequestException("아이디를 입력하세요."));
    checkRequired(userPw, new BadRequestException("비밀번호를 입력하세요."));
    checkRequired(confirmPw, new BadRequestException("비밀번호를 확인하세요."));
    checkRequired(userNm, new BadRequestException("회원명을 입력하세요."));
  }
}
