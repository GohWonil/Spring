package exam01;

import com.sun.jdi.IntegerValue;

public class Ex03 {
  public static void main(String[] args) {
    int num1 = 100;
    Integer num2 = Integer.valueOf(200);

    int num3 = num1 + num2;
    System.out.println(num3);
  }
}
