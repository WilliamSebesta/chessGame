import java.awt.*;
import javax.swing.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;                   
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
public class Moving extends Schachbrett{
       public static void move(int lastx, int lasty, String lastbild, int i, int j){
                 if (lastbild.contains("pawn")) {
                    if ((i == lastx + 1 || i == lastx - 1) && ((lastbild.contains("black") &&
                     bild[i][j].contains("white")) || 
                    (lastbild.contains("white") && bild[i][j].contains("black")))) {
                       kingalive(i,j);
                       changeIcons(lastx, lasty, lastbild, i, j);  
                    } // end of if
                    else if (i != lastx + 1 && i != lastx - 1 && bild[i][j].equals("")) {
                       changeIcons(lastx, lasty, lastbild, i, j); 
                    }
                    else {                       
                       Schachbrett.standardbgcolor(lastx, lasty, lastbild);
                       Coloring.mkColors(i,j);  
                    } // end of if-else  
                 } // end of if
         
                 else {
                      if (!lastbild.equals("") && (bild[i][j].equals("") || (bild[i][j].contains("black") &&
                       lastbild.contains("white")) || (bild[i][j].contains("white") && lastbild.contains("black")))) {
                         kingalive(i,j);
                         changeIcons(lastx, lasty, lastbild, i, j);  
                      } // end of if
                      else {
                           
                           Schachbrett.standardbgcolor(lastx, lasty, lastbild);
                           Coloring.mkColors(i,j);  
                      } // end of if-else
                  
                } // end of if-else              
       }
  
  
       public static void changeIcons(int lastx,int lasty, String lastbild, int i, int j){
              if (lfColor.equals("black")) {
                 lfColor = "white";  
              } // end of if
              else {
                lfColor = "black";
              } // end of if-else
              ImageLoader image = new ImageLoader(lastbild);
              button[i][j].setIcon(image.icon);
              button[lastx][lasty].setIcon(null);
              if (bild[i][j].contains("king")) {
                 if (lastbild.contains("white")) {
                    System.out.println("Weiß hat gewonnen!");  
                 } // end of if 
                 else {
                    System.out.println("Schwarz hat gewonnen!");
                 } // end of if-else 
              } // end of if
              bild[lastx][lasty] = "";
              bild[i][j] = lastbild;
              standardbgcolor(lastx, lasty, lastbild);     
         }
       public static void kingalive (int i, int j){
              if (bild[i][j] == "white_king") {
                          ende("black");
                          System.exit(0);   
                       } // end of if
              else if (bild[i][j] == "black_king") {
                            ende("white");
                            System.exit(0);                         
                       }
         } 
       public static void ende(String color){
              JOptionPane.showMessageDialog(null, color + " has won");
              ImageIcon icon = new ImageIcon("bild.jpg");
              JOptionPane.showMessageDialog(null, "Spiel zu ende", "Meldung", JOptionPane.INFORMATION_MESSAGE, icon);
         }          
}