package exam01;
import static exam01.Transportation.*;

public class Ex01 {
  public static void main(String[] args) {
    Transportation bus = Transportation.BUS; //import Transportation.* 할 경우 Transportation. 생략가능
    System.out.println(BUS == Transportation.BUS);
    System.out.printf("ordinal: %d, name: %s%n", bus.ordinal(), bus.name());
  }
}
