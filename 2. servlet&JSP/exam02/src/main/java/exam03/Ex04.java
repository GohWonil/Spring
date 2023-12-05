package exam03;

public class Ex04 {
    public static void main(String[] args) {
        A a = new D();
        A b = new C();
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);
        System.out.println(a instanceof D);
        System.out.println(b instanceof D);
    }
}
