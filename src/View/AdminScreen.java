/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.*;
import bean.BeanList;
import controller.ScreenController;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author MSII
 */
public class AdminScreen extends javax.swing.JFrame {

    /**
     * Creates new form AdminScreen
     */
    public AdminScreen(){
        
    }
    public AdminScreen(User user_TuanKiet05) {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ScreenController controller = new ScreenController(jpnView);
        controller.setView(jpnUser, jlbUser);
        
        List<BeanList> listItem_TuanKiet05 = new ArrayList<>();
        listItem_TuanKiet05.add(new BeanList("NguoiDung",jpnUser,jlbUser));
        listItem_TuanKiet05.add(new BeanList("Phong",jpnRoom,jlbRoom));
        listItem_TuanKiet05.add(new BeanList("DatPhong",jpnReser,jlbReser));
        controller.setEvent(listItem_TuanKiet05);
        labelNameAdmin.setText(user_TuanKiet05.getFirstName() + " " + user_TuanKiet05.getLastName());
        this.pack();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jpnUser = new javax.swing.JPanel();
        jlbUser = new javax.swing.JLabel();
        jpnRoom = new javax.swing.JPanel();
        jlbRoom = new javax.swing.JLabel();
        jpnReser = new javax.swing.JPanel();
        jlbReser = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        labelNameAdmin = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jpnView = new javax.swing.JPanel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoginScreen");

        jPanel2.setBackground(new java.awt.Color(131, 184, 255));
        jPanel2.setForeground(new java.awt.Color(131, 184, 255));

        jpnUser.setBackground(new java.awt.Color(36, 139, 214));
        jpnUser.setForeground(new java.awt.Color(36, 139, 214));

        jlbUser.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlbUser.setForeground(new java.awt.Color(255, 255, 255));
        jlbUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/userMGN.png"))); // NOI18N
        jlbUser.setText("Users");

        javax.swing.GroupLayout jpnUserLayout = new javax.swing.GroupLayout(jpnUser);
        jpnUser.setLayout(jpnUserLayout);
        jpnUserLayout.setHorizontalGroup(
            jpnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUserLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jpnUserLayout.setVerticalGroup(
            jpnUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnUserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnRoom.setBackground(new java.awt.Color(131, 184, 255));
        jpnRoom.setForeground(new java.awt.Color(36, 139, 214));

        jlbRoom.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlbRoom.setForeground(new java.awt.Color(255, 255, 255));
        jlbRoom.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbRoom.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RoomMGN.png"))); // NOI18N
        jlbRoom.setText("Rooms");

        jpnReser.setBackground(new java.awt.Color(131, 184, 255));
        jpnReser.setForeground(new java.awt.Color(36, 139, 214));
        jpnReser.setPreferredSize(new java.awt.Dimension(231, 52));

        jlbReser.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jlbReser.setForeground(new java.awt.Color(255, 255, 255));
        jlbReser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbReser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/calendar_today_FILL1_wght700_GRAD0_opsz40.png"))); // NOI18N
        jlbReser.setText("Reservation");

        javax.swing.GroupLayout jpnReserLayout = new javax.swing.GroupLayout(jpnReser);
        jpnReser.setLayout(jpnReserLayout);
        jpnReserLayout.setHorizontalGroup(
            jpnReserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnReserLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbReser, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnReserLayout.setVerticalGroup(
            jpnReserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbReser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRoomLayout = new javax.swing.GroupLayout(jpnRoom);
        jpnRoom.setLayout(jpnRoomLayout);
        jpnRoomLayout.setHorizontalGroup(
            jpnRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRoomLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlbRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jpnReser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
        );
        jpnRoomLayout.setVerticalGroup(
            jpnRoomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRoomLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnReser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel3.setBackground(new java.awt.Color(131, 184, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "  ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        labelNameAdmin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        labelNameAdmin.setForeground(new java.awt.Color(255, 255, 255));
        labelNameAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/account_circle_FILL1_wght700_GRAD0_opsz24.png"))); // NOI18N
        labelNameAdmin.setText(" admin name");

        btnLogout.setBackground(new java.awt.Color(131, 184, 255));
        btnLogout.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout_FILL1_wght700_GRAD0_opsz24.png"))); // NOI18N
        btnLogout.setText("Log out");
        btnLogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(labelNameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(labelNameAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnRoom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jpnUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 949, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        this.setVisible(false);
        LoginScreen lsc = new LoginScreen();
        lsc.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlbReser;
    private javax.swing.JLabel jlbRoom;
    private javax.swing.JLabel jlbUser;
    private javax.swing.JPanel jpnReser;
    private javax.swing.JPanel jpnRoom;
    private javax.swing.JPanel jpnUser;
    private javax.swing.JPanel jpnView;
    private javax.swing.JLabel labelNameAdmin;
    // End of variables declaration//GEN-END:variables
}
