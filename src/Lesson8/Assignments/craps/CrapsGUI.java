/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson8.Assignments.craps;

//import Lesson8.Dice;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;


public class CrapsGUI extends javax.swing.JFrame {

    Craps game;
    int money;
    boolean gc, ngs;
    int add=0;
    public CrapsGUI() {
        initComponents();
        //dice requires graphics and size of panel now
        game = new Craps(dpanel1.getGraphics(),dpanel2.getGraphics(),dpanel1.getWidth(),dpanel2.getWidth());
        btnadd.setEnabled(false);
        money =100;
        ngs=true;
        lblmoney.setText("Money: $"+ money);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpanel1 = new javax.swing.JPanel();
        dpanel2 = new javax.swing.JPanel();
        roll = new javax.swing.JButton();
        btnexit = new javax.swing.JToggleButton();
        lblmoney = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputBox = new javax.swing.JTextArea();
        btnadd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dpanel1.setBackground(new java.awt.Color(200, 200, 200));

        javax.swing.GroupLayout dpanel1Layout = new javax.swing.GroupLayout(dpanel1);
        dpanel1.setLayout(dpanel1Layout);
        dpanel1Layout.setHorizontalGroup(
            dpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        dpanel1Layout.setVerticalGroup(
            dpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        dpanel2.setBackground(new java.awt.Color(200, 200, 200));

        javax.swing.GroupLayout dpanel2Layout = new javax.swing.GroupLayout(dpanel2);
        dpanel2.setLayout(dpanel2Layout);
        dpanel2Layout.setHorizontalGroup(
            dpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        dpanel2Layout.setVerticalGroup(
            dpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        roll.setText("ROLL");
        roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rollActionPerformed(evt);
            }
        });

        btnexit.setText("Quit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        lblmoney.setBackground(new java.awt.Color(0, 0, 0));
        lblmoney.setForeground(new java.awt.Color(255, 255, 255));
        lblmoney.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmoney.setText("Money: ...");
        lblmoney.setOpaque(true);

        outputBox.setColumns(20);
        outputBox.setRows(5);
        jScrollPane1.setViewportView(outputBox);

        btnadd.setText("Add Money");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(dpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(dpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(roll, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblmoney, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(roll)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnexit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnadd)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        btnadd.setEnabled(true);
        //relies on gc and ngs
        //gc also known as game continues
        //if true code dice will roll for the continuation path
        
        if(gc==true) {
            //set to false so that player has to roll again for a new game
            ngs=false;
            game.roll();
            //.append adds more txt to a text area
            outputBox.append("\n You rolled a " + game.getTotal());

            if(game.hasWon()){
                outputBox.append("\nYou Won - Click Roll to start a new game.");
                //start a new game
                game = new Craps(dpanel1.getGraphics(),dpanel2.getGraphics(),dpanel1.getWidth(),dpanel2.getWidth());
                money+=10;
            }    

            else if(game.haslost()){
                outputBox.append("\nYou lost - Click Roll to start a new game.");
                //start a new game
                game = new Craps(dpanel1.getGraphics(),dpanel2.getGraphics(),dpanel1.getWidth(),dpanel2.getWidth());
            }
            else{
                outputBox.append("\nGame continues - roll a " + game.getPoint() + " to win or any other number to lose.");
                gc=true;

            }
            lblmoney.setText("Money: $"+ money);
            
            gc=false;
            
        }
        
        //ngs also known as new game start 
        //ngs will start a new game if true and player has enough funds
        if(money>=5 &&ngs==true){
            if(game.isNewGame()){
            //.setText will clear txt area and put new message on the screen
            outputBox.setText("NEW GAME\n=========");
            money-=5; //charge 5 to play game
            }
            game.roll();
            //.append adds more txt to a text area
            outputBox.append("\n You rolled a " + game.getTotal());

            if(game.hasWon()){
                outputBox.append("\nYou Won - Click Roll to start a new game.");
                //start a new game
                game = new Craps(dpanel1.getGraphics(),dpanel2.getGraphics(),dpanel1.getWidth(),dpanel2.getWidth());
                money+=10;
            }    

            else if(game.haslost()){
                outputBox.append("\nYou lost - Click Roll to start a new game.");
                //start a new game
                game = new Craps(dpanel1.getGraphics(),dpanel2.getGraphics(),dpanel1.getWidth(),dpanel2.getWidth());
            }
            else{
                outputBox.append("\nGame continues - roll a " + game.getPoint() + " to win or any other number to lose.");
                gc=true;
            }
            lblmoney.setText("Money: $"+ money);
        }
        //ngs reset to true so new game will start after a continuation roll
        ngs=true;
    }//GEN-LAST:event_rollActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed

        //checking add integer for add
        try{
            add =Integer.parseInt(JOptionPane.showInputDialog(this, "How much money would you like to add? (up to 1000)"));
        }catch(Exception e){
            
        }
        if(add>1000 || add<0) add=0;
        
        money+=add;
        lblmoney.setText("Money: $"+ money);
    }//GEN-LAST:event_btnaddActionPerformed

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrapsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrapsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JToggleButton btnexit;
    private javax.swing.JPanel dpanel1;
    private javax.swing.JPanel dpanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblmoney;
    private javax.swing.JTextArea outputBox;
    private javax.swing.JButton roll;
    // End of variables declaration//GEN-END:variables
}
