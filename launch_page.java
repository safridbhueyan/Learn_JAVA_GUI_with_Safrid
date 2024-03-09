
package myfirst_java_gui_app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
TO create a new window in jave we have to follow few methods
1) create a main class
2) create a launch class and a constructor of that class add all the
buttons and frames
3) implements the class to ActionListener and call a override ActionPerformed method
 so that whenever we click the buttton we get the new window.
4) create a new window class and add the frame and labels
5) call the launch class by creating its object in the main class
*/

public class launch_page implements ActionListener {
    
    JFrame frame = new JFrame();
    JButton button = new JButton("click me");
            
    
    launch_page(){
  button.setBounds(200, 160, 100, 40);// this will set the size of the button  
  button.setFocusable(false);//To remove the unwanted marks around he button
  button.addActionListener(this);
        
        
     frame.add(button);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(500,500);
  frame.setLayout(null);
  frame.setVisible(true);
  
   
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button)
       {
           frame.dispose(); //to avoid the multiple window opening
       New_window window = new New_window();
       }
    }
}
