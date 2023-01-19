//import java.util.*;
public class SecondHighestnumber10 {
    public static void main(String[] args) {
        int[] num={45,54,44,66,88,99,545};
        int temp;
        for(int i=1;i<num.length;i++){
               for(int j=i+1;j<num.length;j++){
                if(num[i]<num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
             }
        }
       // for(int i=1;i<=num.length;i++){
       //     System.out.print(num[i]+" ");
      //  }
        System.out.print("Second highest number : " + num[2]);   
    }
}
