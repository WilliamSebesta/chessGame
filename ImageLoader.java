 import java.io.*;
 import javax.imageio.ImageIO;
 import javax.swing.*;
 
 
 public class ImageLoader extends Moving{
        Icon icon;
        public ImageLoader(int x, int y){
               try {
                   icon = new ImageIcon("pieces/" + bild[x][y] + ".png");    
               } catch(Exception e) {
                  e.printStackTrace();
               } 
          }
        public ImageLoader(String figure){
               try {
                   icon = new ImageIcon("pieces/" + figure + ".png");    
               } catch(Exception e) {
                  e.printStackTrace();
               } 
          }
        
   }

   