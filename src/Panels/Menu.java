/*
 * CSCE 4444
 * 
 * 
 */
package Panels;

import Listeners.Navigator;
import javax.swing.JLabel;

/**
 *
 * @author Buckwheat
 */
public class Menu extends javax.swing.JPanel {

    /**
     * Creates new form menu
     */
    
    
    private Navigator navigator;
    
    public Menu(Navigator navigator) {
        initComponents();
        
        this.navigator = navigator;
        
    }
 /*   
    public JLabel getEntreeButton(){
        return entreesButton;
    }
*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        entreesButton = new javax.swing.JLabel();
        drinksButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));
        setSize(new java.awt.Dimension(1024, 768));

        entreesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menuButtons/entrees.png"))); // NOI18N
        entreesButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                entreesButtonMouseClicked(evt);
            }
        });

        drinksButton.setBackground(new java.awt.Color(204, 51, 0));
        drinksButton.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        drinksButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        drinksButton.setText("Drinks");
        drinksButton.setOpaque(true);
        drinksButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                drinksButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(entreesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(drinksButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(516, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(drinksButton, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(entreesButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void entreesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entreesButtonMouseClicked
        // TODO add your handling code here:
        navigator.goToEntrees();
        //send request to server
        
        //information = serverReqest()
    }//GEN-LAST:event_entreesButtonMouseClicked

    private void drinksButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drinksButtonMouseClicked
        // TODO add your handling code here:
        navigator.goToDrinks();
        //send request to server
    }//GEN-LAST:event_drinksButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel drinksButton;
    private javax.swing.JLabel entreesButton;
    // End of variables declaration//GEN-END:variables
}
