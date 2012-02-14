package guiFrames;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonathanleitschuh
 */
import Data.teamData.TeamStaXParser;
import Objects.TeamObject;
import java.util.List;
import javax.swing.DefaultListModel;
        
        
public class teamsListFrame extends javax.swing.JFrame {

    /**
     * Creates new form teamsListFrame
     */
    public teamsListFrame() {
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

        teamListFrame = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DefaultListModel listModelTeams = new DefaultListModel();
        TeamStaXParser read = new TeamStaXParser();
        List<TeamObject> readConfig = read.readConfig("src/Data/teamData/teams/masterTeamList.xml");
        for (TeamObject item : readConfig) {
            listModelTeams.addElement(item.getTeamName());
        }
        teamList = new javax.swing.JList();
        newTeamButton = new javax.swing.JButton();
        editTeamButton = new javax.swing.JButton();
        deleteTeamButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VEX Alliance Selection App");
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        teamListFrame.setBorder(javax.swing.BorderFactory.createTitledBorder("Team List:"));
        teamListFrame.setLayout(new java.awt.GridBagLayout());

        teamList.setModel(listModelTeams);
        teamList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        teamList.setToolTipText("Select");
        teamList.setMaximumSize(new java.awt.Dimension(39, 120));
        teamList.setMinimumSize(new java.awt.Dimension(39, 120));
        teamList.setPreferredSize(new java.awt.Dimension(39, 120));
        jScrollPane1.setViewportView(teamList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 325;
        gridBagConstraints.ipady = 50;
        teamListFrame.add(jScrollPane1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 9;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 117;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        getContentPane().add(teamListFrame, gridBagConstraints);

        newTeamButton.setText("New Team");
        newTeamButton.setToolTipText("Create a new team.");
        newTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTeamButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 0);
        getContentPane().add(newTeamButton, gridBagConstraints);

        editTeamButton.setText("Edit Team");
        editTeamButton.setToolTipText("Edit a pre-existing team.");
        editTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTeamButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        getContentPane().add(editTeamButton, gridBagConstraints);

        deleteTeamButton.setText("Delete");
        deleteTeamButton.setToolTipText("Delete this team.");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        getContentPane().add(deleteTeamButton, gridBagConstraints);

        backButton.setText("<< Back");
        backButton.setToolTipText("Go back to main screen.");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        getContentPane().add(backButton, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        startFrame frame = new startFrame();
        frame.setSize(this.getWidth(), getHeight());
        frame.setLocation(this.getX(), this.getY());
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void newTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTeamButtonActionPerformed
        // TODO add your handling code here:
        newTeamsListFrame frame = new newTeamsListFrame();
        frame.setSize(this.getWidth(), getHeight());
        frame.setLocation(this.getX(), this.getY());
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newTeamButtonActionPerformed

    private void editTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTeamButtonActionPerformed
        // TODO add your handling code here:
        editTeamsListFrame frame = new editTeamsListFrame();
        frame.setSize(this.getWidth(), getHeight());
        frame.setLocation(this.getX(), this.getY());
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_editTeamButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(teamsListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teamsListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teamsListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teamsListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton backButton;
    private javax.swing.JButton deleteTeamButton;
    private javax.swing.JButton editTeamButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newTeamButton;
    private javax.swing.JList teamList;
    private javax.swing.JPanel teamListFrame;
    // End of variables declaration//GEN-END:variables
}
