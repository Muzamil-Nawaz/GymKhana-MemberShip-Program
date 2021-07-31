package gymkhanamembership;

import java.util.ArrayList;

public class MemberFactory {
    static ArrayList<Member> members = new ArrayList();
    public static Member createMembership(String type){
        Member m=null;
        if(type=="LTMember"){
            m = new LTMember(type);
            members.add(m);
            return m;
        }
        else if(type== "AnnualMember"){
            m = new AnnualMember(type);
            members.add(m);
            return m;
        }
        else if(type == "TempMember"){
            m = new TemporaryMember(type);
            members.add(m);
            return m;
        }
        else
            return m;
    }
}
