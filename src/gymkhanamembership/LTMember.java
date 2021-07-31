/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymkhanamembership;

/**
 *
 * @author ADMIN
 */
public class LTMember extends Member{
    String type;
    LTMember(String type){
        this.type = type;
    }

    @Override
    public void notifyMember() {
        
        System.out.println("Member Notified :"+this.type);
    }

    @Override
    public void register(String type) {
    
        System.out.println("Member Registered :"+type);
    }

    @Override
    public void savePersonalInfo() {
        System.out.println("Personal Info Gathered :"+this.type);
    }
    
}
