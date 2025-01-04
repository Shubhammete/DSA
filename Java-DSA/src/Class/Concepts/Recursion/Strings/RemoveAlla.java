package Class.Concepts.Recursion.Strings;

public class RemoveAlla {
    public static void main(String[] args) {
        Removea("baccad",0);
        System.out.println(ans);
        skip("","baccad");

        System.out.println(sameString("baccad"));
    }

    private static String sameString(String up) {
        if(up.isEmpty()){
            return "";
        }
        char ele = up.charAt(0);

        if(ele == 'a'){
            return sameString(up.substring(1));
        }else{
            return ele + sameString(up.substring(1));
        }
    }

    static String ans = "";
    private static void Removea(String in, int index) {
        if(index == in.length()){
            return;
        }
        if(in.charAt(index)=='a'){
            Removea(in,++index);
        }else{
            ans +=in.charAt(index);
            Removea(in,++index);
        }
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ele = up.charAt(0);

        if(ele == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ele,up.substring(1));
        }
    }


}
