/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import Objects.MatchObject;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jonathanleitschuh
 */
public class matchWriter {
    private int h = 0;
    private String path = "lib/WORLDS.dat";

    private int placeFinder(int ID, ArrayList<MatchObject> count) {
        
        int size = (count.size()-1);
        
        if (size == 0) {
            return 0;
        } else {
            
            try {
                for (int c = 0; c <= size; c++) {
                    
                    if ((count.get(c).getMatchNumber()) == ID) {
                        this.h = c;
                    }
                }

                return this.h;
                
            } catch (Error e) {
                System.out.println(e);
                return 0;
            }
        }
    }
    
    public void replaceMatchObject(ArrayList<MatchObject> NAME) throws FileNotFoundException {

        //Save this file to the master team list file
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File(path)));
            oos.writeObject(NAME);

        } catch (IOException ex) {
            Logger.getLogger(matchWriter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void writeMatchObjectSimple(MatchObject NEW) throws FileNotFoundException {
        // Create a new TeamLabelObject and add the elements to it.
        matchReader read = new matchReader();
        
        
        ArrayList<MatchObject> NAME;
        try {
            NAME = (ArrayList<MatchObject>)read.readMatchObject();
        } catch (ClassNotFoundException ex) {
            NAME = new ArrayList<MatchObject>();
            Logger.getLogger(matchWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
        NEW.setMatchNumber(NAME.size());
        
        //Add this element to the ArrayList Object

        NAME.add(NEW);

        //Save this file to the master team list file
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File(path)));
            oos.writeObject(NAME);

        } catch (IOException ex) {
            Logger.getLogger(matchWriter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    public void writeMatchObject(MatchObject NEW, ArrayList<MatchObject> NAME) throws FileNotFoundException {
        // Create a new TeamLabelObject and add the elements to it.


        //Add this element to the ArrayList Object

        NAME.add(NEW);

        //Save this file to the master team list file
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File(path)));
            oos.writeObject(NAME);

        } catch (IOException ex) {
            Logger.getLogger(matchWriter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    public void writeOldMatchObject(MatchObject NEW, ArrayList<MatchObject> NAME) throws FileNotFoundException {
        // Create a new TeamLabelObject and add the elements to it.


        //Add this element to the ArrayList Object
        int thisId = placeFinder(NEW.getMatchNumber(), NAME);
        
        NAME.set(thisId, NEW);
        
        
        //Save this file to the master team list file
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(new File(path)));
            oos.writeObject(NAME);

        } catch (IOException ex) {
            Logger.getLogger(matchWriter.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                oos.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}
