package exam01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex01 {
  public static void main(String[] args) throws ClassNotFoundException{
    Class.forName("oracle.jdbc.driver.OracleDriver"); //동적 로딩

    String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    String username = "SPRING6";
    String password = "_aA123456";

    Connection conn = null;
    try {
      conn = DriverManager.getConnection(url, username, password);
      System.out.println("DB연결 성공");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally { // 예외가 발생하든 하지 않든 무조건 실행 - 예) 자원해제
      if (conn != null) {
        try {
          conn.close();
          System.out.println("자원반납 성공");
        } catch (SQLException e2) {}
      }
    }
  }
}
