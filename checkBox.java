
package myfirst_java_gui_app;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


    public class checkBox extends JFrame implements ActionListener {
JTextField text; //we have to set the object Globally so that we can access it in our action listener box
JButton button;
JCheckBox  checkbox;
ImageIcon img ;
ImageIcon img1 ;
    
   checkBox (){

  button = new JButton("submit");
  button.setFocusable(false);
  button.addActionListener(this);//without this button wont work
  checkbox = new JCheckBox("Are you Batman?");
  checkbox.setFocusable(false);
  checkbox.setFont(new Font("consolas",Font.PLAIN,35));
  img = new ImageIcon ("C:\\Users\\User\\Documents\\NetBeansProjects\\MyFirst_JAVA_GUI_App\\src\\myfirst_java_gui_app\\batman.png");    
  img1 = new ImageIcon ("C:\\Users\\User\\Documents\\NetBeansProjects\\MyFirst_JAVA_GUI_App\\src\\myfirst_java_gui_app\\10522.png ");
    checkbox.setIcon(img1);
      checkbox.setSelectedIcon(img);
  
  
  
this.add(checkbox);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());
this.add(button);
this.pack();//to set the size according to the added components
this.setVisible(true);
    
    
    
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button){
           System.out.println(checkbox.isSelected());
         
       }
    }
    
}
