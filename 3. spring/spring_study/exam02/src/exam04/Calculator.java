package exam04;

public abstract class Calculator {
  int num = 10;
  public abstract int add(int num1, int num2);

  public void commonMethod(){
    System.out.println("하위 클래스의 공통 기능");
  }
}
//추상메서드의 재구성 및 클래스의 공통 기능을 위해서 추상 메서드를 쓴다.