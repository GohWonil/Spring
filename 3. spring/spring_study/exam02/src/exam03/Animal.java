package exam03;

public abstract class Animal{
  public abstract void move(); //최종적으로 호출이 되지 않으므로 추상클래스로 지정하는게 더 적합하다
}

//public class Animal {
//  public void move(){
//    System.out.println("움직인다"); //상수처리: 모두가 사용가능
//  }
//}
