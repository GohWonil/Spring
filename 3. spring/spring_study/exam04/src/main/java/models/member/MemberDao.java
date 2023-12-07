package models.member;

import config.ManualBean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//@ManualBean
@Repository
public class MemberDao {
  private static Map<String, Member> members = new HashMap<>();
  //가입 여부
  public void register(Member member){
    members.put(member.getUserId(), member);
  }
  //아이디 존재 여부
  public boolean exists(String userId){
    return members.containsKey(userId);
  }
  //저장된 회원 목록
  public List<Member> getlist(){
    return new ArrayList<>(members.values());
  }
}
