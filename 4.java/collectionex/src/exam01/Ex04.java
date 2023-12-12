package exam01;

import java.util.Vector;

public class Ex04 {
  public static void main(String[] args) {
    Vector<String> names = new Vector<>(3);
    names.add("이름1");
    names.add("이름2");
    names.add("이름3");
    names.add("이름4");//배열 수를 넘어서면 2배로
    System.out.println("capacity : " + names.capacity());
  }
}
