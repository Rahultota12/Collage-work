public class Arry2 {
  public static void main(String[] args) {
    int size,i,j;
    int a[]={5,5,3,2,2,3};
    for(i=0;i<=a.length;i++){
        for(j=i+1;j<=a.length;j++){
            if((a[i]==a[j])&&(i!=j)){
                System.out.println(a[j]+" , ");
            }
        }  
    }
  }   
}
