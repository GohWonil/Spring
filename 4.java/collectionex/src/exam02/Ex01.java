package exam02;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {
  public static void main(String[] args) {
    Set<String> names = new TreeSet<>();
    names.add("이름1");
    names.add("이름2");
    names.add("이름2"); //중복이 알아서 제거된다.
    names.add("이름3");
    names.add("이름4");
    names.add("이름5");

    System.out.println(names);
  }
}
