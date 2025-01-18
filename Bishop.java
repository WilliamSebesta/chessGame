public class Bishop extends Schachbrett{
       public static void mkColors(int i, int j){
              for (int x = 1;x<8 ;x++ ) {
                  if (i+x >= 0 && i+x <= 7 && j+x >= 0 && j+x <= 7) {
                    button[i+x][j+x].setBackground(new java.awt.Color(153,255,153)); 
                    greenbg[i+x][j+x] = true;
                    if(!bild[i+x][j+x].equals("")){
                      break;
                      }
                   } // end of if
                } // end of for
                for (int x=1;x<8 ;x++ ) {
                    if (i+x >= 0 && i+x <= 7 && j-x >= 0 && j-x <= 7) {
                    button[i+x][j-x].setBackground(new java.awt.Color(153,255,153)); 
                    greenbg[i+x][j-x] = true;
                    if (!bild[i+x][j-x].equals("")) {
                       break;  
                    } // end of if
                   } // end of if 
                } // end of for
                for (int x=1;x<8 ;x++ ) {
                    if (i-x >= 0 && i-x <= 7 && j-x >= 0 && j-x <= 7) {
                    button[i-x][j-x].setBackground(new java.awt.Color(153,255,153));
                    greenbg[i-x][j-x] = true;
                    if (!bild[i-x][j-x].equals("")) {
                       break;  
                    } // end of if 
                   } // end of if  
                } // end of for
                for (int x=1;x<8 ;x++ ) {
                    if (i-x >= 0 && i-x <= 7 && j+x >= 0 && j+x <= 7) {
                    button[i-x][j+x].setBackground(new java.awt.Color(153,255,153));
                    greenbg[i-x][j+x] = true;
                    if(!bild[i-x][j+x].equals("")){ 
                        break; 
                   } // end of if 
                   
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
               for (int i = 1;i<8 ;i++ ) {
                  if (x+i >= 0 && x+i <= 7 && y+i >= 0 && y+i <= 7) {
                    standardbgcolor(x+i,y+i,"");
                    greenbg[x+i][y+i] = false; 
                   } // end of if
                  if (x+i >= 0 && x+i <= 7 && y-i >= 0 && y-i <= 7) {
                    standardbgcolor(x+i,y-i,"");
                    greenbg[x+i][y-i] = false;
                   } // end of if
                  if (x-i >= 0 && x-i <= 7 && y-i >= 0 && y-i <= 7) {
                    standardbgcolor(x-i,y-i,"");
                    greenbg[x-i][y-i] = false; 
                   } // end of if
                  if (x-i >= 0 && x-i <= 7 && y+i >= 0 && y+i <= 7) {
                    standardbgcolor(x-i,y+i,"");
                    greenbg[x-i][y+i] = false; 
                   } // end of if 
              } // end of for
           }
  }