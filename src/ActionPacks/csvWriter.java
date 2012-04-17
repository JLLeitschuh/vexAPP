/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ActionPacks;

import Objects.TeamObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.csvreader.CsvWriter;
import java.util.ArrayList;

/**
 *
 * @author jonathanleitschuh
 */
public class csvWriter {

    private String path = "lib/TEAMLIST.csv";
    
    public void writeOld(ArrayList<TeamObject> team) {


        // before we open the file check to see if it already exists
        boolean alreadyExists = new File(path).exists();

        try {
            // use FileWriter constructor that specifies open for appending
            CsvWriter csvOutput = new CsvWriter(new FileWriter(path, false), ',');

            // if the file didn't already exist then we need to write out the header line
            
                csvOutput.write("ID");
                csvOutput.write("TeamName");
                csvOutput.write("TeamNumber");
                csvOutput.write("TeamLetter");
                csvOutput.write("RobotName");
                csvOutput.write("Location");
                csvOutput.write("TeamComment");
                csvOutput.endRecord();
            
            // else assume that the file already has the correct header line

            // write out a few records
            for (TeamObject p : team) {
                csvOutput.write(p.getId());
                csvOutput.write(p.getTeamName());
                csvOutput.write(p.getTeamNumb());
                csvOutput.write(p.getTeamLetter());
                csvOutput.write(p.getRobotName());
                csvOutput.write(p.getLocation());
                csvOutput.write(p.getTeamComment());
                
                
                csvOutput.endRecord();
            }

            csvOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeNew(ArrayList<TeamObject> team) {


        // before we open the file check to see if it already exists
        boolean alreadyExists = new File(path).exists();

        try {
            // use FileWriter constructor that specifies open for appending
            CsvWriter csvOutput = new CsvWriter(new FileWriter(path, true), ',');

            // if the file didn't already exist then we need to write out the header line
            if (!alreadyExists) {
                csvOutput.write("ID");
                csvOutput.write("TeamName");
                csvOutput.write("TeamNumber");
                csvOutput.write("TeamLetter");
                csvOutput.write("RobotName");
                csvOutput.write("Location");
                csvOutput.write("TeamComment");
                csvOutput.endRecord();
            }
            // else assume that the file already has the correct header line

            // write out a few records
            for (TeamObject p : team) {
                csvOutput.write(p.getId());
                csvOutput.write(p.getTeamName());
                csvOutput.write(p.getTeamNumb());
                csvOutput.write(p.getTeamLetter());
                csvOutput.write(p.getRobotName());
                csvOutput.write(p.getLocation());
                csvOutput.write(p.getTeamComment());
                
                
                csvOutput.endRecord();
            }

            csvOutput.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
