
package myfirst_java_gui_app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*FlowLayout = places componets in a Row, sized at their preferble size
               if the horizontal space in the container is too small.
               the FlowLayout() classes uses the next available Row
*/
public class flowLayout {
    public static void main(String[] args) {
       JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());// to make small floating layout boxes we have to use
               
     frame.add(new JButton("1"));
     frame.add(new JButton("2"));
     frame.add(new JButton("3"));
     frame.add(new JButton("4"));
     frame.add(new JButton("5"));
     frame.add(new JButton("6"));
     frame.add(new JButton("7"));
     frame.add(new JButton("8"));
     frame.add(new JButton("9"));
     frame.add(new JButton("10"));                           //FlowLayout() function in  frame.setLayout(new FlowLayout());
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250,250));
        panel.setBackground(Color.CYAN);
        panel.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
        //  panel.setLayout(new FlowLayout(FlowLayout.LEADING,10,10));
       // this will help us to set the button size and the placing area wether its starting from left right or center
      // also we can set its width and hieght (FlowLayout.LEADING,10,10) by this .
        
     panel.add(new JButton("01"));
     panel.add(new JButton("02"));
     panel.add(new JButton("03"));
     panel.add(new JButton("04"));
     panel.add(new JButton("05"));
     panel.add(new JButton("06"));
     panel.add(new JButton("07"));
     panel.add(new JButton("08"));
     panel.add(new JButton("09"));
     panel.add(new JButton("10"));
     panel.add(new JButton("11"));
     panel.add(new JButton("12"));
     
     
     
     
     
     frame.add(panel);
     frame.setVisible(true);
    }
    
}
