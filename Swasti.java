public class Swasti {
        public static void main(String[] args) {
            int s=21;
            for( int i=1; i<=s; i++){
                for( int j=1; j<=s; j++){
                    if( i==11 || j==11 || i==1 && j>=11 || i==21 && j<=11 || i<=11 && j==1 || i>=11 && j==21){
   System.out.print("* "); 
          }else{
        System.out.print("  ");
           }
         }
      System.out.println();
   }
}

}       

