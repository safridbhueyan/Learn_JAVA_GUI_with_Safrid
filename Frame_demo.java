
package myfirst_java_gui_app;


import java.awt.Color;
import java.awt.Font;
import javax.swing.border.Border; // must for avoiding borderline error
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Frame_demo {

    //JFrame = is a GUI window to add components to ;
   //JLabel = is a GUI display area fotr a String of text,image or both;
    public static void main(String[] args) {
        
        
        Border border = BorderFactory.createLineBorder(new Color(255,255,255), 5)  ;// Creates border
        
        
        JLabel label = new JLabel();  // creates a Label
        label.setText("Welcome to Arkhem Asylum"); // set text of label
        label.setHorizontalTextPosition(JLabel.CENTER);// set text at left,right,center of image icon
        label.setVerticalTextPosition(JLabel.TOP);// set text at TOP,Bottom,center of image icon
        label.setForeground(new Color(255,255,255));// To change text color
        label.setFont(new Font("MV Boli",Font.PLAIN,20));// To set the font style and size as well as type
        label.setIconTextGap(-50); // Set the gap of text to Image 
        
        label.setBackground(new Color(0,15,56));// to set background color by label obj
        label.setOpaque(true);// To display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set the vertical position of icon+text
        label.setHorizontalAlignment(JLabel.CENTER);// set the Horizontal position of icon+text
        ImageIcon bat = new ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\MyFirst_JAVA_GUI_App\\src\\myfirst_java_gui_app\\bats.jpg");
        label.setIcon(bat);// to set image as background
        //label.setBounds(100, 100, 250, 250); // its set the x and y dimension of layout as well as its hieght and width
        
        JFrame frame = new JFrame();  // creates a frame
        frame.setTitle("BATMAN"); // sets Title of the frame
        frame.add(label);// to display the label text
        //frame.setSize(600,450);//sets X dimension and Y dimension of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//EXit out of application by default its set as HIDE_ON_CLOSE
        frame.setResizable(true); //prevents frame from being resized
        //frame.setLayout(null);//to set x y dimension of layout
      
        frame.setVisible(true); // make frame visible 
        
        ImageIcon image = new ImageIcon("C:\\Users\\User\\Documents\\NetBeansProjects\\MyFirst_JAVA_GUI_App\\src\\myfirst_java_gui_app\\batman.png"); // Create an Image icon but work aint over yet we gotta set the imageicon in order to see
        frame.getContentPane().setBackground(new Color(0,15,56));//To change background color
        frame.setIconImage(image.getImage()); // Change icon of frame
        frame.pack();// Auto resizing mathod if we use this we dont need  //frame.setSize(600,450) this function // we have to use at the end of the code
    }
    
}
