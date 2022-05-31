
package View;
import Model.*;
import Service.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;


public class CheckOutScreen extends javax.swing.JFrame {
    private RoomsService roomsService_thanhHung155 = new RoomsService();
    private RevservationsService revservationsService_thanhHung155 = new RevservationsService();
    private UserService userService_thanhHung155 = new UserService();
    private Reservation reservation_thanhHung155;
    private Room room_thanhHung155 ;
    private User user_thanhHung155 ;
    private String crDate_thanhHUng155 ;
    private JTable referenceTableReservation_thanhHung155 ;
    private ArrayList<Reservation> listReservation_thanhHung155;
    
    
    public DefaultTableModel getModelTable() {
        DefaultTableModel model = (DefaultTableModel) referenceTableReservation_thanhHung155.getModel();
        return model;
    }

    public void setTable(ArrayList<Reservation> list) {
        getModelTable().getDataVector().removeAllElements();
        list.forEach((reservation) -> {
            getModelTable().addRow(new Object[]{reservation.getReservationNumber() , reservation.getCustomerId(), reservation.getRoomNumber(), reservation.getCheckInDate(), reservation.getCheckOutDate(), reservation.getNumberOfGuests(), reservation.getReservationDate()});
        });
    }
    
    
    public CheckOutScreen(int roomNumber_thanhHung155 , int cusId_thanhHung155 , Reservation res_thanhHung155 ,String currentDate_thanhHung155
            ,JTable tableFromRe_thanhHung155 , ArrayList<Reservation> arrReservation_thanhHung155) throws SQLException {
        initComponents();
        room_thanhHung155 = roomsService_thanhHung155.getRoomByRoomNumber(roomNumber_thanhHung155);
        user_thanhHung155 = userService_thanhHung155.getUserById(cusId_thanhHung155);
        reservation_thanhHung155 = res_thanhHung155 ;
        crDate_thanhHUng155 = currentDate_thanhHung155 ;
        referenceTableReservation_thanhHung155 = tableFromRe_thanhHung155 ;
        listReservation_thanhHung155 = arrReservation_thanhHung155 ;
        Too.setText(String.valueOf(room_thanhHung155.getRates()));
    }

    private CheckOutScreen() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

 
 public void bill_print(){
        try {
            bill.setText("                         Dao Tien Hotel \n");
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            bill.setText(bill.getText() + "Name :"+ "  "+ user_thanhHung155.getFirstName() + " " + user_thanhHung155.getLastName() + "\n");
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            bill.setText(bill.getText() + "Phone Number:"+ "  "+user_thanhHung155.getPhoneNumber() + "\n");
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            bill.setText(bill.getText() + "Room Number:"+ "  "+ room_thanhHung155.getRoomNumber() + "\n");
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            bill.setText(bill.getText() + "Rates:"+ "  "+ room_thanhHung155.getRates() + "\n");
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            bill.setText(bill.getText() + "NumberOfGuest:"+"  "+ reservation_thanhHung155.getNumberOfGuests() + "\n");
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            bill.setText(bill.getText() + "CheckInDate:"+ "  " + reservation_thanhHung155.getCheckInDate() + "\n");
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            bill.setText(bill.getText() + "CheckOutDate"+ "  " + crDate_thanhHUng155 + "\n");
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            bill.setText(bill.getText() + "ReservationDate:"+ "  " + reservation_thanhHung155.getReservationDate() + "\n");
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            bill.setText(bill.getText() + "SubTotal :\t"+Too.getText()+"\n");
            bill.setText(bill.getText() + "Cash :\t"+Cash.getText()+"\n");
            bill.setText(bill.getText() + "Ballance :\t"+Bal.getText()+"\n");
            bill.setText(bill.getText() + "====================================\n");
            bill.setText(bill.getText() +"                     Thank you for your presence...!"+"\n");
            bill.setText(bill.getText() + "----------------------------------------------------------------\n");
            bill.setText(bill.getText() +"                     See Your Again <3"+"\n");
            
            
            bill.print();
            
        } catch (PrinterException ex) {
            
            Logger.getLogger(CheckOutScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
 
 }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        Too = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cash = new javax.swing.JTextField();
        Bal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CheckOutScreen");

        jPanel3.setBackground(new java.awt.Color(236, 247, 253));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(36, 139, 214));
        jLabel6.setText("Checkout Payment");

        Too.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Too.setText("0");
        Too.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TooActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 139, 214));
        jLabel1.setText("Total:");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setText("Cash:");

        Cash.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Cash.setText("0");

        Bal.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        Bal.setText("0");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 0));
        jLabel3.setText("Balance:");

        jButton13.setBackground(new java.awt.Color(36, 139, 214));
        jButton13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Make a payment");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(204, 204, 204));
        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Print invoice");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/checkout2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Bal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Too, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(0, 74, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton14)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Too, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bill.setColumns(20);
        bill.setRows(5);
        jScrollPane2.setViewportView(bill);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        bill_print();
        try {
            roomsService_thanhHung155.updateRoomById(room_thanhHung155.getRoomNumber());
            revservationsService_thanhHung155.setReservationCheckOutDate(reservation_thanhHung155.getReservationNumber(), crDate_thanhHUng155);
            listReservation_thanhHung155 = revservationsService_thanhHung155.getAllReservation();
            setTable(listReservation_thanhHung155);
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(CheckOutScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Double tot = Double.valueOf(Too.getText());
        Double chs = Double.valueOf(Cash.getText());
        Double bal = chs - tot ;

        DecimalFormat df = new DecimalFormat("00.00");
        Bal.setText(String.valueOf(df.format(bal)));

    }//GEN-LAST:event_jButton13ActionPerformed

    private void TooActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TooActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TooActionPerformed

    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bal;
    private javax.swing.JTextField Cash;
    private javax.swing.JTextField Too;
    private javax.swing.JTextArea bill;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
