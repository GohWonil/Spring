package main;

public class Ex05 {
  public static void main(String[] args) {
    try {
      int num1 = 10;
      int num2 = 0;
      int result = num1 / num2; //throw new ArithmeticException();

    } catch (ArithmeticException e){ // = new ArithmeticException();
      e.printStackTrace();
      System.out.println("ArithmeticException 예외처리");

    } finally {
      System.out.println("매우 중요한 실행 코드");
    }


    // ArithmeticException -> RuntimeException : 실행 중 체크되는 예외
    // 실행이 되려면 -> 컴파일 필요 -> 컴파일은 된다.
    // 예외처리 목적은 서비스 중단을 막기 위한 처리

    //처리는 ?
//    try {
//      //예외가 발생할 가능성이 있는 코드
//    }  catch (예외 객체){
//      //예외에 대한 후속 처리
//    }

    //Exception : 컴파일 시점에 예외를 체크 -> 이상 -> 컴파일X
    // (엄격한 예외, 형식 중요! - 예외가 있던 없던 무조건 예외처리가 필요)

    //RuntiomeException: 실행 중에 예외를 체크 -> 실행이 되려면? 컴파일이 o -> 컴파일 o
    // ( 유연한 예외, 예외가 발생하는 상황이더라도 싫행된다 -> 예외 발생 -> 중단)
    // 서비스 중단을 막기 위해 적절한 예외 처리가 필요



  }
}
