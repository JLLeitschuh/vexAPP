/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author jonathanleitschuh
 */
public class TeamLabelObject {

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
}
