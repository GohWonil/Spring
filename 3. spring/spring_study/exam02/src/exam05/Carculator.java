package exam05;

public interface Carculator {
  int num = 10; //public static final 앞쪽 생략
  int add(int num1, int num2); //앞에 public abstract 생략
//  return num1 + num2; 인터페이스는 설계만을 목적으로 만들어진다.

  default int minus(int num1, int num2){
  return num1 - num2; //하지만 default 값을 앞에 주게되면 구현체에서 오버라이드할 필요가 없고, 기본적으로 사용
  }
}
