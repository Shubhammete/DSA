public class demo {
    public static void main(String[] args) {
        int a = 15;
        int sum = 1;
        for (int i = 1; i <= 5; i++) {
            sum += Math.pow(i, a - 1);
        }
        System.out.println(sum);
    }

}