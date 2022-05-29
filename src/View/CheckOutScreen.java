
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        bill = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Too = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Bal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Cash = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bill.setColumns(20);
        bill.setRows(5);
        jScrollPane2.setViewportView(bill);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Total :");

        Too.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Too.setText("0");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Balance :");

        Bal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Bal.setText("0");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Cash :");

        Cash.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Cash.setText("0");

        jButton13.setFont(jButton13.getFont().deriveFont(jButton13.getFont().getSize()+12f));
        jButton13.setText("PAY");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton14.setText("Print");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Too, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 90, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1))
                    .addComponent(Too))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(Cash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Bal))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Double tot = Double.valueOf(Too.getText());
        Double chs = Double.valueOf(Cash.getText());
        Double bal = chs - tot ;
       
       DecimalFormat df = new DecimalFormat("00.00");
       Bal.setText(String.valueOf(df.format(bal)));
        
        
    }//GEN-LAST:event_jButton13ActionPerformed

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

    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bal;
    private javax.swing.JTextField Cash;
    private javax.swing.JLabel Too;
    private javax.swing.JTextArea bill;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
