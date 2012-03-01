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
    public MatchTeamObject teamone;
    public MatchTeamObject teamtwo;
    private int score;
    
    public void setScore(int SCORE){
        this.score = SCORE;
        teamone.setScore(SCORE);
        teamtwo.setScore(SCORE);
    }
    public void setScore(String SCORE){
        this.score = Integer.parseInt(SCORE);
        teamone.setScore(Integer.parseInt(SCORE));
        teamtwo.setScore(Integer.parseInt(SCORE));
    }
    public int getScore(){
        return score;
    }
}