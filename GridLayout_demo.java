
package myfirst_java_gui_app;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
/*
GridLayout() = places components in a grid of cells.
               Each components takes all available space within its cell
               and Each cell is the same size
*/
public class GridLayout_demo {

    public GridLayout_demo() {
    }
    public static void main(String[] args) {
        JFrame frm = new JFrame();
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setSize(500,500);
        frm.setLayout(new GridLayout(3,3,10,0));//raw,column,horizontel,verical
                                                          //we canset the size width and height,row and column 
    // we can create button in 2 ways shortcut way is frame.add(new JButton(("name"));
    
      frm.add(new JButton("1"));
      frm.add(new JButton("2"));
      frm.add(new JButton("3"));
      frm.add(new JButton("4"));
      frm.add(new JButton("5"));
      frm.add(new JButton("6"));
      frm.add(new JButton("7"));
      frm.add(new JButton("8"));
      frm.add(new JButton("9"));
     frm.setVisible(true);
    }
 
}
