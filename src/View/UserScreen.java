package View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.*;
import Service.UserService;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author MSII
 */
public class UserScreen extends javax.swing.JFrame {

    private ListRoom arrRoom;
    private UserService userService = new UserService();
    private int roomNumber = -1;
    private Room rm;
    private User ur;

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
        ur = user;
        this.setTitle("UserScreen");
        labelNameUser.setText(ur.getFirstName() + " " + ur.getLastName());
        labelNameUser1.setText(ur.getFirstName() + " " + ur.getLastName());
        arrRoom = new ListRoom(userService.getRoomByCategory(comboBox_ThanhHung155.getSelectedItem().toString()));
        setTable(arrRoom.getArrListRoom());
        this.pack();
        this.setLocationRelativeTo(null);
        tableUser_ThanhHung155.getTableHeader().setBackground(new Color(131, 184, 255));
        tableUser_ThanhHung155.getTableHeader().setForeground(new Color(255, 255, 255));
        tableUser_ThanhHung155.getTableHeader().setPreferredSize(new Dimension(35, 35));
        tableUser_ThanhHung155.getTableHeader().setFont(new Font("Arial", Font.BOLD, 15));
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser_ThanhHung155 = new javax.swing.JTable();
        Search_CTKiet206 = new javax.swing.JTextField();
        comboBox_ThanhHung155 = new javax.swing.JComboBox<>();
        btn_Booking_ThanhHung155 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNameAdmin1 = new javax.swing.JLabel();
        labelNameUser1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        labelNameAdmin = new javax.swing.JLabel();
        btnLogout_CTuanKiet206 = new javax.swing.JButton();
        labelNameUser = new javax.swing.JLabel();
        btnHistory_ThanhHung155 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UserScreen");

