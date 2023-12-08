package exam04;

public class Student {
  static int id;
  String name;
  String subject;

  public Student(int id, String name, String subject) {
    this.id = id;
    this.name = name;
    this.subject = subject;
  }

  public static void staticMethod(){
    System.out.println("정적 메서드");
    id = 1000; //id는 static으로 선언되어 접근이 가능하며 this가 없다.
  }

  @Override
  public String toString() {
    return "Student{" + "id=" + id + ", name='" + name + '\'' + ", subject='" + subject + '\'' + '}';
  }
}
