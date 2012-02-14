/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author jonathanleitschuh
 */
public class MatchTeamObject {
    private String id;
    private int idnumber;
    private String name;
    private String number;
    private Boolean vexnetfail;
    
    public String getID(){
        return id;
    }
    public void setID(String ID){
        this.id = ID;
    }
    public int getIdNumber() {
        idnumber = Integer.parseInt(id);
        return idnumber;
    }
    public String getName(){
        return name;
    }
    public void setName(String NAME){
        this.name = NAME;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber(String NUMBER){
        this.number = NUMBER;
    }
    public Boolean getVexNetFail(){
        return vexnetfail;
    }
    public void setVexNetFail(Boolean VEXNETFAIL){
        this.vexnetfail = VEXNETFAIL;
    }
}
