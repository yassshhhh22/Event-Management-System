package event_management_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame {
    Dashboard() {
        super("Event MANAGEMENT SYSTEM");
        setBounds(300, 300, 1366, 768);
        
        // Load and resize the image to fit the window size
        ImageIcon originalImageIcon = new ImageIcon("Y:/College/advance java/EventManagementSystem-main/EventManagementSystem-main/Images/Origami.png");
        Image originalImage = originalImageIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);

        // Create JLabel with the resized image as background
        JLabel NewLabel = new JLabel(resizedImageIcon);
        NewLabel.setBounds(0, 0, getWidth(), getHeight()); 
        add(NewLabel);
        
        // Shadow text (glow effect)
        JLabel shadowLabel = new JLabel("Origami Crane Wedding Planners Welcomes You");
        shadowLabel.setForeground(new Color(100, 100, 100)); // Darker shadow color
        shadowLabel.setFont(new Font("Tahoma", Font.PLAIN, 46));
        shadowLabel.setBounds(205, 65, 1000, 85); // Slightly offset for shadow effect
        NewLabel.add(shadowLabel);
        
        // Main text (glowing effect)
        JLabel AirlineManagementSystem = new JLabel("Origami Crane Wedding Planners Welcomes You");
        AirlineManagementSystem.setForeground(new Color(255, 215, 0)); // Bright yellow for the glow
        AirlineManagementSystem.setFont(new Font("Tahoma", Font.PLAIN, 46));
        AirlineManagementSystem.setBounds(200, 60, 1000, 85);
        NewLabel.add(AirlineManagementSystem);
        
        // Menu bar setup
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        // Reception menu
        JMenu jm1 = new JMenu("Reception");
        jm1.setForeground(Color.RED);
        menuBar.add(jm1);
        
        JMenuItem a1 = new JMenuItem("Admin");
        jm1.add(a1);

        JMenuItem a2 = new JMenuItem("Add Venue");
        jm1.add(a2);
        a2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    String s[] = new String[]{"id","name","image_url","price","capacity","facilites","description"}; 
                    setVisible(false);
                    new addtodb(s, "venue").setVisible(true);
                } catch(Exception e) {}
            }
        });

        JMenuItem a3 = new JMenuItem("Add Photographer");
        jm1.add(a3);
        a3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    String s[] = new String[]{"id","name","contact_id","price","duration"}; 
                    setVisible(false);
                    new addtodb(s, "photographer").setVisible(true);
                } catch(Exception e) {}
            }
        });

        JMenuItem a4 = new JMenuItem("Add Caterer");
        jm1.add(a4);
        a4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    String s[] = new String[]{"id","Caterer","Menu","Budget/Plate"}; 
                    setVisible(false);
                    new addtodb(s, "caterer").setVisible(true);
                } catch(Exception e) {}
            }
        });

        JMenuItem b2 = new JMenuItem("Back");
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    setVisible(false);
                    new Event_Management_System().setVisible(true);
                } catch(Exception e) {}
            }
        });
        jm1.add(b2);

        // Event Management menu
        JMenu jm2 = new JMenu("Event MANAGEMENT");
        jm2.setForeground(Color.BLUE);
        menuBar.add(jm2);

        JMenuItem venue = new JMenuItem("Venue");
        jm2.add(venue);
        venue.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new viewdetails("venue").setVisible(true);
                } catch(Exception e) {}
            }
        });

        JMenuItem photographer = new JMenuItem("Photographer");
        jm2.add(photographer);
        photographer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new viewdetails("photographer").setVisible(true);
                } catch(Exception e) {}
            }
        });

        JMenuItem caterer = new JMenuItem("Caterer");
        jm2.add(caterer);
        caterer.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try {
                    new viewdetails("caterer").setVisible(true);
                } catch(Exception e) {}
            }
        });

        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        Dashboard d = new Dashboard();
    }
}
