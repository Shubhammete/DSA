package Class.Concepts.String;

public class Palindrome {
    public static void main(String[] args) {
        String name = "Nitin";
        boolean flag = true ;
        name = name.toLowerCase();
        for(int i = 0; i<name.length()/2;i++){
            char start = name.charAt(i);
            char end = name.charAt(name.length() - 1 - i);

            if(start != end){
                flag = false;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
