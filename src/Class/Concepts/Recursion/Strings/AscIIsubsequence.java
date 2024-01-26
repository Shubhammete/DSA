package Class.Concepts.Recursion.Strings;

public class AscIIsubsequence {
    public static void main(String[] args) {
        sub("abc","");
    }

    static void sub(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        sub(up.substring(1),p+ch);
        sub(up.substring(1),p);
        // convert into ascii value -> (char + 0)
        sub(up.substring(1),p+(ch+0));
    }
}
