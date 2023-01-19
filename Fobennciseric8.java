import java.util.Scanner;
public class Fobennciseric8 {
    public static void main(String[] args) {
        int term, a=0,b=1,c;
        Scanner r=new Scanner(System.in);
        System.out.println("enter term : ");
        term=r.nextInt();
        for(int i=1;i<term;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
