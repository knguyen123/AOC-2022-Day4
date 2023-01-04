import java.io.*;
import java.util.*;
public class day4 {
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
         if(s1<=s2&&e2<=e1){
            num++;   
         }else if (s2<=s1&&e1<=e2){
            num++;
         }
      }
      System.out.print(num+"");
      
   }
}
