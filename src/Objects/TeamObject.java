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
public class TeamObject extends TeamLabelObject implements Serializable, Cloneable{

    private int idnumber;
    private String id;
    private String teamname;
    private String location;
    private String robotname;
    private String comment;
    private String spacereturnlength;
    
    public void setTeamObject(TeamObject t){
        this.setTeamNumber(t.getTeamNumber());
        this.setTeamNumber(t.getTeamNumb());
        this.setTeamLetter(t.getTeamLetter());
        idnumber = t.getIdNumber();
        teamname = t.getTeamName();
        location = t.getLocation();
        robotname= t.getRobotName();
        comment = t.getTeamComment();
    }
    
    public String getTeamComment() {
        return comment;
    }

    public void setTeamComment(String Comment) {
        this.comment = Comment;
    }

    public String getId() {
        return id;
    }

    public int getIdNumber() {
        return idnumber;
    }

    public void setId(String ID) {
        this.idnumber = Integer.parseInt(ID);
        this.id = ID;
    }
    public void setId(int IDN) {
        this.idnumber = IDN;
        this.id = Integer.toString(IDN);
    }
    public String getTeamName() {
        return teamname;
    }

    public void setTeamName(String TEAMNAME) {
        this.teamname = TEAMNAME;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String LOCATION) {
        this.location = LOCATION;
    }

    public String getRobotName() {
        return robotname;
    }

    public void setRobotName(String ROBOTNAME) {
        this.robotname = ROBOTNAME;
    }
    
    public String getTeamShortListNumb(){
        return (getTeamNumb() + " " + getTeamLetter() + " " + teamname);
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
    public String getTeamShortList(){
        return (teamname + " " + getTeamNumb() + getTeamLetter());
    }

    @Override
    public String toString() {
        return "Item [ID=" + id + ", Team Name=" + teamname + ", Location="
                + location + ", Team Number=" + getTeamNumb() + ", Team Letter=" + (getTeamLetter()) + ", RobotName=" + robotname + "]";
    }
}