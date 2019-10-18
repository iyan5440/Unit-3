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


public class CrapsGUI extends javax.swing.JFrame {

    Craps game;
    int money;
    public CrapsGUI() {
        initComponents();
        //dice requires graphics and size of panel now
        game = new Craps(dpanel1.getGraphics(),dpanel2.getGraphics(),dpanel1.getWidth(),dpanel2.getWidth());
        //d1 = new Dice(dpanel1.getGraphics(),dpanel1.getWidth());
        //d2 = new Dice(dpanel2.getGraphics(),dpanel1.getWidth());
        money =100;

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpanel1 = new javax.swing.JPanel();
        dpanel2 = new javax.swing.JPanel();
        roll = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        lblmoney = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputBox = new javax.swing.JTextArea();

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

        jToggleButton1.setText("Quit");

        lblmoney.setBackground(new java.awt.Color(0, 0, 0));
        lblmoney.setForeground(new java.awt.Color(255, 255, 255));
        lblmoney.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblmoney.setText("Money: ...");
        lblmoney.setOpaque(true);

        outputBox.setColumns(20);
        outputBox.setRows(5);
        jScrollPane1.setViewportView(outputBox);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(roll, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblmoney, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                        .addGap(18, 18, 18)
                        .addComponent(jToggleButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollActionPerformed
        if(game.isNewGame()){
            //.setText will clear txt area and put new message on the screen
            outputBox.setText("NEW GAME\n=========");
            money-=5; //charge 5 to play game
            
        }
        game.roll();
        //.append adds moew txt to a text area
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
        }
        lblmoney.setText("Money: $"+ money);
            
    }//GEN-LAST:event_rollActionPerformed

    
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
    private javax.swing.JPanel dpanel1;
    private javax.swing.JPanel dpanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblmoney;
    private javax.swing.JTextArea outputBox;
    private javax.swing.JButton roll;
    // End of variables declaration//GEN-END:variables
}
