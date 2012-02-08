/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiFrames.Data.teamData;

/**
 *
 * @author jonathanleitschuh
 */
// CREDITS FOR THIS CODE GOES TO: Lars Vogel  http://www.vogella.de/articles/JavaXML/article.html

import guiFrames.Data.teamData.*;
import java.util.List;


public class TeamTestRead {
	public static void main(String args[]) {
		TeamStaXParser read = new TeamStaXParser();
		List<TeamItem> readConfig = read.readConfig("src/guiFrames/Data/teamData/teams/masterTeamList.xml");
		for (TeamItem item : readConfig) {
			System.out.println(item.getId() + " " + item.getTeamNumber() + item.getTeamLetter());
		}
	}
}