package gymkhanamembership;

public class MemberShipManager{
    static Member m=null;
    public static void main(String[] args) {
       m =MemberFactory.createMembership("AnnualMember");
       m.register("AnnualMember");
       m.notifyMember();
       m.savePersonalInfo();
       m =MemberFactory.createMembership("TempMember");
       m.register("TempMember");
       m.notifyMember();
       m.savePersonalInfo();
      
    }
    
}
