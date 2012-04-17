/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.ArrayList;

/**
 *
 * @author jonathanleitschuh
 */
public class TeamRankedObject extends TeamObject{
    
    private int matches;
    private int matchesMissed;
    private int numberOfMatches = 0;
    private int averageScore;
    private int score = 0;
    private int averageOpponentScore;
    private int opponentScore;
    private int numberOpponentScore;
    private int averageIsolationAuton;
    private int numberOfIsolationAuton = 0;
    private int isolationAuton = 0;
    private int interactionAuton = 0;
    private int averageInteractionAuton;
    private int numberOfInteractionAuton = 0;
    private int superiorRobot;
    private int disqualified;
    private int win = 0;
    private int tie = 0;
    private int loss = 0;
    private int winPoints = 0;
    private int strengthPoints = 0;
    
    public ArrayList<MatchTeamObject> list = new ArrayList<MatchTeamObject>();
    
    public int getCompare(){
        String sp = null;
        if (strengthPoints == 0){
            sp = "000";
        } else if (strengthPoints < 10){
            sp = "00" + strengthPoints;
        } else if (strengthPoints < 100){
            sp = "0" + strengthPoints;
        } else if (strengthPoints < 1000){
            sp = "" + strengthPoints;
        }
        
        String rate = winPoints + sp;
        int rateNumb = Integer.parseInt(rate);
        return rateNumb;
    }
    
    public void addIsolationAuton(int iso){
        isolationAuton = isolationAuton + iso;
        numberOfIsolationAuton++;
        averageIsolationAuton = isolationAuton/numberOfIsolationAuton;
    }
    
    public void addInteractionAuton(int inte){
        interactionAuton = interactionAuton + inte;
        numberOfInteractionAuton++;
        averageInteractionAuton = interactionAuton/numberOfInteractionAuton;
    }
    
    private void addWin(){
        matches++;
        win ++;
    }
    private void addTie(){
        matches++;
        tie ++;
    }
    
    private void addLoss(){
        matches++;
        loss ++;
    }
    private void addScore(int scored){
        numberOfMatches++;
        score = score + scored;
        averageScore = score/numberOfMatches;
        
    }
    
    private void addOpponent(int opponent){
        numberOpponentScore++;
        opponentScore = opponentScore + opponent;
        averageOpponentScore = opponentScore/numberOpponentScore;
    }
    
    public void addScore(int one, int two, boolean oneDisqualified, boolean twoDisqualified){
        if((oneDisqualified == false) && (twoDisqualified == false)){
            if(one > two){
                addWin();
                winPoints = winPoints + 2;
                strengthPoints = strengthPoints + two;
                addOpponent(two);
                addScore(one);
                
            } else if(one == two){
                addTie();
                winPoints++;
                strengthPoints = strengthPoints + one;
                addOpponent(two);
                addScore(one);
                
            } else if(one < two){
                addLoss();
                strengthPoints = strengthPoints + one;
                addOpponent(two);
                addScore(one);
                
            }
        } else if((oneDisqualified == true) && (twoDisqualified == false)){
            addLoss();
            disqualified++;
            addOpponent(two);
            
        } else if((oneDisqualified == false) && (twoDisqualified == true)){
            addWin();
            addOpponent(0);
            addScore(one);
            
        }
    }
    
    public void addSuperiorRobot(){
        superiorRobot++;
    }
    
    public void addMatchMissed(){
        matchesMissed++;
    }
    
    
    public int getInteractionAuton() {
        return interactionAuton;
    }

    public void setInteractionAuton(int interactionAuton) {
        this.interactionAuton = interactionAuton;
    }

    public int getIsolationAuton() {
        return isolationAuton;
    }

    public void setIsolationAuton(int isolationAuton) {
        this.isolationAuton = isolationAuton;
    }

    public int getNumberOfInteractionAuton() {
        return numberOfInteractionAuton;
    }

    public void setNumberOfInteractionAuton(int numberOfInteractionAuton) {
        this.numberOfInteractionAuton = numberOfInteractionAuton;
    }

    public int getNumberOfIsolationAuton() {
        return numberOfIsolationAuton;
    }

    public void setNumberOfIsolationAuton(int numberOfIsolationAuton) {
        this.numberOfIsolationAuton = numberOfIsolationAuton;
    }
    
    public int getAverageInteractionAuton() {
        return averageInteractionAuton;
    }

    public void setAverageInteractionAuton(int averageInteractionAuton) {
        this.averageInteractionAuton = averageInteractionAuton;
    }

    public int getAverageIsolationAuton() {
        return averageIsolationAuton;
    }

    public void setAverageIsolationAuton(int averageIsolationAuton) {
        this.averageIsolationAuton = averageIsolationAuton;
    }

    public int getAverageOpponentScore() {
        return averageOpponentScore;
    }

    public void setAverageOpponentScore(int averageOpponentScore) {
        this.averageOpponentScore = averageOpponentScore;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public int getDisqualified() {
        return disqualified;
    }

    public void setDisqualified(int disqualified) {
        this.disqualified = disqualified;
    }

    public int getLoss() {
        return loss;
    }

    public void setLoss(int loss) {
        this.loss = loss;
    }

    public int getMatches() {
        return matches;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public int getMatchesMissed() {
        return matchesMissed;
    }

    public void setMatchesMissed(int matchesMissed) {
        this.matchesMissed = matchesMissed;
    }

    public int getStrengthPoints() {
        return strengthPoints;
    }

    public void setStrengthPoints(int strengthPoints) {
        this.strengthPoints = strengthPoints;
    }

    public int getSuperiorRobot() {
        return superiorRobot;
    }

    public void setSuperiorRobot(int superiorRobot) {
        this.superiorRobot = superiorRobot;
    }

    public int getTie() {
        return tie;
    }

    public void setTie(int tie) {
        this.tie = tie;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getWinPoints() {
        return winPoints;
    }

    public void setWinPoints(int winPoints) {
        this.winPoints = winPoints;
    }
    
}