package exam;

public class Ex01 {
  public static void main(String[] args) {
    //C-> B -> A
    //this: 지역변수 -> 참조 변수
    //this() : 생성자 메서드
    
    //super : 지역 변수 - 상위 클래스의 객체의 참조 변수
    //super() : 상위 클래스 생성자 메서드
    //C() -> super() : B() -> super() : A()
    
    //생성자 함수(메소드) - 객체를 생성하는 역할(메모리에 필요한 자원을 위한 공강 할당)
    C c = new C(); //C, B, A
    A a = c;
    B b = c;
  }
}
