package proxyex;

public class ImplCalculator implements Calculator{ //단순 반복문
  @Override
  public long factorial(long num) {
    long total = 1L;

    for(long i = 1L; i <= num; i++){
      total *= i;
    }

    return total;
  }
}
