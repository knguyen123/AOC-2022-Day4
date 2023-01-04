import java.io.*;
import java.util.*;
public class day4P2 {
   public static void main(String[] args) throws FileNotFoundException{
      Scanner f = new Scanner(new File("ID.txt"));
      int num = 0;
      while(f.hasNextLine()){
         String s = f.nextLine();
         int s1 = Integer.parseInt(s.substring(0,s.indexOf("-")));
         s = s.substring(s.indexOf("-")+1);
         int e1 = Integer.parseInt(s.substring(0,s.indexOf(",")));
         s = s.substring(s.indexOf(",")+1);
         int s2 = Integer.parseInt(s.substring(0,s.indexOf("-")));
         s = s.substring(s.indexOf("-")+1);
         int e2 = Integer.parseInt(s);
         boolean b = false;
         for(int i = s1; i <= e1; i++){
            for(int j = s2; j <= e2; j++){
               if(i==j){
                  num++;
                  b = true;
                  break;
               }
            }
            if(b){
               break;
            }  
         }
      }
      System.out.print(num+"");
      
   }
}
