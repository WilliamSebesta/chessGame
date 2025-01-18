import java.awt.*;
public class Coloring extends Moving{
       public static void mkColors(int i, int j){
              if (bild[i][j].contains("black")) {
                 button[i][j].setBackground(new java.awt.Color(255,255,0));  
              } // end of if
              else {
                 button[i][j].setBackground(new java.awt.Color(0,255,255));  
              } // end of if-else
              
              if (bild[i][j] == "white_pawn" && lfColor == "white") {
                WhitePawn.mkColors(i,j);
                
                
              } // end of if
              else if (bild[i][j] == "black_pawn" && lfColor == "black") {
                   BlackPawn.mkColors(i,j);     
                               
              }
              else if (bild[i][j].contains("knight") && bild[i][j].contains(lfColor)) {
                   Knight.mkColors(i,j);        
              }
              
              else if (bild[i][j].contains("rook") && bild[i][j].contains(lfColor)) {
                   Rook.mkColors(i,j);  
              }
              
              else if (bild[i][j].contains("bishop")  && bild[i][j].contains(lfColor)) {
                Bishop.mkColors(i,j);
              }
              
              else if (bild[i][j].contains("queen") && bild[i][j].contains(lfColor)){
                Queen.mkColors(i,j);
              } // end of if-else
              else if (bild[i][j].contains("king") && bild[i][j].contains(lfColor)) {
              King.mkColors(i,j);
              }
         }
  
         public static void dltColors(String figure, int x, int y){
         if (figure == "white_pawn") {
             WhitePawn.dltColors(x,y);
             
              
          } // end of if    
          else if (figure == "black_pawn" ) {
             BlackPawn.dltColors(x,y);                 
          }      
          else if (figure.contains("knight")) {
             Knight.dltColors(x,y);     
          }
          else if (figure.contains("rook")) {
               Rook.dltColors(x,y); 
          }
         else if (figure.contains("bishop")) {
              Bishop.dltColors(x,y);  
         }
         else if (figure.contains("queen")) {
              Queen.dltColors(x,y);
         }
         
         else if (figure.contains("king")) {
              King.dltColors(x,y);      
         }
       }        
  }