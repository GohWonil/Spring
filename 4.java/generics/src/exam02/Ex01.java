package exam02;

public class Ex01 {
  public static void main(String[] args) {
    Box<Apple> appleBox = new Box<>();//뒷쪽 Box<Apple 생략 가능>
    appleBox.setItem(new Apple());
//    appleBox.setItem(new Pear());//타입 안정성 확보
//    Apple apple = appleBox.getItem();

    Box<Pear> pearBox = new Box<>();
  }
}
