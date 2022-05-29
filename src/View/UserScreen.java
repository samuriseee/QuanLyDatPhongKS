/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.*;
import Service.UserService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSII
 */
public class UserScreen extends javax.swing.JFrame {

    private ListRoom arrRoom;
    private UserService userService = new UserService();
    private int roomNumber = -1;
    private Room rm;
    private User ur ;

    /**
     * Creates new form CustomerScreen
     */
    public DefaultTableModel getModelTable() {
        DefaultTableModel model = (DefaultTableModel) tableUser_ThanhHung155.getModel();
        return model;
    }

    public void setTable(ArrayList<Room> list) {
        getModelTable().getDataVector().removeAllElements();
        list.forEach((room) -> {
            getModelTable().addRow(new Object[]{room.getRoomNumber(), room.getRoomType(), room.getRates(), room.getNumberOfBed(), room.isAvainable()});
        });
    }

    public UserScreen(User user) throws SQLException {
        initComponents();
        ur = user ;
        this.setTitle("UserScreen");
        labelNameUser.setText(ur.getFirstName() + " " + ur.getLastName());
        arrRoom = new ListRoom(userService.getRoomByCategory(comboBox_ThanhHung155.getSelectedItem().toString()));
        setTable(arrRoom.getArrListRoom());
        this.pack();
        this.setLocationRelativeTo(null);
    }

    private UserScreen() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNameUser = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser_ThanhHung155 = new javax.swing.JTable();
        comboBox_ThanhHung155 = new javax.swing.JComboBox<>();
        label1_ThanhHung155 = new javax.swing.JLabel();
        btn_Booking_ThanhHung155 = new javax.swing.JButton();
        labelHtrbk_thanhHung155 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNameUser.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Hellu user");

        tableUser_ThanhHung155.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Rates", "NumberOfBed", "Avainable"
            }
        ));
        tableUser_ThanhHung155.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUser_ThanhHung155MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser_ThanhHung155);

        comboBox_ThanhHung155.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Avainable", "UnAvainable" }));
        comboBox_ThanhHung155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_ThanhHung155ActionPerformed(evt);
            }
        });

        label1_ThanhHung155.setText("Category Avainable :");

        btn_Booking_ThanhHung155.setText("Booking");
        btn_Booking_ThanhHung155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Booking_ThanhHung155ActionPerformed(evt);
            }
        });

        labelHtrbk_thanhHung155.setText("HistoryBooking");
        labelHtrbk_thanhHung155.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labelHtrbk_thanhHung155.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelHtrbk_thanhHung155MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelHtrbk_thanhHung155, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_Booking_ThanhHung155, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1_ThanhHung155, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_ThanhHung155, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1_ThanhHung155)
                        .addGap(10, 10, 10)
                        .addComponent(comboBox_ThanhHung155, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Booking_ThanhHung155)
                    .addComponent(labelHtrbk_thanhHung155))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        LoginScreen lsc = new LoginScreen();
        lsc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboBox_ThanhHung155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_ThanhHung155ActionPerformed
        try {
            arrRoom.setArrListRoom(userService.getRoomByCategory(comboBox_ThanhHung155.getSelectedItem().toString()));
        } catch (SQLException ex) {
            Logger.getLogger(UserScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        setTable(arrRoom.getArrListRoom());
    }//GEN-LAST:event_comboBox_ThanhHung155ActionPerformed

    private void tableUser_ThanhHung155MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUser_ThanhHung155MouseClicked
        int selectedRow = tableUser_ThanhHung155.getSelectedRow();
        roomNumber = Integer.parseInt(getModelTable().getValueAt(selectedRow, 0).toString());
        System.out.println(roomNumber);
    }//GEN-LAST:event_tableUser_ThanhHung155MouseClicked

    private void btn_Booking_ThanhHung155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Booking_ThanhHung155ActionPerformed
        if (roomNumber == -1) {
            JOptionPane.showMessageDialog(null, "Please choose a room !", "SomeThing wrong", JOptionPane.ERROR_MESSAGE);
        } else {
            arrRoom.getArrListRoom().forEach(room -> {
                if (roomNumber == room.getRoomNumber()) {
                    rm = room;
                }
            });
            if (!rm.isAvainable()) {
                JOptionPane.showMessageDialog(null, "This room is already booked, please choose another room !", "SomeThing wrong", JOptionPane.ERROR_MESSAGE);
            } else {
                BookingRoom bkr = new BookingRoom(rm ,ur , tableUser_ThanhHung155 , arrRoom);
                bkr.setVisible(true);
            }

        }

    }//GEN-LAST:event_btn_Booking_ThanhHung155ActionPerformed

    private void labelHtrbk_thanhHung155MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelHtrbk_thanhHung155MouseClicked
        try {
            HistoryBooking htrB = new HistoryBooking(ur);
            htrB.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(UserScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_labelHtrbk_thanhHung155MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Booking_ThanhHung155;
    private javax.swing.JComboBox<String> comboBox_ThanhHung155;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1_ThanhHung155;
    private javax.swing.JLabel labelHtrbk_thanhHung155;
    private javax.swing.JLabel labelNameUser;
    private javax.swing.JTable tableUser_ThanhHung155;
    // End of variables declaration//GEN-END:variables
}
