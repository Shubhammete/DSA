package Class.Concepts.Recursion.Easy;

public class Palin {
    public static void main(String[] args) {
        System.out.println(pal(1234321));
    }

    private static boolean pal(int i) {
        String num = Integer.toString(i);
        int start = 0;
        int end = num.length()-1;
        return check(num,start,end);
    }

    private static boolean check(String num, int start, int end) {
        if(start==end){
            return true;
        }
        return num.charAt(start)== num.charAt(end) && check(num,++start,--end);
    }
}
