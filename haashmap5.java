import java.util.*;
public class haashmap5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a nume : ");
        String str=sc.nextLine();
      // String str="";  
       HashMap<String,Integer> map= new HashMap<>(); 
            String words[]=str.split(" ");
            for(String word:words){
                if(map.containsKey(word)){
                    map.put(word,map.get(word)+1);
                }else{
                    map.put(word,1);
                }
            }
            System.out.print(map);
    }
}
