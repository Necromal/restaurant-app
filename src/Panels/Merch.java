/*
 * CSCE 4444
 * 
 * 
 */
package Panels;

import Food.Food;
import Food.Order;
import Listeners.Navigator;
import Listeners.OrderItemDetailsListener;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;
import javax.swing.ListSelectionModel;
import static javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION;

public class Merch extends javax.swing.JPanel{

    Navigator navigator;
    ArrayList<Food> merch;   
    DefaultListModel dlmMerchItems, dlmIngredients, dlmOrder;//This lets you add items to a list after the list has been created 
    String selection;//Holds the value of the item selected from the list
    String typeOf;//used to determine type of item (food, drink, or merch)
    int index;//used for finding values in the entrees array
    Order order;//Holds the customers entire order
    ArrayList<JCheckBox> checkBoxes;//holds list of ingredient checkboxes
    Food modifiedFoodItem;//Used when modifying orders
    

    
    
    /**CLASS CONSTRUCTOR
     * Creates new form EntreeItems
     */
    public Merch(Navigator navigator, ArrayList<Food> merch, Order order) {
        initComponents();
        setSize(1024, 768);
        scrollPane.getViewport().setOpaque(false);//this makes the scrollpane transparent
        removeFromOrder.setEnabled(false);
        this.navigator = navigator;
        this.merch= merch;
        this.order = order;

        dlmMerchItems = new DefaultListModel();//Create new Default List Model for list of entree items
        populateOrder();
        
        //Add item names from the entrees array to the dlm
        for (int i = 0; i < merch.size(); i++)
        {
           dlmMerchItems.addElement(merch.get(i).GetName());
        }
        
        //Add the dlm to the list
        foodList.setModel(dlmMerchItems);
        
        subTotal.setText(setSubTotal());//Display the subtotal
              
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        scrollPane = new javax.swing.JScrollPane();
        orderDetails = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        subTotal = new javax.swing.JLabel();
        confirmOrder = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        foodList = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        itemName = new javax.swing.JLabel();
        itemDescription = new javax.swing.JTextArea();
        itemIngredients = new javax.swing.JPanel();
        addToOrder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        specialRequestTextField = new javax.swing.JTextField();
        removeFromOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 0));
        setMaximumSize(new java.awt.Dimension(1024, 768));
        setMinimumSize(new java.awt.Dimension(1024, 768));

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ORDER DETAILS");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));

        scrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setOpaque(false);

        orderDetails.setBackground(new java.awt.Color(204, 0, 0));
        orderDetails.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        orderDetails.setOpaque(false);
        orderDetails.setLayout(new javax.swing.BoxLayout(orderDetails, javax.swing.BoxLayout.Y_AXIS));
        scrollPane.setViewportView(orderDetails);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Sub Total: ");

        subTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        subTotal.setForeground(new java.awt.Color(255, 255, 0));

        confirmOrder.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        confirmOrder.setForeground(new java.awt.Color(255, 255, 0));
        confirmOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmOrder.setText("CONFIRM ORDER");
        confirmOrder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        confirmOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmOrderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollPane)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(confirmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(confirmOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(subTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MERCHANDISE");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));

        foodList.setBackground(new java.awt.Color(204, 0, 0));
        foodList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        foodList.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        foodList.setForeground(new java.awt.Color(255, 255, 0));
        foodList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        foodList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                foodListValueChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                    .addComponent(foodList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foodList, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 0, 0));

        itemName.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        itemName.setForeground(new java.awt.Color(255, 255, 0));
        itemName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        itemName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));

        itemDescription.setBackground(new java.awt.Color(204, 0, 0));
        itemDescription.setColumns(20);
        itemDescription.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        itemDescription.setForeground(new java.awt.Color(255, 255, 0));
        itemDescription.setLineWrap(true);
        itemDescription.setRows(5);
        itemDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        itemDescription.setEnabled(false);

        itemIngredients.setBackground(new java.awt.Color(204, 51, 0));
        itemIngredients.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));
        itemIngredients.setLayout(new javax.swing.BoxLayout(itemIngredients, javax.swing.BoxLayout.Y_AXIS));

        addToOrder.setText("ADD TO ORDER");
        addToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToOrderActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Special Request");

        removeFromOrder.setText("REMOVE FROM ORDER");
        removeFromOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeFromOrderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(addToOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(removeFromOrder)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(itemName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(itemDescription)
                            .addComponent(itemIngredients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(specialRequestTextField))))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addToOrder, removeFromOrder});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemIngredients, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(specialRequestTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeFromOrder)
                    .addComponent(addToOrder))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //MODIFY AN ORDER
    //Listens for when an OrderItemDetail's panel is clicked
    OrderItemDetailsListener listener = new OrderItemDetailsListener()
    {
        
        @Override
        public void modifyItem(Food item)
        {            
            int z = 0;//Index holder
            
            addToOrder.setText("MODIFY ORDER");
            removeFromOrder.setEnabled(true);//Enable removeFromOrder button
            
            //Select the item in the foodList
            while(item.GetName() != foodList.getModel().getElementAt(z))
            {
                z++;
            }
            foodList.setSelectedIndex(z);
            
            
            //Select the checkboxes of all of the previously added ingredients
            for (int i = 0; i < item.getIngrediantArraySize(); i++)
            {
                z = 0;
                while(item.GetIngredients(i) != checkBoxes.get(z).getText())
                {
                    z++;
                }
                checkBoxes.get(z).setSelected(true);
            }
            
            item.getIngredientList().clear();//Clear the ingredient list of selected order item
            modifiedFoodItem = item;//Used when "Modify Order" button is clicked
            
        }

        @Override
        public void recallItem()
        {
            
        }
    
    };
    
    
    /*DISPLAY INGREDIENTS
    //This method displays a food item's, name, description, and ingredient list
    //depending on what item is selected in the itemList
    */
    private void foodListValueChanged(javax.swing.event.ListSelectionEvent evt)//GEN-FIRST:event_foodListValueChanged
    {//GEN-HEADEREND:event_foodListValueChanged
        // TODO add your handling code here:
        
        //If nothing is selected, do nothing. 
        //This prevents crashes when "resetting" the menu state after adding an order
        if(foodList.isSelectionEmpty())
        {
            return;
        }
        //Prevents a known bug in Java
        if(!evt.getValueIsAdjusting()){}

        //Remove all items in ingredient list
        itemIngredients.removeAll();
        revalidate();
        repaint();
        
        
        dlmIngredients = new DefaultListModel();//Default List Model for the ingredient list

        selection = foodList.getSelectedValue();//Get the selected item
        index = findindex(selection);//Finds the index of the selected item from the entrees array
        itemName.setText(selection);//Set the itemName JLabel to display the selected item's name
        itemDescription.setText(merch.get(index).GetDescription());//Set the itemDescription JLabel to display the selected item's description
       
        checkBoxes = new ArrayList<>();//create array of checkbox comoponents
        
        //create and add checkboxes to the checkbox array
        for (int i = 0; i < merch.get(index).getIngrediantArraySize(); i++)
        {
            checkBoxes.add(new JCheckBox(merch.get(index).GetIngredients(i)));          
        }
        
        //Creates checkboxes with selected food item's ingredients
        for (int i = 0; i < merch.get(index).getIngrediantArraySize(); i++)
        {
            itemIngredients.add(checkBoxes.get(i));
        }

        

    }//GEN-LAST:event_foodListValueChanged

    /*ADD TO ORDER
    //This method adds a food item's name and selected ingredients to a Food object
    //gives that Food object to an Order object,
    //and populates the Order Details section with information from the Order object
    */
    private void addToOrderActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addToOrderActionPerformed
    {//GEN-HEADEREND:event_addToOrderActionPerformed
         
        //Remove all orders from Order Details
        orderDetails.removeAll();
        revalidate();
        repaint();

        if(addToOrder.getText() == "ADD TO ORDER")
        {
            //Create new Food object with name and price of selected item
            Food foodItem = new Food(selection, typeOf, merch.get(index).getItemCatagory(), merch.get(index).GetPrice(), Boolean.TRUE, Boolean.TRUE);
            
            //Add all selected checkboxes as ingredients to the Food object
            for(JCheckBox checkBox : checkBoxes)
            {
                if(checkBox.isSelected())
                {
                    foodItem.SetIngredients(checkBox.getText());
                }   
            }

            //Check if there is a special request, if so, add it as an ingredient
            if(!specialRequestTextField.getText().isEmpty())
            {
                foodItem.SetIngredients(specialRequestTextField.getText());
            }

            //Give the Food object to the Order object
            order.setFoodItem(foodItem);//add food item to order

            //Create OrderItemDetailPanels for each Food object that has been given to the Order object
            for(Food item : order.getFoodItem())
            {
                orderDetails.add(new OrderItemDetails(item, listener,navigator));
            }

            
            //Update the order details panel
            populateOrder();

            
            order.setHasAddedToOrder(true);//Set the has added to order field to true
            
            subTotal.setText(setSubTotal());//Display the subtotal
            
            resetMenu();//Resets the menu state        
        }
        else//addToOrder button = MODIFY ORDER
        {

            //Add all selected checkboxes as ingredients to the Food object
            for(JCheckBox checkBox : checkBoxes)
            {
                if(checkBox.isSelected())
                {
                    modifiedFoodItem.SetIngredients(checkBox.getText());
                }   
            }
            //Check if there is a special request, if so, add it as an ingredient
            if(!specialRequestTextField.getText().isEmpty())
            {
                modifiedFoodItem.SetIngredients(specialRequestTextField.getText());
            }
            
            //Replace the Food object to the Order object
            int z = 0;
            while(order.getFoodItem().get(z).GetName() != modifiedFoodItem.GetName())
            {
                z++;
            }
            order.getFoodItem().set(z, modifiedFoodItem);//Swap Food objects 
            
            //This section removes and replaced all items in the Order Details area
            
            for(Food item : order.getFoodItem())
            {
                orderDetails.add(new OrderItemDetails(item, listener,navigator));
            }
           
            subTotal.setText(setSubTotal());//Display the subtotal
            
            //Update the order details panel
            populateOrder();
           
            
            resetMenu();//Resets the menu state
        }
        
        
    }//GEN-LAST:event_addToOrderActionPerformed

    //REMOVE A FOOD ITEM FROM THE ORDER
    private void removeFromOrderMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_removeFromOrderMouseClicked
    {//GEN-HEADEREND:event_removeFromOrderMouseClicked
        orderDetails.removeAll();
        revalidate();
        repaint();
        
        int z = 0;
        while(order.getFoodItem().get(z).GetName() != modifiedFoodItem.GetName())
        {
            z++;
        }
        order.getFoodItem().remove(z);//Remove Food objects 

        //This section removes and replaced all items in the Order Details area
        for(Food item : order.getFoodItem())
        {
            orderDetails.add(new OrderItemDetails(item, listener,navigator));
        }
        
        subTotal.setText(setSubTotal());//Display the subtotal

        //Update the order details panel
        populateOrder();
        resetMenu();//Resets the menu state
    }//GEN-LAST:event_removeFromOrderMouseClicked

    //Takes the customer to teh Confirm Order panel
    private void confirmOrderMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_confirmOrderMouseClicked
    {//GEN-HEADEREND:event_confirmOrderMouseClicked
        navigator.goToConfirmOrder();
    }//GEN-LAST:event_confirmOrderMouseClicked
    
    //******************* HELPER METHODS ********************************//
    
    //This method finds where in the entrees array a Food item is stored
    public int findindex(String name)
    {
        int index = 0;
        while(merch.get(index).GetName() != name)
        {
            index++;
        }
        return index;
    }
    
    //"Resets" the menu state
    public void resetMenu()
    {
            foodList.clearSelection();//Deselect foodList item
            itemName.setText("");//Remove selected item name
            itemDescription.setText("");//Remove selected item description
            specialRequestTextField.setText("");
            
            
            addToOrder.setText("ADD TO ORDER");
            removeFromOrder.setEnabled(false);
            
            itemIngredients.removeAll();//Remove selected item ingredient list
            itemIngredients.revalidate();
            itemIngredients.repaint(); 
    }
    
    //Calculates subtotal an returns it as a string
    public String setSubTotal()
    {
        order.calculateSubTotal();//Calculate the total price of the order
        return Double.toString(order.getSubTotal());
    }
     public void populateOrder()//populates order details panel
    {
        orderDetails.removeAll();
        for(Food drink : order.getDrinkItem())
        {
            orderDetails.add(new OrderItemDetails(drink, listener,navigator));
        }
        for(Food food : order.getFoodItem())
        {
            orderDetails.add(new OrderItemDetails(food, listener,navigator));
        }
        revalidate();
        repaint(); 
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToOrder;
    private javax.swing.JLabel confirmOrder;
    private javax.swing.JList<String> foodList;
    private javax.swing.JTextArea itemDescription;
    private javax.swing.JPanel itemIngredients;
    private javax.swing.JLabel itemName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel orderDetails;
    private javax.swing.JButton removeFromOrder;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTextField specialRequestTextField;
    private javax.swing.JLabel subTotal;
    // End of variables declaration//GEN-END:variables



    
    

}