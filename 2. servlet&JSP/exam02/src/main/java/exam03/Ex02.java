package exam03;

public class Ex02 {
    public static void main(String[] args) {
        C c = new C(); // C -> C, B , A 이것이 다형성
        A a = c;
        B b = c;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
