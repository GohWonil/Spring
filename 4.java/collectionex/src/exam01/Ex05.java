package exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex05 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();

    names.add("이름1");
    names.add("이름2");
    names.add("이름3");
    names.add("이름4");
    names.add("이름5");

    //커서를 이동해서 반복은 1번만 가능하다.
    Iterator<String> iter = names.iterator();

    while (iter.hasNext()) {
      String name = iter.next();
      System.out.println(name);
    }
    //iter를 추가하면 반복을 한번 더 가능
    iter = names.iterator();

    while (iter.hasNext()) {
      String name = iter.next();
      System.out.println(name);
    }
  }
}
