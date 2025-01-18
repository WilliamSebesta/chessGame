public class WhitePawn extends Schachbrett{
       public static void mkColors (int i, int j){
              if(j-1>-1){
                           button[i][j-1].setBackground(new java.awt.Color(153,255,153));
                           greenbg[i][j-1] = true;
                           if (i+1<8) {
                              button[i+1][j-1].setBackground(new java.awt.Color(153,255,153));
                              greenbg[i+1][j-1] = true;  
                           } // end of if
                           if (i-1>-1) {
                              button[i-1][j-1].setBackground(new java.awt.Color(153,255,153));
                              greenbg[i-1][j-1] = true;  
                           }
                  }      
                if(j-2>-1){
                           if (bild[i][j-1].equals("") && j-2 > -1) {
                           button[i][j-2].setBackground(new java.awt.Color(153,255,153));
                           greenbg[i][j-2] = true;  
                } // end of if
                  }
         }
       public static void dltColors(int x, int y){
              if (y-1>-1) {
             standardbgcolor(x,y-1,"");
             greenbg[x][y-1] = false;
             if (x+1<8) {
                standardbgcolor(x+1,y-1,"");
                greenbg[x+1][y-1] = false;  
             } // end of if
             if (x-1>-1) {
                  standardbgcolor(x-1, y-1,"");
                  greenbg[x-1][y-1] = false;  
             }  
             } // end of if
             if (y-2>-1) {
             standardbgcolor(x,y-2,""); 
             greenbg[x][y-2] = false;  
             } // end of if
         }
  }