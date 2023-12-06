package exam01;

import java.util.Optional;

public class Ex05 {
  public static void main(String[] args) {
    //Optional 클래스는 wrapper 또는 NPE 널포인트오류를 처리하기 위해 사용

    String str = "값";
//    Optional<String> opt = Optional.of(str); 값이 null이면 예외 발생
    Optional<String> opt = Optional.ofNullable(str);
    //String str2 = opt.get(); //값이 없으면 예외 발생

    //방법1
    String str2 = opt.orElse("기본값");//null값 처리함수 orElse

    //방법2
    if(str2 == null){
      throw new RuntimeException("값이 없음 예외 발생");
    }//null값의 다른 방식 RuntimeException

    //방법3
//    String str3 = opt.orElseThrow();//NoSuchElementException 발생

    //방법4
    String str4 = opt.orElseThrow(() -> new RuntimeException("값이없음"));

    System.out.println(str2);
//    System.out.println(str3);
    System.out.println(str4);

  }
}
