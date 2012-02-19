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
// CREDITS FOR THIS CODE GOES TO: Lars Vogel  http://www.vogella.de/articles/JavaXML/article.html

/*
 * This object is the basic team object for everything. For extended usage of this
 * object in a match use MatchTeamObject
 * 
 */
public class TeamObject extends TeamLabelObject implements Serializable{

    private int idnumber;
    private String id;
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
        idnumber = Integer.parseInt(id);
        this.id = id;
        
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
        if (getTeamNumb().length() == 1) {
            spacereturnlength = "          ";
        } else if (getTeamNumb().length() == 2) {
            spacereturnlength = "           ";
        } else if (getTeamNumb().length() == 3) {
            spacereturnlength = "             ";
        } else if (getTeamNumb().length() == 4) {
            spacereturnlength = "              ";
        } else if (getTeamNumb().length() == 5) {
            spacereturnlength = "               ";
        }
        return (getIdNumber()+1) + "              " + (getTeamNumb()) + (getTeamLetter()) + spacereturnlength + teamname;
    }

    @Override
    public String toString() {
        return "Item [ID=" + id + ", Team Name=" + teamname + ", Location="
                + location + ", Team Number=" + getTeamNumb() + ", Team Letter=" + (getTeamLetter()) + ", RobotName=" + robotname + "]";
    }
}