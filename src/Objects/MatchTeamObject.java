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
public class MatchTeamObject extends TeamObject implements Serializable, Cloneable {

    private Boolean autonomous;
    private Boolean batteryfail;
    private Boolean disqualified;
    private Boolean doublernegatorearly;
    private Boolean doublerused;
    private Boolean entanglement;
    private Boolean matchmissed;
    private Boolean negatorused;
    private Boolean otherproblem;
    private Boolean poorrobot;
    private Boolean superiorrobot;
    private Boolean vexnetfail;
    private Boolean wireUnpluged;
    private int autonomousscore;
    private int score;
    private String comment;

    public void setMatchTeamObject(MatchTeamObject t){
        System.out.println("Passed into object");
        this.setTeamNumber(t.getTeamNumber());
        this.setTeamNumber(t.getTeamNumb());
        this.setTeamLetter(t.getTeamLetter());
        this.setId(t.getIdNumber());
        this.setTeamName(t.getTeamName());
        this.setLocation(t.getLocation());
        this.setRobotName(t.getRobotName());
        autonomous = t.getAutonomous();
        batteryfail= t.getBatteryFail();
        disqualified=t.getDisqualified();
        doublernegatorearly=t.getDoublerNegatorEarly();
        doublerused=t.getDoublerUsed();
        entanglement=t.getEntanglement();
        matchmissed=t.getMatchMissed();
        negatorused=t.getNegatorUsed();
        otherproblem=t.getNegatorUsed();
        poorrobot = t.getPoorRobot();
        superiorrobot=t.getSuperiorRobot();
        vexnetfail = t.getVexNetFail();
        wireUnpluged=t.getWireUnpluged();
        autonomousscore=t.getAutonomousScore();
        score = t.getScore();
        comment = t.getComment();
        System.out.println("This is out!");
    }
    
    public Boolean getDisqualified() {
        return disqualified;
    }

    public void setDisqualified(Boolean disqualified) {
        this.disqualified = disqualified;
    }

    public Boolean getDoublerNegatorEarly() {
        return doublernegatorearly;
    }

    public void setDoublerNegatorEarly(Boolean doublernegatorearly) {
        this.doublernegatorearly = doublernegatorearly;
    }

    public Boolean getDoublerUsed() {
        return doublerused;
    }

    public void setDoublerUsed(Boolean doublerused) {
        this.doublerused = doublerused;
    }

    public Boolean getEntanglement() {
        return entanglement;
    }

    public void setEntanglement(Boolean entanglement) {
        this.entanglement = entanglement;
    }

    public Boolean getMatchMissed() {
        return matchmissed;
    }

    public void setMatchMissed(Boolean matchmissed) {
        this.matchmissed = matchmissed;
    }

    public Boolean getNegatorUsed() {
        return negatorused;
    }

    public void setNegatorUsed(Boolean negatorused) {
        this.negatorused = negatorused;
    }

    public Boolean getOtherProblem() {
        return otherproblem;
    }

    public void setOtherProblem(Boolean otherproblem) {
        this.otherproblem = otherproblem;
    }
    public Boolean getWireUnpluged() {
        return wireUnpluged;
    }

    public void setWireUnpluged(Boolean wireUnpluged) {
        this.wireUnpluged = wireUnpluged;
    }
    
    public void setComment(String COMMENT) {
        this.comment = COMMENT;
    }

    public String getComment() {
        return comment;
    }

    public Boolean getVexNetFail() {
        return vexnetfail;
    }

    public void setVexNetFail(Boolean VEXNETFAIL) {
        this.vexnetfail = VEXNETFAIL;
    }

    public Boolean getSuperiorRobot() {
        return superiorrobot;
    }

    public void setSuperiorRobot(Boolean SUPERIORROBOT) {
        this.superiorrobot = SUPERIORROBOT;
    }

    public Boolean getBatteryFail() {
        return batteryfail;
    }

    public void setBatteryFail(Boolean BATTERYFAIL) {
        this.batteryfail = BATTERYFAIL;
    }

    public void setPoorRobot(Boolean POORROBOT) {
        this.poorrobot = POORROBOT;
    }

    public Boolean getPoorRobot() {
        return poorrobot;
    }

    public void setAutonomous(Boolean AUTONOMOUS) {
        this.autonomous = AUTONOMOUS;
    }

    public Boolean getAutonomous() {
        return autonomous;
    }

    public int getAutonomousScore() {
        return autonomousscore;
    }

    public void setAutonomousScore(int ASCORE) {
        this.autonomousscore = ASCORE;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int SCORE) {
        this.score = SCORE;
    }
}