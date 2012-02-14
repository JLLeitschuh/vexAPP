/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data.teamData;

/**
 *
 * @author jonathanleitschuh
 */
// CREDITS FOR THIS CODE GOES TO: Lars Vogel  http://www.vogella.de/articles/JavaXML/article.html

import Objects.TeamObject;
import java.util.List;


public class TeamTestRead2 {
	public static void main(String args[]) {
		TeamStaXParser read = new TeamStaXParser();
		List<TeamObject> readConfig = read.readConfig("src/Data/teamData/teams/masterTeamList.xml");
                System.out.println(readConfig.get(1).getTeamName());
                
                /*
                for (TeamObject item : readConfig) {
                    System.out.println(item);
		}
                */
	}
}