        jPanel1.setBackground(new java.awt.Color(236, 247, 253));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        tableUser_ThanhHung155.setBackground(new java.awt.Color(255, 255, 255));
        tableUser_ThanhHung155.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tableUser_ThanhHung155.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ROOM NUMBER", "ROOM TYPE", "RATES", "NUMBEROFBED", "AVAINABLE"
            }
        ));
        tableUser_ThanhHung155.setRowHeight(35);
        tableUser_ThanhHung155.setRowMargin(5);
        tableUser_ThanhHung155.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUser_ThanhHung155MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser_ThanhHung155);

        Search_CTKiet206.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        Search_CTKiet206.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 15), new java.awt.Color(36, 139, 214))); // NOI18N
        Search_CTKiet206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Search_CTKiet206ActionPerformed(evt);
            }
        });
        Search_CTKiet206.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_CTKiet206KeyReleased(evt);
            }
        });

        comboBox_ThanhHung155.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboBox_ThanhHung155.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Avainable", "UnAvainable" }));
        comboBox_ThanhHung155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_ThanhHung155ActionPerformed(evt);
            }
        });

        btn_Booking_ThanhHung155.setBackground(new java.awt.Color(36, 139, 214));
        btn_Booking_ThanhHung155.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_Booking_ThanhHung155.setForeground(new java.awt.Color(255, 255, 255));
        btn_Booking_ThanhHung155.setText("Book this room");
        btn_Booking_ThanhHung155.setBorder(null);
        btn_Booking_ThanhHung155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Booking_ThanhHung155ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Room avaiable :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Categories avaiable :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Booking_ThanhHung155, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(Search_CTKiet206, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(comboBox_ThanhHung155, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Search_CTKiet206, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(comboBox_ThanhHung155, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Booking_ThanhHung155, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(36, 139, 214));
        jLabel1.setText("User Reservation");

        labelNameAdmin1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelNameAdmin1.setForeground(new java.awt.Color(255, 255, 255));
        labelNameAdmin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account_circle_FILL1_wght700_GRAD0_opsz24.png"))); // NOI18N

        labelNameUser1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        labelNameUser1.setForeground(new java.awt.Color(102, 102, 102));
        labelNameUser1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNameAdmin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNameUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelNameAdmin1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelNameUser1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jPanel3.setBackground(new java.awt.Color(131, 184, 255));

        jPanel4.setBackground(new java.awt.Color(131, 184, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        labelNameAdmin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelNameAdmin.setForeground(new java.awt.Color(255, 255, 255));
        labelNameAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account_circle_FILL1_wght700_GRAD0_opsz24.png"))); // NOI18N

        btnLogout_CTuanKiet206.setBackground(new java.awt.Color(131, 184, 255));
        btnLogout_CTuanKiet206.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnLogout_CTuanKiet206.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout_CTuanKiet206.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout_FILL1_wght700_GRAD0_opsz24.png"))); // NOI18N
        btnLogout_CTuanKiet206.setText("Log Out");
        btnLogout_CTuanKiet206.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnLogout_CTuanKiet206.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout_CTuanKiet206.setPreferredSize(new java.awt.Dimension(80, 24));
        btnLogout_CTuanKiet206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogout_CTuanKiet206ActionPerformed(evt);
            }
        });

        labelNameUser.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        labelNameUser.setForeground(new java.awt.Color(255, 255, 255));
        labelNameUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnHistory_ThanhHung155.setBackground(new java.awt.Color(131, 184, 255));
        btnHistory_ThanhHung155.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnHistory_ThanhHung155.setForeground(new java.awt.Color(255, 255, 255));
        btnHistory_ThanhHung155.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/history3.png"))); // NOI18N
        btnHistory_ThanhHung155.setText("History");
        btnHistory_ThanhHung155.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnHistory_ThanhHung155.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistory_ThanhHung155.setPreferredSize(new java.awt.Dimension(80, 24));
        btnHistory_ThanhHung155.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistory_ThanhHung155ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout_CTuanKiet206, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(labelNameAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnHistory_ThanhHung155, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNameAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(labelNameUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(btnHistory_ThanhHung155, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout_CTuanKiet206, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Hotel_logo4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void searchTable(String value) {
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(getModelTable());
        tableUser_ThanhHung155.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(value));
    }

    private void Search_CTKiet206KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_CTKiet206KeyReleased
        searchTable(Search_CTKiet206.getText());
    }//GEN-LAST:event_Search_CTKiet206KeyReleased

    private void Search_CTKiet206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Search_CTKiet206ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Search_CTKiet206ActionPerformed

    private void tableUser_ThanhHung155MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUser_ThanhHung155MouseClicked
        int selectedRow = tableUser_ThanhHung155.getSelectedRow();
        roomNumber = Integer.parseInt(getModelTable().getValueAt(selectedRow, 0).toString());
        System.out.println(roomNumber);
    }//GEN-LAST:event_tableUser_ThanhHung155MouseClicked

    private void comboBox_ThanhHung155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_ThanhHung155ActionPerformed
        try {
            arrRoom.setArrListRoom(userService.getRoomByCategory(comboBox_ThanhHung155.getSelectedItem().toString()));
        } catch (SQLException ex) {
            Logger.getLogger(UserScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        setTable(arrRoom.getArrListRoom());
    }//GEN-LAST:event_comboBox_ThanhHung155ActionPerformed

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
                BookingRoom bkr = new BookingRoom(rm, ur, tableUser_ThanhHung155, arrRoom);
                bkr.setVisible(true);
            }

        }
    }//GEN-LAST:event_btn_Booking_ThanhHung155ActionPerformed

    private void btnHistory_ThanhHung155ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistory_ThanhHung155ActionPerformed
        try {
            HistoryBooking htrB = new HistoryBooking(ur);
            htrB.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(UserScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnHistory_ThanhHung155ActionPerformed

    private void btnLogout_CTuanKiet206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogout_CTuanKiet206ActionPerformed
        this.setVisible(false);
        LoginScreen lsc = new LoginScreen();
        lsc.setVisible(true);
    }//GEN-LAST:event_btnLogout_CTuanKiet206ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Search_CTKiet206;
    private javax.swing.JButton btnHistory_ThanhHung155;
    private javax.swing.JButton btnLogout_CTuanKiet206;
    private javax.swing.JButton btn_Booking_ThanhHung155;
    private javax.swing.JComboBox<String> comboBox_ThanhHung155;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNameAdmin;
    private javax.swing.JLabel labelNameAdmin1;
    private javax.swing.JLabel labelNameUser;
    private javax.swing.JLabel labelNameUser1;
    private javax.swing.JTable tableUser_ThanhHung155;
    // End of variables declaration//GEN-END:variables
}
