public class Knight extends Schachbrett{
       public static void mkColors(int i, int j){
              if (i+1 <= 7 && i+1 >= 0 && j-2 <= 7 && j-2 >= 0) {
                  button[i+1][j-2].setBackground(new java.awt.Color(153,255,153));
                  greenbg[i+1][j-2] = true;
                } // end of if
                if (i+2 <= 7 && i+2 >= 0 && j-1 <= 7 && j-1 >= 0) {
                  button[i+2][j-1].setBackground(new java.awt.Color(153,255,153));
                  greenbg[i+2][j-1] = true;
                } // end of if
                if (i+2 <= 7 && i+2 >= 0 && j+1 <= 7 && j+1 >= 0) {
                  button[i+2][j+1].setBackground(new java.awt.Color(153,255,153));
                  greenbg[i+2][j+1] = true;
                } // end of if
                if (i+1 <= 7 && i+1 >= 0 && j+2 <= 7 && j+2 >= 0) {
                  button[i+1][j+2].setBackground(new java.awt.Color(153,255,153));
                  greenbg[i+1][j+2] = true;
                } // end of if
                if (i-1 <= 7 && i-1 >= 0 && j+2 <= 7 && j+2 >= 0) {
                  button[i-1][j+2].setBackground(new java.awt.Color(153,255,153));
                  greenbg[i-1][j+2] = true;
                } // end of if
                if (i-2 <= 7 && i-2 >= 0 && j+1 <= 7 && j+1 >= 0) {
                  button[i-2][j+1].setBackground(new java.awt.Color(153,255,153));
                  greenbg[i-2][j+1] = true;
                } // end of if
                if (i-2 <= 7 && i-2 >= 0 && j-1 <= 7 && j-1 >= 0) {
                  button[i-2][j-1].setBackground(new java.awt.Color(153,255,153));
                  greenbg[i-2][j-1] = true;
                } // end of if
                if (i-1 <= 7 && i-1 >= 0 && j-2 <= 7 && j-2 >= 0) {
                  button[i-1][j-2].setBackground(new java.awt.Color(153,255,153));
                  greenbg[i-1][j-2] = true;
                } // end of if
         }
       public static void dltColors(int x, int y){
              
         }
  }
