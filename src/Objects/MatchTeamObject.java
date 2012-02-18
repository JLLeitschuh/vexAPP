/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author jonathanleitschuh
 */
public class MatchTeamObject extends TeamObject{
    private Boolean vexnetfail = false;
    private Boolean primaryscorer = true;
    private Boolean batteryfail = false;
    
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
    
}
