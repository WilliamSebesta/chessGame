import java.awt.*;                                    // Wenn die Figuren an der Grundlinie sind verwandeln sie sich per Zufall                                                          
import javax.swing.*;                                 // in eine Figur mit dem Random Operator
import java.util.*;
import javax.swing.*;                                
import java.awt.event.ActionEvent;                    //Zwei Boolean Werte: - abwechselnde Züge der Spieler                                                                            - 
import java.awt.event.ActionListener;                                       
public class Schachbrett{
  public static JButton[][] button = new JButton [8][8];
  public static ImageLoader il;
  public static String [][]bild = new String [8][8];
  public static boolean [][]greenbg = new boolean[8][8];
  public static String lfColor = "white";    //last figure color
 
  
  
  
  
  public static void main(String[]args){
    
    for (int x = 0;x<8 ;x++ ) {
        for (int y = 0;y<8 ;y++ ) {
            bild[x][y] = "";
            greenbg[x][y] = false;  
        } // end of for
    } // end of for
         aufbau();
         spiel();
    }
  
  public static void spiel(){
    ActionListener listener = new ActionListener(){
      int lastx;
      int lasty;
      String lastbild = "";
      public void actionPerformed(ActionEvent e){
        for (int i = 0;i<8 ;i++ ) {
          for (int j = 0;j<8 ;j++ ) {
            if(e.getSource() == button[i][j]){
              if (greenbg[i][j]) {
                Moving.move(lastx,lasty,lastbild,i,j);  
              } // end of if
              else {
                standardbgcolor(lastx, lasty, lastbild);
                Coloring.mkColors(i,j);
              } // end of if-else
              lastx = i;
              lasty = j;
              lastbild = bild[i][j];
              }   
          } // end of for
        } // end of for     
    }
     
      };
    for(int i = 0;i<8 ;i++ ) {
      for (int j = 0;j<8 ;j++ ) {  
        button[i][j].addActionListener(listener);
      } // end of for
    } // end of for 
    }
  public static void aufbau(){
         JPanel panel = new JPanel();
         GridLayout gl = new GridLayout(8,8);
         panel.setLayout(gl);
         for (int y = 0;y<8 ;y++ ) {
             for (int x = 0;x<8 ;x++ ) {
                 panel.add(createButton(x,y));
             } // end of for
         } // end of for
        JFrame frame = new JFrame();
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
   public static JButton createButton(int x, int y){
          if (y<2 || y>5) {
             figures(x,y);     
          } // end of if
          else {
             button[x][y] = new JButton();  
          } // end of if-else          
          button[x][y].setOpaque(true);
          button[x][y].setPreferredSize(new Dimension(80,80));
          standardbgcolor(x,y,"");
          return button[x][y];
     }
     
     public static void standardbgcolor(int x,int y, String figure){
            if (x%2 == 0) {
             if (y%2 == 0) {
                button[x][y].setBackground(new java.awt.Color(185,139,98));
                greenbg[x][y] = false;  
             } // end of if 
             else {
                button[x][y].setBackground(new java.awt.Color(242,218,179));
                greenbg[x][y] = false;
             } // end of if-else 
          } // end of if
          else {
              if (y%2 == 0) {
                 button[x][y].setBackground(new java.awt.Color(242,218,179));
                 greenbg[x][y] = false;  
              } // end of if
              else {
                 button[x][y].setBackground(new java.awt.Color(185,139,98));
                 greenbg[x][y] = false;
              } // end of if-else
          } // end of if-else  
          
          Coloring.dltColors(figure, x, y);        
       }
  
     public static void figures(int x, int y){
            if (y==0) {
                if (x==0 || x==7) {
                   bild[x][y] = "black_rook";  
                   } // end of if
                else if (x==1 || x==6) {
                     bild[x][y] = "black_knight";  
                }
                else if (x==2 || x==5) {
                     bild[x][y] = "black_bishop";
                }
                else if (x==3) {
                     bild[x][y] = "black_queen";  
                }
                else {
                     bild[x][y] = "black_king";
                } // end of if-else
                } // end of if
      
                else if (y==1) {
                     bild[x][y] = "black_pawn";  
                }
      
                else if (y==6) {
                     bild[x][y] = "white_pawn";  
                }
      
                else {
                     if (x==0 || x==7) {
                        bild[x][y] = "white_rook";  
                        } // end of if
                     else if (x==1 || x==6) {
                          bild[x][y] = "white_knight";  
                          }
                     else if (x==2 || x==5) {
                          bild[x][y] = "white_bishop";
                          }
                     else if (x==3) {
                          bild[x][y] = "white_queen";  
                          }
                     else {
                     bild[x][y] = "white_king";
                     } // end of if-else  
                } // end of if-else
                il = new ImageLoader(x,y);
                button[x][y] = new JButton();
                button[x][y].setIcon(il.icon);       
     }        
  }

  