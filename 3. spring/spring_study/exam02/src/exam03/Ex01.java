package exam03;

public class Ex01 {
  public static void main(String[] args) {
    Human human = new Human(); //Human -> Animal도 가능 : 다형성
    human.move();

    Animal dog = new Dog(); //Animal도 가능 : 다형성
    dog.move();

    Bird bird = new Bird(); //Bird  -> Animal도 가능 : 다형성
    bird.move();
  }
}
