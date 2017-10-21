/*
 * CSCE 4444
 * 
 * 
 */
package Panels;
import Listeners.Navigator;
import javafx.scene.control.MenuButton;
import javax.swing.JLabel;

/*
CREATING A NEW PANEL
1> Navigator.Java class
        + Create new gotTo() method
            - This will create a problem in the App.Java class
2> App.Java class
        + Impliment all abstract methods
        + Add these methods:
            - setContentPane(new PanelObject(this)) 
            - repaint();
            -revalidate();
3> Create new Panel
        + Add Navigator field
        + Add Navigator object to the Panel's constructor argument
        + Set this.navigator = passed constructor argument
4> Add Listener to button in new Panel
        + In ButtonMouseClicked method:
            - Call navigator.goTo method for destination



*/

public class HomeScreen extends javax.swing.JPanel {
    
    private Navigator navigator;

    public HomeScreen(Navigator navigator) {
        initComponents();
        this.navigator = navigator;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        menuButton = new javax.swing.JLabel();
        gamesButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 0));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setPreferredSize(new java.awt.Dimension(1024, 768));
        setSize(new java.awt.Dimension(1024, 768));

        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeScreenButtons/menu.png"))); // NOI18N
        menuButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                menuButtonMouseClicked(evt);
            }
        });

        gamesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/homeScreenButtons/games.png"))); // NOI18N
        gamesButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                gamesButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gamesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menuButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(gamesButton)))
                .addContainerGap(378, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseClicked
        // TODO add your handling code here:
        navigator.goToMenu();
        
    }//GEN-LAST:event_menuButtonMouseClicked

    private void gamesButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_gamesButtonMouseClicked
    {//GEN-HEADEREND:event_gamesButtonMouseClicked
        // TODO add your handling code here:
        navigator.goToGames();
    }//GEN-LAST:event_gamesButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gamesButton;
    private javax.swing.JLabel menuButton;
    // End of variables declaration//GEN-END:variables
}
