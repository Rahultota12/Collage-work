import java.util.*;
public class userReplece {
        public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter the Name : ");
         String str=sc.nextLine();
            str=" ";
          String name = "Rahultota ";
           System.out.println(" "+str);
           str=str.replace(str,name);
           System.out.println(" replace to " + name);
        }
    
    }
