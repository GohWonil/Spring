package controllers.member;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
@Component
public class JoinValidator implements Validator {
  @Override
  public boolean supports(Class<?> clazz) { //검증 커맨드 객체를 제한
    return clazz.isAssignableFrom(RequestJoin.class);
  }

  /**
   * 실제로 검증을 수행할 메서드
   * @param target 검증할 커맨드 객체
   * @param errors 검증 실패시 에러 정보 제공
   */
  @Override
  public void validate(Object target, Errors errors) {
    /**
     * 1.필수 항목 검증(userId, userPw, confirmPw, userNm, agree)   @NotBlank 사용 agree 는   @AssertTrue 사용
     * 2. 중복 아이디 여부 체크         개발자가 직접해야함
     * 3. 아이디 최소 자리수 체크 (6자리)   @Size(min=6)
     * 4. 비밀번호 최소 자리수 체크 (8자리)   @Size(min=8)
     * 5. 이메일 값은 필수는 아니지만 값이 있으면 형식 체크   @Email
     * 6. 비밀번호, 비밀번호 확인 일치여부          개발자가 직접해야함
     */
    RequestJoin form = (RequestJoin) target;
    String userPw = form.getUserPw();
    String confirmPw = form.getConfirmPw();

    if(StringUtils.hasText(userPw) && StringUtils.hasText(confirmPw) && !userPw.equals(confirmPw)){
      errors.rejectValue("confirmPw", "Mismatch");
    }
    //방법 1
//    String userId = form.getUserId();
//    String userPw = form.getUserPw();
//    String confirmPw = form.getConfirmPw();
//    String userNw = form.getUserNm();
//    boolean agree = form.isAgree();
//
////    if(userId == null || userId.isBlank()){
////
////    } //같은 말로 아래로 쓸수도있다
//    if(!StringUtils.hasText(userId)){
//      errors.rejectValue("userId", "Required", "아이디를 입력하세요");
//
//    }
//
//    if(!StringUtils.hasText(userPw)){
//      errors.rejectValue("userPw", "Required", "비밀번호를 입력하세요");
//
//    }
//    if(!StringUtils.hasText(confirmPw)){
//      errors.rejectValue("confirmPw", "Required", "비밀번호를 확인하세요");
//
//    }

    //방법2
//    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "Required");
//    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userPw", "Required");
//    ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPw", "Required");

    //사용 제일 많이함
//  @NotBlank 사용으로 끝
  }
}
