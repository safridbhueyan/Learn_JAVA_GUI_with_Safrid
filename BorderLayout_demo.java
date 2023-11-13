
package myfirst_java_gui_app;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JPanel;
// LAyout Manager = DEfins a natural Layout for a component within the a container
// 3 common managers 
// BorderLayout = A BorderLayout places component in 5 Areas 
// such as - north,south,east,west,center
// All extra space is placed in center area
public class BorderLayout_demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(10,10)); //to put all the panels in one single container like layout and also Margin all the blocks by setting values
        frame.setVisible(true);
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4= new JPanel();
        JPanel panel5 = new JPanel();
        
 // To add color to any panels we need to use this functions        
        
   panel1.setBackground(Color.red);
   panel2.setBackground(Color.BLUE);
   panel3.setBackground(Color.CYAN);
   panel4.setBackground(Color.DARK_GRAY);
   panel5.setBackground(Color.PINK);
 
 // To set the customize size of the borders
 
 //we have to use panelname.setPreferredSize(new Dimension(lenght,widht));
 
   panel1.setPreferredSize(new Dimension(50,100));
   panel2.setPreferredSize(new Dimension(50,100));
   panel3.setPreferredSize(new Dimension(50,100));
   panel4.setPreferredSize(new Dimension(100,100));
   panel5.setPreferredSize(new Dimension(50,100));
  
   //To make those Border visible in the programme we have to use this codes
  //frame.add(panelName, BorderLayout.NORTH);
  
  /*<------------SUB Panels ----------------->*/
  panel4.setLayout(new BorderLayout()); 
  /* To create a sub panel under any panel we have to set that certain panel to a unique container
  by using panel_name.setLayout(new BorderLayout());
  then create new panels and set colors 
  then to display the borders use panel_name.add(sub_panels) instead of using frame.add(panel_name)
  */
        JPanel panela = new JPanel();
        JPanel panelb = new JPanel();
        JPanel panelc = new JPanel();
        JPanel paneld = new JPanel();
        
   panela.setBackground(Color.LIGHT_GRAY);
   panelb.setBackground(Color.MAGENTA);
   panelc.setBackground(Color.lightGray);
   paneld.setBackground(Color.ORANGE);
   
   
   panela.setPreferredSize(new Dimension(50,50));
   panelb.setPreferredSize(new Dimension(50,50));
   panelc.setPreferredSize(new Dimension(50,50));
   paneld.setPreferredSize(new Dimension(50,50));
   
   panel4.add(panela,BorderLayout.NORTH);
   panel4.add(panelb,BorderLayout.EAST);
   panel4.add(panelc,BorderLayout.SOUTH);
   panel4.add(paneld,BorderLayout.WEST);
   
  /*<------------SUB Panels ----------------->*/
  
   frame.add(panel1, BorderLayout.NORTH); // BorderLayout.NORTH is use to setthe side or location of the borders
   frame.add(panel2, BorderLayout.EAST);
   frame.add(panel3,BorderLayout.WEST);
   frame.add(panel4,BorderLayout.CENTER);
   frame.add(panel5,BorderLayout.SOUTH);
    }
}
