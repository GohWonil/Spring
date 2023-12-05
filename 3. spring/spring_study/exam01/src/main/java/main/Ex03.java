package main;

import java.util.Arrays;

public class Ex03 {
  public static void main(String[] args) {
    int result = add(10,20);
    int resilt2 = add(10,20,30,40);
  }

  public static int add(int num1, int num2){
    return num1 + num2;
  }
  public static int add(int num1, int num2, int num3){
    return num1 + num2 + num3;
  }
  public static int add(int... nums){ // ... : 가변 매개변수
    int total = 0;
    for(int num : nums)
      total += total;
    return total;
  }
}
