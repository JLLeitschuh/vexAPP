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
public class MatchObject implements Serializable, Cloneable {

    private int matchnumber;
    private String matchnumb;
    private int score;
    public MatchAllianceObject red = new MatchAllianceObject();
    public MatchAllianceObject blue = new MatchAllianceObject();
    
    
    
    public void setMatchNumber(int MATCHNUMBER) {
        this.matchnumber = MATCHNUMBER;
        this.matchnumb = Integer.toString(MATCHNUMBER);
    }

    public void setMatchNumber(String MATCHNUMB) {
        this.matchnumber = Integer.parseInt(MATCHNUMB);
        this.matchnumb = MATCHNUMB;
    }

    public int getMatchNumber() {
        return matchnumber;
    }

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }

    }
}