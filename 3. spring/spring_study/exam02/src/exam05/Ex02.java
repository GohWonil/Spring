package exam05;

public class Ex02 {
  public static void main(String[] args) {
    Carculator cal = new Carculator() {
      @Override
      public int add(int num1, int num2) {
        return num1 + num2;
      }
    };

    Carculator cal2 = (a,b) -> a + b;
  }
}
