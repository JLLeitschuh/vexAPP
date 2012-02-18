/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author jonathanleitschuh
 */
// CREDITS FOR THIS CODE GOES TO: Lars Vogel  http://www.vogella.de/articles/JavaXML/article.html

/*
 * This object is the basic team object for everything. For extended usage of this
 * object in a match use MatchTeamObject
 * 
 */
public class TeamObject {

    private int idnumber;
    private String id;
    private String teamnumber;
    private String teamletter;
    private String teamname;
    private String location;
    private String robotname;
    private String spacereturnlength;

    public String getId() {
        return id;
    }

    public int getIdNumber() {
        idnumber = Integer.parseInt(id);
        return idnumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTeamNumber() {
        return teamnumber;
    }

    public void setTeamNumber(String teamnumber) {
        this.teamnumber = teamnumber;
    }

    public String getTeamLetter() {
        return teamletter;
    }

    public void setTeamLetter(String teamletter) {
        this.teamletter = teamletter;
    }

    public String getTeamName() {
        return teamname;
    }

    public void setTeamName(String teamname) {
        this.teamname = teamname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRobotName() {
        return robotname;
    }

    public void setRobotName(String robotname) {
        this.robotname = robotname;
    }

    public String getTeamList() {
        if (teamnumber.length() == 1) {
            spacereturnlength = "          ";
        } else if (teamnumber.length() == 2) {
            spacereturnlength = "           ";
        } else if (teamnumber.length() == 3) {
            spacereturnlength = "             ";
        } else if (teamnumber.length() == 4) {
            spacereturnlength = "              ";
        } else if (teamnumber.length() == 5) {
            spacereturnlength = "               ";
        }
        return (getIdNumber()+1) + "              " + teamnumber + teamletter + spacereturnlength + teamname;
    }

    @Override
    public String toString() {
        return "Item [ID=" + (getIdNumber()+1) + ", Team Name=" + teamname + ", Location="
                + location + ", Team Number=" + teamnumber + ", Team Letter=" + teamletter + ", RobotName=" + robotname + "]";
    }
}