import java.util.Scanner;
public class Armstrom11 {
    public static void main(String[] args) {
        int n,arm=0,c,rom;
        Scanner r=new Scanner(System.in);
        System.out.print("enter the number : ");
        n=r.nextInt();
        c=n;
        while(n>0);{ 
            rom=n%10;
            arm=(rom*rom*rom)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.print("Armstrom number");
        }
        else{
            System.out.print("not Armstrom number");
        }
        System.out.println();
        
    }

}
