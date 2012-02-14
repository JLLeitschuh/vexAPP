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

public class TeamObject {
        private int idnumber;
	private String id;
	private String teamnumber;
	private String teamletter;
	private String teamname;
	private String location;
        private String robotname;
	
	public String getId() {
		return id;
	}        
        public int getIdNumber(){
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
        public String getTeamList(){
            if(teamnumber.length()== 1)
            {
                return "  " + id + "            " + teamnumber + teamletter + "          " + teamname;
            }
            else if(teamnumber.length()== 2)
            {
                return "  " + id + "            " + teamnumber + teamletter + "           " + teamname;
            }
            else if(teamnumber.length()== 3)
            {
                return "  " + id + "            " + teamnumber + teamletter + "            " + teamname;
            }
            else if(teamnumber.length()== 4)
            {
                return "  " + id + "            " + teamnumber + teamletter + "             " + teamname;
            }
            else{
                return null;
            }
        }

	@Override
	public String toString() {
		return "Item [ID=" + id + ", Team Name=" + teamname + ", Location="
				+ location + ", Team Number=" + teamnumber + ", Team Letter=" + teamletter + ", RobotName=" + robotname +"]";
	}
        
}