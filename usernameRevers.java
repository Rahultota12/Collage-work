import java.util.*;
public class usernameRevers {
    public static void main(String[] args) {
        int i,l,r;
        String obj=new String();
        Scanner sc=new Scanner(System.in);
        System.out.print("input the name:");
        String str=sc.nextLine();
        String r2=" ";
        l=str.length();
        for(i=l-1;i>=0;i--){
            r2=r2+str.charAt(i);
        }
        System.out.println(r2);
    }
}

