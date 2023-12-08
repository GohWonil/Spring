package exam01;

import java.sql.*;

public class Ex02 {
  public static void main(String[] args) throws ClassNotFoundException {
    Class.forName("oracle.jdbc.driver.OracleDriver"); //동적 로딩
    String url = "jdbc:oracle:thin:@localhost:1521:orcl";
    String username = "SPRING6";
    String password = "_aA123456";

    try (Connection conn = DriverManager.getConnection(url, username, password);
      Statement stmt = conn.createStatement()) {
      //정적쿼리 - 보안에 취약하다 쓸일 없을듯 동적 쿼리 PreparedStatement 쓰자 ?써서 사용


      String sql = "INSERT INTO MEMBER(USER_NO, USER_ID, USER_PW, USER_NM, EMAIL) " +
          "VALUES (SEQ_MEMBER.nextval, 'USER01', '123456', '사용자01', 'USER01@TEST.org')";
      int result = stmt.executeUpdate(sql);
      System.out.println(result);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
