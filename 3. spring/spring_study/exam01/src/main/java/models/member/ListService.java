package models.member;

import java.util.List;

public class ListService {
  private MemberDao memberDao;
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
