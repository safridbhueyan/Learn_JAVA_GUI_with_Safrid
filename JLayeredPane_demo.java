
package myfirst_java_gui_app;
/*
JLayeredPane = its a swing container that provides a 3D positioning
               for components..exmple- depth,Z-index;
*/
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class JLayeredPane_demo {
    public static void main(String[] args) {
        JFrame frm = new JFrame();
       frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frm.setSize(500,500);
       
       JLabel lbl= new JLabel();
       lbl.setOpaque(true);
       lbl.setBackground(Color.red);
       lbl.setBounds(50, 50, 200, 200);
       
       JLabel lbl1= new JLabel();
       lbl1.setOpaque(true);
       lbl1.setBackground(Color.MAGENTA);
       lbl1.setBounds(100, 100,200, 200);
       
       JLabel lbl2= new JLabel();
       lbl2.setOpaque(true);
       lbl2.setBackground(Color.ORANGE);
       lbl2.setBounds(150,150, 200, 200);
       
       
       JLayeredPane jlp = new JLayeredPane();
  //we have to set bounds in order to use JLayeredPane()
       jlp.setBounds(0, 0, 500, 500);
       jlp.add(lbl,JLayeredPane.DEFAULT_LAYER);//we an use JLayeredPane.name_of_position to set its position
       jlp.add(lbl1,Integer.valueOf(3) );// Or we can use wrapper class like Integer.valueOf(value of position)
       jlp.add(lbl2,Integer.valueOf(2));// to set its position without using JLayeredPane.name_of_position to set its position
       
       
       
       frm.add(jlp);
       frm.setVisible(true);
    }
}
