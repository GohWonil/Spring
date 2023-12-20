package models.member;

import commons.CommonException;
import org.springframework.http.HttpStatus;

public class MemberNotFoundException extends CommonException {

  public MemberNotFoundException(){
    super("등록회원아님", HttpStatus.NOT_FOUND); //404
  }
}
