/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import Objects.TeamRankedObject;
import java.util.Comparator;

/**
 *
 * @author jonathanleitschuh
 */
public class wpComparator implements Comparator<TeamRankedObject> {
    @Override
    public int compare(TeamRankedObject t, TeamRankedObject t1){
        
        return t1.getCompare() - t.getCompare();
        
    }
}
