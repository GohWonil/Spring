package exam01;

import java.util.function.Function;

public class Ex08 {
  public static void main(String[] args) {
    Function<String, Integer> func1 = s -> s.length();

    Function<Integer, Integer> func2 = x -> x * x * x;

    Function<String, Integer> func3 = func1.andThen(func2); //andThen 함수의 결합

    int num =  func3.apply("ABC");
    System.out.println(num);

    Function<Integer, Integer> func4 = x -> x; //fun4,5는 동일한 의미
    Function<Integer, Integer> func5 = Function.identity();

  }
}
