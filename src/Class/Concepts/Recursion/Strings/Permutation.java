package Class.Concepts.Recursion.Strings;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        perm("","abc");
        System.out.println(permlist("","abc"));
        System.out.println(permcount("","abc"));
    }

    private static int permcount(String up, String p) {
        if(p.isEmpty()){
            return 1;
        }
        int count = 0;
        char a = p.charAt(0);
        for(int i = 0; i<=up.length();i++){
            String f = up.substring(0,i);
            String s = up.substring(i,up.length());
            count += permcount(f+a+s,p.substring(1));
        }
        return count;
    }

    private static void perm(String up, String p) {
        if(p.isEmpty()){
            System.out.println(up);
            return;
        }
        char ch = p.charAt(0);
        for(int i = 0;i<=up.length();i++){
            String f = up.substring(0,i);
            String s = up.substring(i,up.length());
            perm(f+ch+s,p.substring(1));
        }
    }

    static ArrayList<String> permlist(String up, String p){

        if(p.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add(up);
            return ans;
        }

        char a = p.charAt(0);
        ArrayList<String> finalans = new ArrayList<>();
        for(int i = 0; i <= up.length();i++){
            String f = up.substring(0,i);
            String s = up.substring(i,up.length());
            finalans.addAll(permlist(f+a+s,p.substring(1)));
        }
        return finalans;
    }
}
