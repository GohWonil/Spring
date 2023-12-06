package models.member;

public class ServiceManager {
  private static ServiceManager instace = null;//new ServiceManager();
  private ServiceManager(){}
  public static ServiceManager getInstance(){
    if(instace == null){
      instace = new ServiceManager();
    }
    return instace;
  }

  public MemberDao memberDao(){
    return new CachedMemberDao();
  }
  public JoinValidator joinValidator(){
    return new JoinValidator(memberDao());
  }
  public JoinService joinService(){
    return new JoinService(memberDao(), joinValidator());
  }
  public ListService listService(){
    ListService listService = new ListService();
    listService.setMemberDao(memberDao());

    return listService;
  }
}
