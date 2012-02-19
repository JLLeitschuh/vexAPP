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

    private int getTeamNumb;
    private String teamnumb;
    private String teamletter;

    public void setTeamNumber(int TEAMNUMBER) {
        this.getTeamNumb = TEAMNUMBER;
        this.teamnumb = Integer.toString(TEAMNUMBER);
    }

    public void setTeamNumber(String TEAMNUMB) {
        this.getTeamNumb = Integer.parseInt(TEAMNUMB);
        this.teamnumb = TEAMNUMB;
    }

    public int getTeamNumber() {
        return getTeamNumb;
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
}
