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
public class MatchTeamObject extends TeamObject implements Serializable{
    private Boolean vexnetfail = false;
    private Boolean primaryscorer = true;
    private Boolean batteryfail = false;
    private int score;
    private int autonomousscore;
    
    public Boolean getVexNetFail(){
        return vexnetfail;
    }
    public void setVexNetFail(Boolean VEXNETFAIL){
        this.vexnetfail = VEXNETFAIL;
    } 
    public Boolean getPrimaryScorer(){
        return primaryscorer;
    }
    public void setPrimaryScore(Boolean PRIMARYSCORER){
        this.primaryscorer = PRIMARYSCORER;
    }
    public Boolean getBatteryFail(){
        return batteryfail;
    }
    public void setBatteryFail(Boolean BATTERYFAIL){
        this.primaryscorer = BATTERYFAIL;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int SCORE){
        this.score = SCORE;
    }
    public int getAutonomousScore(){
        return autonomousscore;
    }
    public void setAutonomousScore(int ASCORE){
        this.autonomousscore = ASCORE;
    }
}
