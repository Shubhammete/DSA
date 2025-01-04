package Class.Concepts.Recursion.Strings;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        subset("","abc");
        System.out.println(sub("","abc"));
    }
    static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        subset(p+up.charAt(0),up.substring(1));
        subset(p,up.substring(1));
    }

    static ArrayList<String> sub(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> left = sub(p+up.charAt(0),up.substring(1));
        ArrayList<String> right = sub(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}
