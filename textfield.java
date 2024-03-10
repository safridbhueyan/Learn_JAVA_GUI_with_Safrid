
package myfirst_java_gui_app;

//JTextField = A GUI TextBox Component to store ,add,set or get text

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class textfield extends JFrame implements ActionListener {
JTextField text; //we have to set the object Globally so that we can access it in our action listener box
JButton button;
    textfield (){
    
  
  
  button = new JButton("submit");
  button.addActionListener(this);//without this button wont work
  text = new JTextField();
  text.setPreferredSize(new Dimension(250,40));// set the text field size
  text.setFont(new Font("consolas",Font.PLAIN,35));//to change font size
  text.setForeground(Color.green);//To set the font color we use this
  text.setBackground(Color.BLACK);
  text.setCaretColor(Color.WHITE);//to change coursor(|) color we use this
  

  
  
  
  
       

this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setLayout(new FlowLayout());
this.add(text);
this.add(button);
this.pack();//to set the size according to the added components
this.setVisible(true);
    
    
    
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==button){
           System.out.println("welcome "+ text.getText()); 
       
       }
    }
    
}
