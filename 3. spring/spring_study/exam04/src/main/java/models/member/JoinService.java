package models.member;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor //final을 붙이면 작동됨 하지만 상수가 된다.
public class JoinService {  //빈의 이름 joinService
//@Autowired
//  private MemberDao memberDao;
  private final MemberDao memberDao;
//@Autowired
//  private JoinValidator validator;
  @NonNull //생성자 매개변수가 추가되어 사용 가능
  private JoinValidator validator;

//  public JoinService(MemberDao memberDao, JoinValidator validator){ //@Autowired 대신 메소드를 만들어도 메인이 작동함
//    this.memberDao = memberDao;
//    this.validator = validator;
//  }
  public void join(Member member){
    //데이터 검증
    validator.validate(member);
    //데이터 추가
    memberDao.register(member);
  }

}
