package models.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class ListService {
  private MemberDao memberDao;
  @Autowired
  public void setMemberDao(MemberDao memberDao){
    this.memberDao = memberDao;
  }
  public void print(){
    List<Member> members = memberDao.getlist();
    for (Member member : members){
      System.out.println(member);
    }
  }
}
