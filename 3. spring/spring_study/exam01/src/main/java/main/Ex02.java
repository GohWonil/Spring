package main;

import models.Greeter;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex02 {

  public static void main(String[] args) {
    Class cls = Greeter.class; //클래스 정보가 담겨 있는 객체

    Method[] methods = cls.getMethods();
    for (Method method : methods) {
      System.out.println(method);
    }
    int result1 = add(10, 20);
    System.out.println(result1);

    int result2 = add(30, 40);
    System.out.println(result2);

  }

  public static int add(int num1, int num2) {
    return num1 + num2;
  }


  public static int add(int... nums) {
        /*
       int total = 0;
       for (int num : nums) {
           total += total;
       }
       */
    int total = Arrays.stream(nums).sum();
    return total;
  }
}