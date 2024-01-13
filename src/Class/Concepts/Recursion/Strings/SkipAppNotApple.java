package Class.Concepts.Recursion.Strings;

public class SkipAppNotApple{
    public static void main(String[] args) {
        System.out.println(fxn("artappleneappii"));
    }
    static String fxn(String p){
        if(p.isEmpty()){
            return "";
        }
        if(p.startsWith("app") && !p.startsWith("apple")){
            return  fxn(p.substring(3));
        }else{
            return p.charAt(0)+fxn(p.substring(1));
        }

    }
}
