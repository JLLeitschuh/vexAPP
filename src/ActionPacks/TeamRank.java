/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import Objects.MatchObject;
import Objects.TeamObject;
import Objects.TeamRankedObject;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.ClassNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonathanleitschuh
 */
public class TeamRank {

    private ArrayList<TeamRankedObject> rankMe = new ArrayList<TeamRankedObject>();
    private ArrayList<MatchObject> in = null;

    public TeamRank() {
        matchReader read = new matchReader();
        try {
            in = read.readMatchObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeamRank.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void rank() {
        teamNameReader teams = new teamNameReader();
        ArrayList<TeamObject> team = null;
        try {
            team = teams.readTeamNameObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TeamRank.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (TeamObject t : team) {
            TeamRankedObject newRanked = new TeamRankedObject();
            newRanked.setId(t.getId());
            newRanked.setTeamName(t.getTeamName());
            newRanked.setTeamNumber(t.getTeamNumber());
            newRanked.setTeamLetter(t.getTeamLetter());
            rankMe.add(newRanked);
        }

        for (TeamObject t : team) {
            for (MatchObject p : in) {

                if (p.blue.interaction.getIdNumber() == t.getIdNumber()) {
                    
                    
                    Boolean teamOne = p.blue.interaction.getDisqualified();
                    Boolean teamRedOne = p.red.interaction.getDisqualified();
                    Boolean teamRedTwo = p.red.isolation.getDisqualified();
                    Boolean redOut = false;
                    if ((teamRedOne == true) && (teamRedTwo == true)) {
                        redOut = true;
                    }
                    
                    
                    TeamRankedObject newRanked = new TeamRankedObject();
                    rankMe.ensureCapacity(p.blue.interaction.getIdNumber());
                    try{
                        newRanked = rankMe.get(p.blue.interaction.getIdNumber());
                    } catch (Error e) {
                        newRanked = new TeamRankedObject();
                    }
                    
                    
                    newRanked.setId(p.blue.interaction.getIdNumber());
                    newRanked.setTeamName(p.blue.interaction.getTeamName());
                    newRanked.setTeamNumber(p.blue.interaction.getTeamNumber());
                    newRanked.setTeamLetter(p.blue.interaction.getTeamLetter());
                    newRanked.setRobotName(p.blue.interaction.getRobotName());
                    newRanked.addScore(p.blue.interaction.getScore(), p.red.getScore(), teamOne, redOut);
                    if (p.blue.interaction.getAutonomous() == true) {
                        newRanked.addInteractionAuton(p.blue.interaction.getAutonomousScore());
                    }
                    if (p.blue.interaction.getSuperiorRobot() == true){
                        newRanked.addSuperiorRobot();
                    }
                    rankMe.set(p.blue.interaction.getIdNumber(), newRanked);

                } else if (p.blue.isolation.getIdNumber() == t.getIdNumber()) {
                    Boolean teamOne = p.blue.isolation.getDisqualified();
                    Boolean teamRedOne = p.red.interaction.getDisqualified();
                    Boolean teamRedTwo = p.red.isolation.getDisqualified();
                    Boolean redOut = false;
                    if ((teamRedOne == true) && (teamRedTwo == true)) {
                        redOut = true;
                    }
                    
                    TeamRankedObject newRanked = new TeamRankedObject();
                    rankMe.ensureCapacity(p.blue.isolation.getIdNumber());
                    try{
                        newRanked = rankMe.get(p.blue.isolation.getIdNumber());
                    } catch (Error e) {
                        newRanked = new TeamRankedObject();
                    }
                    
                    newRanked.setId(p.blue.isolation.getIdNumber());
                    newRanked.setTeamName(p.blue.isolation.getTeamName());
                    newRanked.setTeamNumber(p.blue.isolation.getTeamNumber());
                    newRanked.setTeamLetter(p.blue.isolation.getTeamLetter());
                    newRanked.setRobotName(p.blue.isolation.getRobotName());
                    newRanked.addScore(p.blue.isolation.getScore(), p.red.getScore(), teamOne, redOut);
                    if (p.blue.isolation.getAutonomous() == true) {
                        newRanked.addInteractionAuton(p.blue.isolation.getAutonomousScore());
                    }
                    if (p.blue.isolation.getSuperiorRobot() == true){
                        newRanked.addSuperiorRobot();
                    }
                    rankMe.set(p.blue.isolation.getIdNumber(), newRanked);

                } else if (p.red.interaction.getIdNumber() == t.getIdNumber()) {
                    Boolean teamOne = p.red.interaction.getDisqualified();
                    Boolean teamRedOne = p.blue.interaction.getDisqualified();
                    Boolean teamRedTwo = p.blue.isolation.getDisqualified();
                    Boolean redOut = false;
                    if ((teamRedOne == true) && (teamRedTwo == true)) {
                        redOut = true;
                    }
                    
                    TeamRankedObject newRanked = new TeamRankedObject();
                    rankMe.ensureCapacity(p.red.interaction.getIdNumber());
                    try{
                        newRanked = rankMe.get(p.red.interaction.getIdNumber());
                    } catch (Error e) {
                        newRanked = new TeamRankedObject();
                    }
                    
                    newRanked.setId(p.red.interaction.getIdNumber());
                    newRanked.setTeamName(p.red.interaction.getTeamName());
                    newRanked.setTeamNumber(p.red.interaction.getTeamNumber());
                    newRanked.setTeamLetter(p.red.interaction.getTeamLetter());
                    newRanked.setRobotName(p.red.interaction.getRobotName());
                    newRanked.addScore(p.red.interaction.getScore(), p.blue.getScore(), teamOne, redOut);
                    if (p.red.interaction.getAutonomous() == true) {
                        newRanked.addInteractionAuton(p.red.interaction.getAutonomousScore());
                    }
                    if (p.red.interaction.getSuperiorRobot() == true){
                        newRanked.addSuperiorRobot();
                    }
                    
                    rankMe.set(p.red.interaction.getIdNumber(), newRanked);;

                } else if (p.red.isolation.getIdNumber() == t.getIdNumber()) {
                    Boolean teamOne = p.red.isolation.getDisqualified();
                    Boolean teamRedOne = p.blue.interaction.getDisqualified();
                    Boolean teamRedTwo = p.blue.isolation.getDisqualified();
                    Boolean redOut = false;
                    if ((teamRedOne == true) && (teamRedTwo == true)) {
                        redOut = true;
                    }
                    
                    TeamRankedObject newRanked = new TeamRankedObject();
                    rankMe.ensureCapacity(p.red.isolation.getIdNumber());
                    try{
                        newRanked = rankMe.get(p.red.isolation.getIdNumber());
                    } catch (Error e) {
                        newRanked = new TeamRankedObject();
                    }
                    
                    newRanked.setId(p.red.isolation.getIdNumber());
                    newRanked.setTeamName(p.red.isolation.getTeamName());
                    newRanked.setTeamNumber(p.red.isolation.getTeamNumber());
                    newRanked.setTeamLetter(p.red.isolation.getTeamLetter());
                    newRanked.setRobotName(p.red.isolation.getRobotName());
                    newRanked.addScore(p.red.isolation.getScore(), p.blue.getScore(), teamOne, redOut);
                    if (p.red.isolation.getAutonomous() == true) {
                        newRanked.addInteractionAuton(p.blue.isolation.getAutonomousScore());
                    }
                    if (p.red.isolation.getSuperiorRobot() == true){
                        newRanked.addSuperiorRobot();
                    }
                    rankMe.set(p.red.isolation.getIdNumber(), newRanked);;
                }
            }
        }
    }

    public ArrayList<TeamRankedObject> getRanked() {
        Collections.sort(rankMe, new wpComparator());
        return rankMe;
    }
}
