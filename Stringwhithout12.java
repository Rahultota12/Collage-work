public class Stringwhithout12 {
    public static void main(String[] args) {
        String s1="Rahul tot ITEG DIPLOMA";
        String s2="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=' '){
                s2=s2+s1.charAt(i);
            }
        }
        System.out.print("String without while space : "+s2);
    }
}
