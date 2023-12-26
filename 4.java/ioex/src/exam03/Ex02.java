package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {
  public static void main(String[] args) throws IOException {
    System.out.print("아무거나 입력 : ");
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    char ch = (char)br.read();
    System.out.println(ch);
  }
}
