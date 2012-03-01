/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.io.Serializable;

/**
 *
 * @author jonathanleitschuh
 */
public class TeamLabelObject implements Serializable{

    private int teamnumber;
    private String teamnumb;
    private String teamletter;

    public void setTeamNumber(int TEAMNUMBER) {
        this.teamnumber = TEAMNUMBER;
        this.teamnumb = Integer.toString(TEAMNUMBER);
    }

    public void setTeamNumber(String TEAMNUMB) {
        this.teamnumber = Integer.parseInt(TEAMNUMB);
        this.teamnumb = TEAMNUMB;
    }

    public int getTeamNumber() {
        return teamnumber;
    }

    public String getTeamNumb() {
        return teamnumb;
    }
    public String getTeamLetter() {
        return teamletter;
    }

    public void setTeamLetter(String teamletter) {
        this.teamletter = teamletter;
    }
    
    @Override
    public String toString(){
        return teamnumb + " " + teamletter;
    }
            
}
