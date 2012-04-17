/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guiFrames;

import ActionPacks.teamNameReader;
import Objects.MatchTeamObject;
import Objects.TeamObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author jonathanleitschuh
 */
public class MatchTeamSubFrame extends javax.swing.JPanel {
    private int id;
    private int length;

    public MatchTeamObject getMatchTeam() {

        MatchTeamObject team = new MatchTeamObject();
        try {
            //Get the selected team from the list

            int selected = teamList.getSelectedIndex();

            teamNameReader set = new teamNameReader();
            ArrayList<TeamObject> read = null;
            try {
                read = set.readTeamNameObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(teamsListFrame.class.getName()).log(Level.SEVERE, null, ex);
            }


            team.setTeamName(read.get(selected).getTeamName());
            team.setTeamNumber(read.get(selected).getTeamNumber());
            team.setTeamLetter(read.get(selected).getTeamLetter());
            team.setId(read.get(selected).getId());


            team.setAutonomous(autonomous.isSelected());
            team.setAutonomousScore(Integer.parseInt(autonomousScore.getText()));
            team.setBatteryFail(batteryFailProblem.isSelected());
            team.setComment(commentBox.getText());
            team.setDisqualified(disqualified.isSelected());
            team.setDoublerNegatorEarly(doublerNegatorEarlyProblem.isSelected());
            team.setDoublerUsed(doublerUsed.isSelected());
            team.setEntanglement(entanglementProblem.isSelected());
            team.setMatchMissed(matchMissedProblem.isSelected());
            team.setNegatorUsed(negatorUsed.isSelected());
            team.setOtherProblem(otherProblem.isSelected());
            team.setPoorRobot(poorRobotProblem.isSelected());
            team.setSuperiorRobot(superiorRobot.isSelected());
            team.setVexNetFail(vexNetFailProblem.isSelected());
            team.setWireUnpluged(wireUnplugedProblem.isSelected());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please Select a Team From the List", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return team;
    }
    public void setTeamName(MatchTeamObject teamSet){
        teamList.setSelectedIndex(teamSet.getIdNumber());
        teamList.ensureIndexIsVisible(teamSet.getIdNumber());
        id = teamSet.getIdNumber();
    }

    public void setMatchTeam(MatchTeamObject teamSet) {
        
        id = teamSet.getIdNumber();
        autonomous.setSelected(teamSet.getAutonomous());
        autonomousScore.setText(Integer.toString(teamSet.getAutonomousScore()));
        batteryFailProblem.setSelected(teamSet.getBatteryFail());
        commentBox.setText(teamSet.getComment());
        disqualified.setSelected(teamSet.getDisqualified());
        doublerNegatorEarlyProblem.setSelected(teamSet.getDoublerNegatorEarly());
        doublerUsed.setSelected(teamSet.getDoublerUsed());
        entanglementProblem.setSelected(teamSet.getEntanglement());
        matchMissedProblem.setSelected(teamSet.getMatchMissed());
        negatorUsed.setSelected(teamSet.getNegatorUsed());
        otherProblem.setSelected(teamSet.getOtherProblem());
        poorRobotProblem.setSelected(teamSet.getPoorRobot());
        superiorRobot.setSelected(teamSet.getSuperiorRobot());
        vexNetFailProblem.setSelected(teamSet.getVexNetFail());
        wireUnplugedProblem.setSelected(teamSet.getWireUnpluged());

    }
    /*
     * private DefaultComboBoxModel getListTeams() { DefaultComboBoxModel
     * listModelTeams = new DefaultComboBoxModel(); teamNameReader read = new
     * teamNameReader(); ArrayList<TeamObject> readConfig = null; try {
     * readConfig = read.readTeamNameObject(); } catch (ClassNotFoundException
     * ex) { Logger.getLogger(teamsListFrame.class.getName()).log(Level.SEVERE,
     * null, ex); } listModelTeams.addElement("- Choose Team -"); for
     * (TeamObject item : readConfig) {
     * listModelTeams.addElement(item.getTeamShortList()); } return
     * listModelTeams; }
     *
     * public String[] getListTeamsString() { teamNameReader read = new
     * teamNameReader(); ArrayList<TeamObject> readConfig = null; try {
     * read.readTeamNameObject(); } catch (ClassNotFoundException ex) {
     * Logger.getLogger(MatchTeamSubFrame.class.getName()).log(Level.SEVERE,
     * null, ex); } int size = 0; try { readConfig = read.readTeamNameObject();
     * size = readConfig.size(); } catch (ClassNotFoundException ex) {
     * Logger.getLogger(teamsListFrame.class.getName()).log(Level.SEVERE, null,
     * ex); } String[] list = new String[size]; int i = 0; for (TeamObject item
     * : readConfig) { list[i] = (item.getTeamShortList()); i++; }
     * System.out.println("Sucessful return " + list); return list; }
     */

    /**
     * Creates new form MatchTeamSubFrame
     */
    public MatchTeamSubFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        teamSelectionPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        try{
            DefaultListModel listModelTeams = new DefaultListModel();
            teamNameReader read = new teamNameReader();
            ArrayList<TeamObject> readConfig = null;
            try {
                readConfig = read.readTeamNameObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(teamsListFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            for (TeamObject item : readConfig) {
                listModelTeams.addElement(item.getTeamShortListNumb());
            }
            length = listModelTeams.size();
            teamList = new javax.swing.JList();
            problemsPanel = new javax.swing.JPanel();
            poorRobotProblem = new javax.swing.JCheckBox();
            batteryFailProblem = new javax.swing.JCheckBox();
            vexNetFailProblem = new javax.swing.JCheckBox();
            matchMissedProblem = new javax.swing.JCheckBox();
            doublerNegatorEarlyProblem = new javax.swing.JCheckBox();
            wireUnplugedProblem = new javax.swing.JCheckBox();
            otherProblem = new javax.swing.JCheckBox();
            entanglementProblem = new javax.swing.JCheckBox();
            qualitiesPanel = new javax.swing.JPanel();
            autonomous = new javax.swing.JCheckBox();
            autonomousScoreLabel = new javax.swing.JLabel();
            autonomousScore = new javax.swing.JTextField();
            superiorRobot = new javax.swing.JCheckBox();
            commentPanel = new javax.swing.JPanel();
            jScrollPane1 = new javax.swing.JScrollPane();
            commentBox = new javax.swing.JTextPane();
            teamDetails = new javax.swing.JPanel();
            doublerUsed = new javax.swing.JCheckBox();
            negatorUsed = new javax.swing.JCheckBox();
            disqualified = new javax.swing.JCheckBox();

            java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
            layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
            layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0};
            setLayout(layout);

            teamSelectionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Team Number/Letter"));
            java.awt.GridBagLayout teamSelectionPanelLayout = new java.awt.GridBagLayout();
            teamSelectionPanelLayout.columnWidths = new int[] {0, 5, 0, 5, 0};
            teamSelectionPanelLayout.rowHeights = new int[] {0, 5, 0, 5, 0};
            teamSelectionPanel.setLayout(teamSelectionPanelLayout);

            jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
            jScrollPane3.setMaximumSize(new java.awt.Dimension(100, 25));
            jScrollPane3.setMinimumSize(new java.awt.Dimension(100, 25));
            jScrollPane3.setPreferredSize(new java.awt.Dimension(100, 25));

            teamList.setModel(listModelTeams);
            teamList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
            teamList.setBounds(new java.awt.Rectangle(0, 0, 100, 5));
            teamList.setMaximumSize(new java.awt.Dimension(100, 7000));
            teamList.setMinimumSize(new java.awt.Dimension(100, 0));
            teamList.setPreferredSize(new java.awt.Dimension(100, 100));
            teamList.setVisibleRowCount(30);
            jScrollPane3.setViewportView(teamList);
        }catch(Exception e){
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 150;
        teamSelectionPanel.add(jScrollPane3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        add(teamSelectionPanel, gridBagConstraints);

        problemsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Problems:"));
        java.awt.GridBagLayout problemsLayout = new java.awt.GridBagLayout();
        problemsLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        problemsLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        problemsPanel.setLayout(problemsLayout);

        poorRobotProblem.setText("Poor Robot");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        problemsPanel.add(poorRobotProblem, gridBagConstraints);

        batteryFailProblem.setText("Battery Fail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        problemsPanel.add(batteryFailProblem, gridBagConstraints);

        vexNetFailProblem.setText("VEX Net Fail");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        problemsPanel.add(vexNetFailProblem, gridBagConstraints);

        matchMissedProblem.setText("Missed Match");
        matchMissedProblem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matchMissedProblemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        problemsPanel.add(matchMissedProblem, gridBagConstraints);

        doublerNegatorEarlyProblem.setText("Doubler/Negator early");
        doublerNegatorEarlyProblem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doublerNegatorEarlyProblemActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        problemsPanel.add(doublerNegatorEarlyProblem, gridBagConstraints);

        wireUnplugedProblem.setText("Wire Unplugged");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        problemsPanel.add(wireUnplugedProblem, gridBagConstraints);

        otherProblem.setText("Other");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        problemsPanel.add(otherProblem, gridBagConstraints);

        entanglementProblem.setText("Entanglement");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        problemsPanel.add(entanglementProblem, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        add(problemsPanel, gridBagConstraints);

        qualitiesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Qualities:"));
        qualitiesPanel.setLayout(new java.awt.GridBagLayout());

        autonomous.setText("Autonomous");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        qualitiesPanel.add(autonomous, gridBagConstraints);

        autonomousScoreLabel.setText("Score:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 0);
        qualitiesPanel.add(autonomousScoreLabel, gridBagConstraints);

        autonomousScore.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        autonomousScore.setText("0");
        autonomousScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autonomousScoreActionPerformed(evt);
            }
        });
        autonomousScore.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                autonomousScoreFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        qualitiesPanel.add(autonomousScore, gridBagConstraints);

        superiorRobot.setText("Superior Robot");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        qualitiesPanel.add(superiorRobot, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        add(qualitiesPanel, gridBagConstraints);

        commentPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Comments:"));
        java.awt.GridBagLayout commentPanelLayout = new java.awt.GridBagLayout();
        commentPanelLayout.columnWidths = new int[] {0, 5, 0, 5, 0};
        commentPanelLayout.rowHeights = new int[] {0, 5, 0, 5, 0};
        commentPanel.setLayout(commentPanelLayout);

        commentBox.setMaximumSize(new java.awt.Dimension(100, 50));
        jScrollPane1.setViewportView(commentBox);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        commentPanel.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 145;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        add(commentPanel, gridBagConstraints);

        teamDetails.setBorder(javax.swing.BorderFactory.createTitledBorder("Team Details:"));
        java.awt.GridBagLayout matchDetailsLayout = new java.awt.GridBagLayout();
        matchDetailsLayout.columnWidths = new int[] {0, 5, 0, 5, 0};
        matchDetailsLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        teamDetails.setLayout(matchDetailsLayout);

        doublerUsed.setText("Doubler Used");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        teamDetails.add(doublerUsed, gridBagConstraints);

        negatorUsed.setText("Negator Used");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        teamDetails.add(negatorUsed, gridBagConstraints);

        disqualified.setText("Disqualified");
        disqualified.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disqualifiedActionPerformed(evt);
            }
        });
        disqualified.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                disqualifiedFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        teamDetails.add(disqualified, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        add(teamDetails, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void disqualifiedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disqualifiedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disqualifiedActionPerformed

    private void doublerNegatorEarlyProblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doublerNegatorEarlyProblemActionPerformed
        // TODO add your handling code here:
        if (doublerNegatorEarlyProblem.isSelected()) {
            disqualified.setSelected(true);
        }
    }//GEN-LAST:event_doublerNegatorEarlyProblemActionPerformed

    private void matchMissedProblemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matchMissedProblemActionPerformed
        // TODO add your handling code here:
        if (matchMissedProblem.isSelected())
        {
        disqualified.setSelected(true);
        }
    }//GEN-LAST:event_matchMissedProblemActionPerformed

    private void autonomousScoreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_autonomousScoreFocusLost
        // TODO add your handling code here:
        try{
            Integer.parseInt(autonomousScore.getText());
        }
        catch(Exception e){
            autonomousScore.setText("0");
        }
        if((Integer.parseInt(autonomousScore.getText())) == 0 ){
            
        }else if((Integer.parseInt(autonomousScore.getText()))>0){
            autonomous.setSelected(true);
        }else if((Integer.parseInt(autonomousScore.getText()))<0){
            autonomousScore.setText("0");
        }
            
    }//GEN-LAST:event_autonomousScoreFocusLost

    private void autonomousScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autonomousScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_autonomousScoreActionPerformed

    private void disqualifiedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_disqualifiedFocusLost
        // TODO add your handling code here:
        if((doublerNegatorEarlyProblem.isSelected() == true) || (matchMissedProblem.isSelected() == true)){
            disqualified.setSelected(true);
        }
    }//GEN-LAST:event_disqualifiedFocusLost

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox autonomous;
    private javax.swing.JTextField autonomousScore;
    private javax.swing.JLabel autonomousScoreLabel;
    private javax.swing.JCheckBox batteryFailProblem;
    private javax.swing.JTextPane commentBox;
    private javax.swing.JPanel commentPanel;
    private javax.swing.JCheckBox disqualified;
    private javax.swing.JCheckBox doublerNegatorEarlyProblem;
    private javax.swing.JCheckBox doublerUsed;
    private javax.swing.JCheckBox entanglementProblem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox matchMissedProblem;
    private javax.swing.JCheckBox negatorUsed;
    private javax.swing.JCheckBox otherProblem;
    private javax.swing.JCheckBox poorRobotProblem;
    private javax.swing.JPanel problemsPanel;
    private javax.swing.JPanel qualitiesPanel;
    private javax.swing.JCheckBox superiorRobot;
    private javax.swing.JPanel teamDetails;
    private javax.swing.JList teamList;
    private javax.swing.JPanel teamSelectionPanel;
    private javax.swing.JCheckBox vexNetFailProblem;
    private javax.swing.JCheckBox wireUnplugedProblem;
    // End of variables declaration//GEN-END:variables
}
