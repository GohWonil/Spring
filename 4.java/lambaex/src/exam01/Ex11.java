package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Ex11 {
  public static void main(String[] args) {
//    Supplier<Book> book = () -> new Book(); 더 짧게 아래
    Supplier<Book> book = Book::new; //더 짧게 아래

    List<String> names = Arrays.asList("이름1","이름2","이름3");
//    String[] names2 = names.stream().toArray(i -> new String[i]); 더 짧게 아래
    String[] names2 = names.stream().toArray(String[]::new);
  }
}
