/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymkhanamembership;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public abstract class Member {
    String type;
    public abstract void register(String type);
    public abstract void notifyMember();
    public abstract void savePersonalInfo();

}
