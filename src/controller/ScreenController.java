/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.ReservationManagerScreen;
import View.RoomManagerScreen;
import View.ClientManagerScreen;
import javax.swing.JPanel;
import bean.BeanList;
import java.awt.Color;
import java.util.List;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Kiet
 */
public class ScreenController {
    private JPanel root;
    private String kindSelected = "";
    
    private List<BeanList> listItem = null;

    public ScreenController(JPanel jpnroot) {
        this.root = jpnroot;
    }
    
    public void setView (JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "NguoiDung";
        
        jpnItem.setBackground(new Color(36,139,214));
        jlbItem.setBackground(new Color(36,139,214));
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new ClientManagerScreen());
        root.validate();
        root.repaint();
        
    }
    public void setEvent(List<BeanList> listItem) {
        this.listItem = listItem;
        
        for(BeanList item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(),item.getJpn(),item.getJlb()));
            
        }
    }
    class LabelEvent implements MouseListener {
        private JPanel node;
        private String kind;
        
        private JPanel jpnItem;
        private JLabel jlbItem;

        
        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jlbItem = jlbItem;
            this.jpnItem = jpnItem;
        }
        
        @Override 
        public void mouseClicked (MouseEvent e) {
            switch(kind) {
                case "NguoiDung":
                    node = new ClientManagerScreen();
                    break;
                case "Phong":
                {
                    try {
                        node = new RoomManagerScreen();
                    } catch (SQLException ex) {
                        Logger.getLogger(ScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

                case "DatPhong":
                {
                    try {
                        node = new ReservationManagerScreen();
                    } catch (SQLException ex) {
                        Logger.getLogger(ScreenController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                    break;

                default:
                    node = new ClientManagerScreen();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }
        
        @Override 
        public void mousePressed (MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(new Color(36,139,214));
            jlbItem.setBackground(new Color(36,139,214));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(36,139,214));
            jlbItem.setBackground(new Color(36,139,214));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(131,184,255));
                jlbItem.setBackground(new Color(131,184,255));
            }
        }
        
        private void setChangeBackground(String kind){
            for (BeanList item : listItem) {
                if(item.getKind().equalsIgnoreCase(kind)) {
                    item.getJlb().setBackground(new Color(36,139,214));
                    item.getJpn().setBackground(new Color(36,139,214));
                }
                else {
                    item.getJlb().setBackground(new Color(131,184,255));
                    item.getJpn().setBackground(new Color(131,184,255));
                }
            }
        }
    }
}
