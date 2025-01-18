public class Rook extends Schachbrett{
       public static void mkColors(int i, int j){
              for (int y = j+1;y<8 ;y++ ) {
                    button[i][y].setBackground(new java.awt.Color(153,255,153));
                     greenbg[i][y] = true;
                  if (!bild[i][y].equals("")) {
                     break;        
                  } // end of if
                } // end of for
                for (int y = j-1;y>=0 ;y-- ) {
                    button[i][y].setBackground(new java.awt.Color(153,255,153));
                    greenbg[i][y] = true;
                    if (!bild[i][y].equals("")) {
                       break;      
                    } // end of if
                         
                } // end of for
                for (int x = i+1;x<8 ;x++) {
                  button[x][j].setBackground(new java.awt.Color(153,255,153));
                  greenbg[x][j] = true;
                  if (!bild[x][j].equals("")) {
                     break;     
                  } // end of if 
                } // end of for
                for (int x = i-1;x>=0 ;x-- ) {
                    button[x][j].setBackground(new java.awt.Color(153,255,153));
                       greenbg[x][j] = true;
                    if (!bild[x][j].equals("")) {
                        break;    
                    } // end of if  
                } // end of for
         }
       public static void dltColors(int x, int y){
              for (int i = 0;i<8 ;i++ ) {
                   standardbgcolor(i,y,""); 
                   greenbg[i][y] = false; 
               } // end of for 
               for (int j = 0;j<8 ;j++ ) {
                   standardbgcolor(x,j,"");
                   greenbg[x][j] = false;  
               } // end of for
         }
  }