package Class.Concepts.Recursion.Strings;

public class SkipApple {
    public static void main(String[] args) {
        System.out.println(sameString("aafapplintapplekkljf"));
    }

    private static String sameString(String up) {
        if(up.isEmpty()){
            return "";
        }


        if(up.startsWith("apple")){
            return sameString(up.substring(5));
        }else{
            return up.charAt(0) + sameString(up.substring(1));
        }
    }
}
