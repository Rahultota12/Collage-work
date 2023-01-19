import java.util.*;
public class paridromnuber7 {
    public static void main(String[] args) {
        int n,s=0,r,c;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any number : ");
        n=sc.nextInt();
        c=n;
        while(n>0){
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }if(c==s){
            System.out.println(" palindrome number : ");
        }else{
               System.out.println("not palindrome number :");
        }
    }
}
