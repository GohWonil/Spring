package exam01;

public class Ex03 {
  public static void main(String[] args) {
    Calculator cal = x -> x * x;//인터페이스를 통해 반환값을 알수 있다.

    int result = cal.square(10);
    System.out.println(result);
  }
}
