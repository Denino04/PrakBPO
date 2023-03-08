/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lab Informatika
 */
import javax.swing.*;
import java.awt.*;

public class buttonlayout extends JFrame {
    
    JButton btnsave, btnlogin, btnsend, btncancel;
    
    public buttonlayout()
    {
        btnsave = new JButton ("Save");
        btnlogin = new JButton ("Login");
        btnsend = new JButton ("Send");
        btncancel = new JButton ("cancel");
    }
    
    public void showborderlayout()
    {
        setLayout(new BorderLayout());
        setTitle("Border Layout");
        add(btnsave, "North");
        add(btnlogin, "East");
        add(btnsend, "West");
        add(btncancel, "South");
        
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(3);
    }
    
    public void showgridlayout()
    {
        setLayout(new GridLayout(2, 2));
        setTitle("Border Layout");
        add(btnsave);
        add(btnlogin);
        add(btnsend);
        add(btncancel);
        
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(3);
    }
    
        public void showflowlayout()
    {
        setLayout(new FlowLayout());
        setTitle("Border Layout");
        add(btnsave);
        add(btnlogin);
        add(btnsend);
        add(btncancel);
        
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(3);
    }
}



