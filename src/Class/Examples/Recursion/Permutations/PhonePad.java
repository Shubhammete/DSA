package Class.Examples.Recursion.Permutations;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        pad("12","");
        System.out.println(padret("12",""));
    }

    static void pad(String p, String up){
        if(p.isEmpty()){
            System.out.println(up);
            return;
        }
        // convert input digit into no
        int digit = p.charAt(0) - '0';  // converts '1' to 1
        for(int i = (digit-1)*3; i<digit*3;i++){
            char a = (char) ('a'+ i);
            pad(p.substring(1),up+a);
        }
    }

    static ArrayList<String> padret(String p, String up){
        if(p.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        int digit = p.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for(int i = (digit-1)*3; i < digit*3; i++){
            char a = (char)('a'+ i);
            list.addAll(padret(p.substring(1),up+a));
        }

        return list;
    }
}
