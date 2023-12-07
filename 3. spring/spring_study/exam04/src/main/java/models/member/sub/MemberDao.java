package models.member.sub;

import org.springframework.stereotype.Repository;

@Repository("memberDao2")//memberDao가 있기때문에 이름을 바꿔 memberDao2로 변경
public class MemberDao { //memberDao로 클래스 명이 동일하게 인식하게되어 문제가 발생할 수 있다. 그러므로 @레포지토리 이름을 바꾸면 된다.
}
