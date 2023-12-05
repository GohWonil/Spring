package commons.valdators;

public interface RequiredValidator {
  default void checkRequired(String str, RuntimeException e){
    if(str == null || str.isBlank()){ //isBlank :  문자열이 비어 있거나 공백 문자로만 구성되어 있는지 확인하는 메서드
      throw e;
    }
  }
}
