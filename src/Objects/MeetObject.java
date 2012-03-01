/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jonathanleitschuh
 */
public class MeetObject extends Date implements Serializable {
    private String name;
    private String eventcode;
    public ArrayList<MatchTeamObject> teams;
    
    public void setName(String NAME){
        this.name = NAME;
    }
    public String getName(){
        return name;
    }
    
    
    public void setEventCode(String CODE){
        this.name = CODE;
    }
    public String getEventCode(){
        return eventcode;
    }
}