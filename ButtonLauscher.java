import java.awt.*;
import javax.swing.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class ButtonLauscher extends Schachbrett implements ActionListener{ 
      public void actionPerformed(ActionEvent e){
             if(e.getSource() == button[x][y]){
               button[x][y].setBackground(Color.GREEN);
               }
        }
  }