public class King extends Schachbrett{
  
       public static void mkColors(int i, int j){
              if (i+1 >= 0 && i+1 <= 7) {
                 button[i+1][j].setBackground(new java.awt.Color(153,255,153));  
                  greenbg[i+1][j] = true;
              } // end of if  
              if (i-1 >= 0 && i-1 <= 7) {
                 button[i-1][j].setBackground(new java.awt.Color(153,255,153));
                 greenbg[i-1][j] = true;  
              } // end of if
              if ( j+1>= 0 && j+1 <= 7) {
                 button[i][j+1].setBackground(new java.awt.Color(153,255,153)); 
                 greenbg[i][j+1] = true; 
              } // end of if
              if (j-1 >= 0 && j-1 <= 7) {
                 button[i][j-1].setBackground(new java.awt.Color(153,255,153));  
                  greenbg[i][j-1] = true;
              } // end of if
              if (i+1 >= 0 && i+1 <= 7 && j+1 >= 0 && j+1 <=7) {
                 button[i+1][j+1].setBackground(new java.awt.Color(153,255,153));  
                 greenbg[i+1][j+1] = true;
              } // end of if
              if (i-1 >= 0 && i-1 <= 7 && j-1 >= 0 && j-1 <= 7) {
                 button[i-1][j-1].setBackground(new java.awt.Color(153,255,153)); 
                 greenbg[i-1][j-1] = true; 
              } // end of if
              if (i+1 >= 0 && i+1 <= 7 && j-1 >= 0 && j-1 <= 7) {
                 button[i+1][j-1].setBackground(new java.awt.Color(153,255,153));  
                  greenbg[i+1][j-1] = true;
              } // end of if
              if (i-1 >= 0 && i-1 <= 7 && j+1 >= 0 && j+1 <= 7) {
                 button[i-1][j+1].setBackground(new java.awt.Color(153,255,153));  
                  greenbg[i-1][j+1] = true;
              } // end of 
         }
  
         public static void dltColors (int x, int y){
                if (x+1 >= 0 && x+1 <= 7) {
                 standardbgcolor(x+1,y,"");
                 greenbg[x+1][y] = false; 
              } // end of if  
              if (x-1 >= 0 && x-1 <= 7) { 
                 standardbgcolor(x-1,y,"");
                 greenbg[x-1][y] = false; 
              } // end of if
              if ( y+1>= 0 && y+1 <= 7) {
                 standardbgcolor(x,y+1,"");
                 greenbg[x][y+1] = false;  
              } // end of if
              if (y-1 >= 0 && y-1 <= 7) {
                 standardbgcolor(x,y-1,"");
                 greenbg[x][y-1] = false;  
              } // end of if
              if (x+1 >= 0 && x+1 <= 7 && y+1 >= 0 && y+1 <=7) {
                 standardbgcolor(x+1,y+1,"");
                 greenbg[x+1][y+1] = false;  
              } // end of if
              if (x-1 >= 0 && x-1 <= 7 && y-1 >= 0 && y-1 <= 7) {
                 standardbgcolor(x-1,y-1,"");
                 greenbg[x-1][y-1] = false;  
              } // end of if
              if (x+1 >= 0 && x+1 <= 7 && y-1 >= 0 && y-1 <= 7) {
                 standardbgcolor(x+1,y-1,"");
                 greenbg[x+1][y-1] = false;
              } // end of if
              if (x-1 >= 0 && x-1 <= 7 && y+1 >= 0 && y+1 <= 7) {
                 standardbgcolor(x-1,y+1,"");
                 greenbg[x-1][y+1] = false;
              } // end of if
         
           }
  }