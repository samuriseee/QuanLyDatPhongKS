/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Reservation;
import Service.*;
import com.raven.datechooser.EventDateChooser;
import com.raven.datechooser.SelectedAction;
import com.raven.datechooser.SelectedDate;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Kiet
 */
public class ReservationManagerScreen extends javax.swing.JPanel {
    private RevservationsService revservationsService_thanhHung155 = new RevservationsService();
    private ArrayList<Reservation> reservations_thanhHung155 ;
    private Reservation reservationCk_thanhHung155 ;
    private int romNb , cusId , reserNb ;
    /**
     * Creates new form ReservationManagerScreen
     */
    
    public DefaultTableModel getModelTable() {
        DefaultTableModel model = (DefaultTableModel) tableReservation_thanhHung155.getModel();
        return model;
    }

    public void setTable(ArrayList<Reservation> list) {
        getModelTable().getDataVector().removeAllElements();
        list.forEach((reservation) -> {
            getModelTable().addRow(new Object[]{reservation.getReservationNumber() , reservation.getCustomerId(), reservation.getRoomNumber(), reservation.getCheckInDate(), reservation.getCheckOutDate(), reservation.getNumberOfGuests(), reservation.getReservationDate()});
        });
    }
    
    public void searchTable(String value) {
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(getModelTable());
        tableReservation_thanhHung155.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(value));
    }
    
    public ReservationManagerScreen() throws SQLException {
        initComponents();
        dateChooser.addEventDateChooser(new EventDateChooser() {
            @Override
            public void dateSelected(SelectedAction action, SelectedDate date) {
                System.out.println(date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
                if (action.getAction() == SelectedAction.DAY_SELECTED) {
                    dateChooser.hidePopup();
                }
            }
        });
        reservations_thanhHung155 = revservationsService_thanhHung155.getAllReservation();
        int allReservation_thanhHung155 = reservations_thanhHung155.size();
        totalReservation_thanhHung155.setText(Integer.toString(allReservation_thanhHung155));
        Double totalIncome_thanhHung155 = revservationsService_thanhHung155.getAllRates() ;
        totalInCome_thanhHung155.setText(totalIncome_thanhHung155.toString() + "$");
        setTable(reservations_thanhHung155);
        tableReservation_thanhHung155.getTableHeader().setBackground(new Color(131, 184, 255));
        tableReservation_thanhHung155.getTableHeader().setForeground(new Color(255, 255, 255));
        tableReservation_thanhHung155.getTableHeader().setPreferredSize(new Dimension(35, 35));
        tableReservation_thanhHung155.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser = new com.raven.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReservation_thanhHung155 = new javax.swing.JTable();
        btnCheckOut_thanhHung155 = new javax.swing.JButton();
        SearchInput = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        totalReservation_thanhHung155 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        totalInCome_thanhHung155 = new javax.swing.JLabel();

        dateChooser.setForeground(new java.awt.Color(97, 155, 231));

        jPanel1.setBackground(new java.awt.Color(236, 247, 253));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 678));

        tableReservation_thanhHung155.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tableReservation_thanhHung155.setForeground(new java.awt.Color(51, 51, 51));
        tableReservation_thanhHung155.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ReservationNumber", "CustomerId", "RoomNumber", "CheckInDate", "CheckOutDate", "NumberOfGuests", "ReservationDate"
            }
        ));
        tableReservation_thanhHung155.setPreferredSize(new java.awt.Dimension(300, 140));
        tableReservation_thanhHung155.setRowHeight(35);
        tableReservation_thanhHung155.setRowMargin(5);
        tableReservation_thanhHung155.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableReservation_thanhHung155MouseClicked(evt);
            }
        });
        tableReservation_thanhHung155.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableReservation_thanhHung155KeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tableReservation_thanhHung155);

        btnCheckOut_thanhHung155.setBackground(new java.awt.Color(36, 139, 214));
        btnCheckOut_thanhHung155.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCheckOut_thanhHung155.setForeground(new java.awt.Color(255, 255, 255));
        btnCheckOut_thanhHung155.setText("Check Out");
        btnCheckOut_thanhHung155.setPreferredSize(new java.awt.Dimension(103, 35));
        btnCheckOut_thanhHung155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOut_thanhHung155ActionPerformed(evt);
            }
        });

        SearchInput.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        SearchInput.setForeground(new java.awt.Color(0, 0, 0));
        SearchInput.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 15), new java.awt.Color(36, 139, 214))); // NOI18N
        SearchInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchInputKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 139, 214));
        jLabel1.setText("Reservation Management");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Total Reservation", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(36, 139, 214))); // NOI18N

        totalReservation_thanhHung155.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalReservation_thanhHung155.setForeground(new java.awt.Color(36, 139, 214));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalReservation_thanhHung155, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalReservation_thanhHung155, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Total Income", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(36, 139, 214))); // NOI18N
        jPanel5.setPreferredSize(new java.awt.Dimension(274, 101));

        totalInCome_thanhHung155.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        totalInCome_thanhHung155.setForeground(new java.awt.Color(36, 139, 214));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalInCome_thanhHung155, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(totalInCome_thanhHung155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(SearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCheckOut_thanhHung155, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1011, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCheckOut_thanhHung155, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1140, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableReservation_thanhHung155MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableReservation_thanhHung155MouseClicked
        int selectedRow = tableReservation_thanhHung155.getSelectedRow();
        reserNb = Integer.parseInt(getModelTable().getValueAt(selectedRow, 0).toString());
        cusId = Integer.parseInt(getModelTable().getValueAt(selectedRow, 1).toString());
        romNb = Integer.parseInt(getModelTable().getValueAt(selectedRow, 2).toString());
        reservations_thanhHung155.forEach(reservation -> {
            if(reservation.getReservationNumber() == reserNb){
                reservationCk_thanhHung155 = reservation ;
            }
        });
        
    }//GEN-LAST:event_tableReservation_thanhHung155MouseClicked

    private void btnCheckOut_thanhHung155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckOut_thanhHung155ActionPerformed
        CheckOutScreen coscr;
        SelectedDate d = dateChooser.getSelectedDate();
        String currentDate = d.getDay() + "-" + d.getMonth() + "-" + d.getYear() ;
        try {
            coscr = new CheckOutScreen(romNb , cusId , reservationCk_thanhHung155 , currentDate , tableReservation_thanhHung155 ,reservations_thanhHung155 );
            coscr.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ReservationManagerScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnCheckOut_thanhHung155ActionPerformed

    private void SearchInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchInputKeyReleased
        searchTable(SearchInput.getText());
    }//GEN-LAST:event_SearchInputKeyReleased

    private void tableReservation_thanhHung155KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableReservation_thanhHung155KeyReleased
        
    }//GEN-LAST:event_tableReservation_thanhHung155KeyReleased
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchInput;
    private javax.swing.JButton btnCheckOut_thanhHung155;
    private com.raven.datechooser.DateChooser dateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableReservation_thanhHung155;
    private javax.swing.JLabel totalInCome_thanhHung155;
    private javax.swing.JLabel totalReservation_thanhHung155;
    // End of variables declaration//GEN-END:variables

}
