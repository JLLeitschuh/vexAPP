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
public class MatchAllianceObject implements Serializable{
    public MatchTeamObject isolation = new MatchTeamObject();
    public MatchTeamObject interaction = new MatchTeamObject();
    private int score;
    
    public void setMatchAllianceObject(MatchAllianceObject t){
        System.out.println("Passed into object");
        isolation.setTeamNumber(t.isolation.getTeamNumber());
        isolation.setTeamNumber(t.isolation.getTeamNumb());
        isolation.setTeamLetter(t.isolation.getTeamLetter());
        isolation.setId(t.isolation.getIdNumber());
        isolation.setTeamName(t.isolation.getTeamName());
        isolation.setLocation(t.isolation.getLocation());
        isolation.setRobotName(t.isolation.getRobotName());
        
        isolation.setAutonomous(t.isolation.getAutonomous());
        isolation.setBatteryFail(t.isolation.getBatteryFail());
        isolation.setDisqualified(t.isolation.getDisqualified());
        isolation.setDisqualified(t.isolation.getDoublerNegatorEarly());
        isolation.setDoublerUsed(t.isolation.getDoublerUsed());
        isolation.setEntanglement(t.isolation.getEntanglement());
        isolation.setMatchMissed(t.isolation.getMatchMissed());
        isolation.setNegatorUsed(t.isolation.getNegatorUsed());
        isolation.setOtherProblem(t.isolation.getNegatorUsed());
        isolation.setPoorRobot(t.isolation.getPoorRobot());
        isolation.setSuperiorRobot(t.isolation.getSuperiorRobot());
        isolation.setVexNetFail(t.isolation.getVexNetFail());
        isolation.setWireUnpluged(t.isolation.getWireUnpluged());
        isolation.setAutonomousScore(t.isolation.getAutonomousScore());
        isolation.setComment( t.isolation.getComment());
        
        
        interaction.setTeamNumber(t.interaction.getTeamNumber());
        interaction.setTeamNumber(t.interaction.getTeamNumb());
        interaction.setTeamLetter(t.interaction.getTeamLetter());
        interaction.setId(t.interaction.getIdNumber());
        interaction.setTeamName(t.interaction.getTeamName());
        interaction.setLocation(t.interaction.getLocation());
        interaction.setRobotName(t.interaction.getRobotName());
        
        interaction.setAutonomous(t.interaction.getAutonomous());
        interaction.setBatteryFail(t.interaction.getBatteryFail());
        interaction.setDisqualified(t.interaction.getDisqualified());
        interaction.setDisqualified(t.interaction.getDoublerNegatorEarly());
        interaction.setDoublerUsed(t.interaction.getDoublerUsed());
        interaction.setEntanglement(t.interaction.getEntanglement());
        interaction.setMatchMissed(t.interaction.getMatchMissed());
        interaction.setNegatorUsed(t.interaction.getNegatorUsed());
        interaction.setOtherProblem(t.interaction.getNegatorUsed());
        interaction.setPoorRobot(t.interaction.getPoorRobot());
        interaction.setSuperiorRobot(t.interaction.getSuperiorRobot());
        interaction.setVexNetFail(t.interaction.getVexNetFail());
        interaction.setWireUnpluged(t.interaction.getWireUnpluged());
        interaction.setAutonomousScore(t.interaction.getAutonomousScore());
        
        
        
        setScore(t.isolation.getScore());
        
        
        
        System.out.println("This is out!");
    }
    
    public void setIsolation (MatchTeamObject t){
        isolation.setTeamNumber(t.getTeamNumber());
        isolation.setTeamNumber(t.getTeamNumb());
        isolation.setTeamLetter(t.getTeamLetter());
        isolation.setId(t.getIdNumber());
        isolation.setTeamName(t.getTeamName());
        isolation.setLocation(t.getLocation());
        isolation.setRobotName(t.getRobotName());
        
        isolation.setAutonomous(t.getAutonomous());
        isolation.setBatteryFail(t.getBatteryFail());
        isolation.setDisqualified(t.getDisqualified());
        isolation.setDisqualified(t.getDoublerNegatorEarly());
        isolation.setDoublerUsed(t.getDoublerUsed());
        isolation.setEntanglement(t.getEntanglement());
        isolation.setMatchMissed(t.getMatchMissed());
        isolation.setNegatorUsed(t.getNegatorUsed());
        isolation.setOtherProblem(t.getNegatorUsed());
        isolation.setPoorRobot(t.getPoorRobot());
        isolation.setSuperiorRobot(t.getSuperiorRobot());
        isolation.setVexNetFail(t.getVexNetFail());
        isolation.setWireUnpluged(t.getWireUnpluged());
        isolation.setAutonomousScore(t.getAutonomousScore());
        isolation.setComment( t.getComment());
        
    }
    
    public void setScore(int SCORE){
        this.score = SCORE;
        isolation.setScore(SCORE);
        interaction.setScore(SCORE);
    }
    public void setScore(String SCORE){
        this.score = Integer.parseInt(SCORE);
        isolation.setScore(Integer.parseInt(SCORE));
        interaction.setScore(Integer.parseInt(SCORE));
    }
    public int getScore(){
        return score;
    }
}