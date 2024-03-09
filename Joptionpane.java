
package myfirst_java_gui_app;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
JOptionPane is a dialog box that shows prompt or take inputs or show customized massages
*/
public class Joptionpane {
    public static void main(String[] args) {
        
        //JOptionPane.showMessageDialog(null, "hello","hi", JOptionPane.PLAIN_MESSAGE);
      //  JOptionPane.showMessageDialog(null, "Here is more uselss info","hi", JOptionPane.INFORMATION_MESSAGE);
       // JOptionPane.showMessageDialog(null, "Realy","hi", JOptionPane.QUESTION_MESSAGE);
       //while(true) //to make pseudo virus
      // { JOptionPane.showMessageDialog(null, "hello","your computer has virus", JOptionPane.WARNING_MESSAGE);}
       //JOptionPane.showMessageDialog(null, "ehhhh!","hi", JOptionPane.ERROR_MESSAGE);
       //JOptionPane.showConfirmDialog(null,"say what","hilo",JOptionPane.OK_CANCEL_OPTION);
       int ans = JOptionPane.showConfirmDialog(null,"say what","hilo",JOptionPane.OK_CANCEL_OPTION);
        System.out.println(ans);// we could get true 1 false 0 cancel 2 value from this way by using JOptionPane.showConfirmDialog()
        // To take input from the JOptionPane we have to use
        String ask = JOptionPane.showInputDialog(null, "whats yo name G", "name check",JOptionPane.QUESTION_MESSAGE);
        System.out.println("hi "+ask);//To take STring as iputs we  have to use this mathods
        //To display all in together we use
        //To use image as icon we gotta do this
        
        ImageIcon icon = new ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\MyFirst_JAVA_GUI_App\\src\\myfirst_java_gui_app\\batman.png");
        //To make cutomize options we have to use array of data types
        String[] response = {"yes","i am Batman","I am Vengance"};
        JOptionPane.showOptionDialog(null,
                "ARE YOU BATMAN?", "yeet", 
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, 
                icon, 
                response, 
                0);
    }
  
}
