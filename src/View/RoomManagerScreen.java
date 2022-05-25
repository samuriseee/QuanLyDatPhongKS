/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Room;
import Model.ListRoom;
import Service.RoomsService;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Kiet
 */
public class RoomManagerScreen extends javax.swing.JPanel {
    RoomsService roomsService;
    private ListRoom arrRoom;
    private RoomsService roomService = new RoomsService();
    private DefaultTableModel model;
    public DefaultTableModel getModelTable() {
        DefaultTableModel model = (DefaultTableModel) RoomTable_15.getModel();
        return model;
    }

    public void setTable(ArrayList<Room> list) {
        getModelTable().getDataVector().removeAllElements();
        list.forEach((room) -> {
            getModelTable().addRow(new Object[]{room.getRoomNumber(),room.getRoomType(),room.getNumberOfBed(),room.getRates(),room.isAvainable()});
            System.out.println(room.isAvainable());
        });

    }

    public RoomManagerScreen() throws SQLException {
        initComponents();
        arrRoom = new ListRoom(roomService.getAllRooms());
        setTable(arrRoom.getArrListRoom());
        
        RoomTable_15.getTableHeader().setBackground(new Color(131, 184, 255));
        RoomTable_15.getTableHeader().setForeground(new Color(255, 255, 255));
        RoomTable_15.getTableHeader().setPreferredSize(new Dimension(35, 35));
        RoomTable_15.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
        model = getModelTable();
        model.addColumn("RoomNumber");
        model.addColumn("RoomType");
        model.addColumn("Rates");
        model.addColumn("NumberOfBed");
        model.addColumn("Available");
        roomsService = new RoomsService();
        ArrayList<Room> rooms = new ArrayList<>();
        rooms = roomsService.getAllRooms();
        setTable(rooms);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        RoomTable_15 = new javax.swing.JTable();
        jLabel1_15 = new javax.swing.JLabel();
        SearchInput_15 = new javax.swing.JTextField();
        javax.swing.JButton AddButton_15 = new javax.swing.JButton();
        jButton2_15 = new javax.swing.JButton();
        jButton3_15 = new javax.swing.JButton();
        jPanel3_15 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4_15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(236, 247, 253));

        RoomTable_15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        RoomTable_15.setForeground(new java.awt.Color(51, 51, 51));
        RoomTable_15.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        RoomTable_15.setRowHeight(35);
        RoomTable_15.setRowMargin(5);
        jScrollPane1.setViewportView(RoomTable_15);

        jLabel1_15.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1_15.setForeground(new java.awt.Color(36, 139, 214));
        jLabel1_15.setText("Room Management");

        SearchInput_15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SearchInput_15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 15), new java.awt.Color(36, 139, 214))); // NOI18N
        SearchInput_15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchInput_15KeyPressed(evt);
            }
        });

        AddButton_15.setBackground(new java.awt.Color(36, 139, 214));
        AddButton_15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        AddButton_15.setForeground(new java.awt.Color(255, 255, 255));
        AddButton_15.setText("Add New Room");
        AddButton_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton_15ActionPerformed(evt);
            }
        });

        jButton2_15.setBackground(new java.awt.Color(238, 224, 102));
        jButton2_15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2_15.setForeground(new java.awt.Color(255, 255, 255));
        jButton2_15.setText("Edit");

        jButton3_15.setBackground(new java.awt.Color(211, 71, 71));
        jButton3_15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton3_15.setForeground(new java.awt.Color(255, 255, 255));
        jButton3_15.setText("Delete");
        jButton3_15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_15ActionPerformed(evt);
            }
        });

        jPanel3_15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(36, 139, 214));
        jLabel2.setText("Total Room");

        javax.swing.GroupLayout jPanel3_15Layout = new javax.swing.GroupLayout(jPanel3_15);
        jPanel3_15.setLayout(jPanel3_15Layout);
        jPanel3_15Layout.setHorizontalGroup(
            jPanel3_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel3_15Layout.setVerticalGroup(
            jPanel3_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3_15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel4_15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(36, 139, 214));
        jLabel3.setText("Total Room");

        javax.swing.GroupLayout jPanel4_15Layout = new javax.swing.GroupLayout(jPanel4_15);
        jPanel4_15.setLayout(jPanel4_15Layout);
        jPanel4_15Layout.setHorizontalGroup(
            jPanel4_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel4_15Layout.setVerticalGroup(
            jPanel4_15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4_15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_15, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel4_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(SearchInput_15, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 180, 180)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddButton_15, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2_15, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3_15, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1_15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddButton_15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4_15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchInput_15, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3_15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2_15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddButton_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton_15ActionPerformed
        this.setVisible(false);
        AddNewRoomScreen addRoom = new AddNewRoomScreen();
        addRoom.setVisible(true);
    }//GEN-LAST:event_AddButton_15ActionPerformed

    private void jButton3_15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_15ActionPerformed
        // TODO add your handling code here:
        int row = RoomTable_15.getSelectedRow();
        int id = Integer.parseInt(String.valueOf(RoomTable_15.getValueAt(row, 0)));
        try {
            roomsService.deleteRoom(id);
        } catch (SQLException ex) {
            Logger.getLogger(RoomManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        model.setRowCount(0);
        ArrayList<Room> rooms = new ArrayList<>();
        try {
            rooms = roomsService.getAllRooms();
        } catch (SQLException ex) {
            Logger.getLogger(RoomManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        setTable(rooms);
    }//GEN-LAST:event_jButton3_15ActionPerformed
    public void searchTable(String value) {
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(getModelTable());
        RoomTable_15.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(value));
    }
    private void SearchInput_15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchInput_15KeyPressed
        // TODO add your handling code here:
        model.setRowCount(0);       
        ArrayList<Room> rooms = new ArrayList<>();
        if(SearchInput_15.getText().equals("")){
            try {
                rooms = roomsService.getAllRooms();
            } catch (SQLException ex) {
                Logger.getLogger(RoomManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                rooms = roomsService.SearchRoomsByString(SearchInput_15.getText());
            } catch (SQLException ex) {
                Logger.getLogger(RoomManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        setTable(rooms);

    }//GEN-LAST:event_SearchInput_15KeyPressed

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
//            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AdminScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RoomManagerScreen().setVisible(true);
                } catch (SQLException ex) {
//                    Logger.getLogger(RoomManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RoomTable_15;
    private javax.swing.JTextField SearchInput_15;
    private javax.swing.JButton jButton2_15;
    private javax.swing.JButton jButton3_15;
    private javax.swing.JLabel jLabel1_15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3_15;
    private javax.swing.JPanel jPanel4_15;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
