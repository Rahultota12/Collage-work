public class Swastik {
    public static void main(String[] args) {
        int i,j;
        for(  i=1; i<=7; i++){
     for(  j=1; j<=7; j++){
          if(i==j|| j+i==8 ){
              System.out.print("* "); 
             }else{
            System.out.print("  ");
            }
                 }
              System.out.println();
           }}
    }
    