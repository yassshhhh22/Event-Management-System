/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event_management_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author Himanshu Agarwal
 */
public class Event_Management_System extends JFrame {
    Event_Management_System(){
        setBounds(300, 300, 1366, 768);

        getContentPane().setBackground(Color.WHITE);

        // Load and resize the image to fit the window size
        ImageIcon originalImageIcon = new ImageIcon("Y:/College/advance java/EventManagementSystem-main/EventManagementSystem-main/Images/event.png");
        Image originalImage = originalImageIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);

        // Set the resized image as the label's icon
        JLabel l1 = new JLabel(resizedImageIcon);
        l1.setBounds(0, 0, getWidth(), getHeight());
        add(l1);

        // Customer button
        JButton b1 = new JButton("Customer");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(800, 300, 150, 50);
        l1.add(b1);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                new Login1("customer").setVisible(true);
            }
        });

        // Admin button
        JButton b2 = new JButton("Admin");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(1000, 300, 150, 50);
        l1.add(b2);
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                setVisible(false);
                new Login1("admin").setVisible(true);
            }
        });

        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        Event_Management_System m = new Event_Management_System();
    }
}
