package proxyex;

public class RecCalculator implements Calculator{ // 재귀방식
  @Override
  public long factorial(long num) {
    if(num < 1L){
      return 1L;
    }
    return num * factorial(num - 1L);
  }
}
