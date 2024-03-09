
package myfirst_java_gui_app;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class New_window {
    
     JFrame fram = new JFrame();
     JLabel label = new JLabel("hello");
    New_window(){   
       label.setBounds(0, 0, 100, 50);
       label.setFont(new Font(null,Font.PLAIN,25));
  fram.add(label);
  fram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  fram.setSize(500,500);
  fram.setLayout(null);
  fram.setVisible(true);
  
    }
}
