package models.member;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data @Builder
public class Member {
  private String userId;
  private String userPw;
  private String confirmPw;
  private String userNw;
  private LocalDateTime regDt;
}
