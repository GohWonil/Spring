package exam03;

public class Human extends Animal{
  @Override
  public void move(){
    System.out.println("두발로 걷는다.");
  }
  public void readBook(){
    System.out.println("책을 읽는다.");
  }

}
