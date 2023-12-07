package commons.valdators;

import org.springframework.util.StringUtils;

public interface RequiredValidator {
  default void checkRequired(String str, RuntimeException e) {
    //if(str == null || str.isBlank()){ //isBlank :  문자열이 비어 있거나 공백 문자로만 구성되어 있는지 확인하는 메서드
    if (!StringUtils.hasText(str)) {
      throw e;
    }
  }

    //참이 아닐때 예외 발생
    default void checkTrue(boolean result, RuntimeException e){
      if(!result){
        throw e;
      }
    }

    //참일때 예외 발생
    default void checkFalse(boolean result, RuntimeException e){
      if(result){
        throw e;
      }
    }
}
