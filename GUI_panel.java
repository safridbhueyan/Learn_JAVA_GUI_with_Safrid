
package myfirst_java_gui_app;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


  //JFrame = is a GUI window to add components to ;
 //JLabel = is a GUI display area fotr a String of text,image or both;
//JPanel = is a GUI component that function as a container to hold other components

public class GUI_panel {
    public static void main(String[] args) {
        JFrame leed = new JFrame();
        JLabel pop = new JLabel();
        pop.setVerticalAlignment(JLabel.BOTTOM);
        pop.setHorizontalAlignment(JLabel.CENTER);
        pop.setBounds(110, 110, 100, 100);
        ImageIcon pic = new ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\MyFirst_JAVA_GUI_App\\src\\myfirst_java_gui_app\\pop1.png");
        pop.setText("BOX-1");
        pop.setIcon(pic);
        
        JPanel panel_1 = new JPanel();//To create a panel -(box)
        panel_1.setBackground(new Color(0,25,54));// set the backround color of panel -(box)
        panel_1.setBounds(0, 0, 250, 250);// set the size of panel -(box)
        panel_1.setLayout(new BorderLayout());// to move any objects within the panel easily 
    //  panel_1.setLayout(null);// to move any objects within the panel easily 
       
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(0,25,185));
        panel_2.setBounds(250, 0, 250, 250);
        panel_2.setLayout(new BorderLayout());
    //  panel_2.setLayout(null);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(115,56,255));
        panel_3.setBounds(0, 250, 500, 250);
        panel_3.setLayout(new BorderLayout());
     // panel_3.setLayout(null);
        
        
        panel_2.add(pop);// to add the image or Text or any component to any panel
        
        ImageIcon img = new ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\MyFirst_JAVA_GUI_App\\src\\myfirst_java_gui_app\\fbi.jpg");
        
        leed.setTitle("safrid");
        leed.setLayout(null);
        leed.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        leed.setSize(550,550);
        leed.setIconImage(img.getImage());
        leed.add(panel_1); 
        
      
       
        
        leed.add(panel_2);
        leed.add(panel_3);
        leed.setVisible(true);
        
    }
}
