
package myfirst_java_gui_app;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
// we can inherite the frame from JFrame to use it by a constructor
// we also need to implement an ActionListener interface to set the commands or Actions of the buttons 
//and use @Override public void actionPerformed(ActionEvent e){ to set the actions with basic coding like if else }
// To use any BUTTTOn in INTERface We NEED TO DEcLear it AS A GLOBAL VARIABLE 
public class myFrame extends JFrame implements ActionListener{
    JButton button;
    JLabel label;
    myFrame(){
        
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\MyFirst_JAVA_GUI_App\\src\\myfirst_java_gui_app\\horny.jpg");
        ImageIcon icon2 = new ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\MyFirst_JAVA_GUI_App\\src\\myfirst_java_gui_app\\sal.jpg");
        
     label = new JLabel();
     label.setIcon(icon2);
     label.setBounds(500, 100, 700, 500);
     label.setVisible(false);
      
     //JButton button = new JButton(); //to create a button we need to use JButton name = new JButton(); methods
     button = new JButton(); // to use any GLOBAl variable 
     
     button.setBounds(10, 100, 500, 500);
     button.addActionListener(this); // To show the command that we implemented in our interface we need to add button.addActionListener(this);
  // button.addActionListener(e -> System.out.println("lil pump")); //we can also use lembda expression to avoid interface and also use the addAction buttton to set command or action in button 
     button.setText("CLICK me DADDY");
     button.setFocusable(false);// to avoid the unwanted border layout of button text
     button.setIcon(icon);
     button.setHorizontalTextPosition(JButton.CENTER);
     button.setVerticalTextPosition(JButton.BOTTOM);
     button.setFont(new Font("comic sans",Font.BOLD,25));
     button.setIconTextGap(-210);
     button.setForeground(Color.black);
     button.setBackground(Color.LIGHT_GRAY);
     button.setBorder(BorderFactory.createEtchedBorder());
   
     
     
     
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(1230, 700);
    this.setVisible(true);
    this.add(button);
    this.add(label);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== button)
        System.out.println("sex");
       label.setVisible(true);
        // button.setEnabled(false);// to make button to be used only once
    }

   
}
