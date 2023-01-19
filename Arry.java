import java.util.Scanner;
public class Arry{
    public static void main(String[]args){
      int lenth,  i;  
      Scanner sc=new Scanner(System.in);
        System.out.print("enter nter the lenth : ");
         lenth=sc.nextInt();
         int  arry[]=new int[lenth];
          for(i=0;i<lenth;i++){
            arry[i]=sc.nextInt();
    }
    System.out.println(" print Arry number : ");
    for(i=0;i<lenth;i++){
      System.out.println(arry[i]+" ");
    }
  }
}