package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "이름1", "과목1");

        Student s2 = s1;
        s2.setId(2000);
        s2.setName("이름2");
        s2.setSubject("과목2");

    }
}
