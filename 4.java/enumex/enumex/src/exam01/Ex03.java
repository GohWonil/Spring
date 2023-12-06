package exam01;

public class Ex03 {
  public static void main(String[] args) {
    String str = "TAXI";
    Transportation trans = Enum.valueOf(Transportation.class, str);
    System.out.println(trans);

    //위와 같이느 짧은 코드
    Transportation trans2 = Transportation.valueOf(str);
    System.out.println(trans == trans2);
  }
}
