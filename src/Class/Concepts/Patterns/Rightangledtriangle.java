package Class.Concepts.Patterns;

public class Rightangledtriangle {
    public static void main(String[] args) {
        pattern1(4);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern3(4);
        System.out.println();
        pattern4(4);
        System.out.println();
        pattern5(4);
        System.out.println();
        pattern6(4);
        System.out.println();
        pattern7(4);
        System.out.println();
        pattern8(4);
        System.out.println();
        pattern9(4);
    }
    static void pattern1(int n) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
        static void pattern2(int n){
            for(int i = 1; i<=4;i++) {
                for (int j = 4; j >= i; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            }

    static void pattern3(int n){
        for(int i = 1; i<=4;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        int totalrows = 2*n;
        for (int row = 1; row <= totalrows ; row++) {
            int cols = row>n ? totalrows-row:row;
                for (int col = 1; col <= cols; col++) {
                    System.out.print("* ");
                }
                System.out.println();
        }
    }
    static void pattern5(int n) {
        int totalrows = 2*n;
        for(int row = 1;row<=totalrows;row++){
            int totalcols = row>n ? totalrows-row:row;
            int totalspaces = n - totalcols;
            for(int space = 0; space<totalspaces;space++){
                System.out.print(" ");
            }
            for(int cols = 1; cols<=totalcols;cols++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int rows = 1; rows<=n;rows++){
            int totalspaces = n - rows;
            for(int space = 1; space<=totalspaces;space++){
                System.out.print("  ");
            }
            for(int cols = rows;cols>=1;cols--){
                System.out.print(cols+" ");
            }
            for(int cols = 2;cols<=rows;cols++){
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        int totalrows = 2*n;
        for(int rows = 1; rows<=totalrows;rows++){
            int totalcols = rows > n ? totalrows - rows:rows;
            int totalspaces = n - totalcols;
            for(int space = 1; space<=totalspaces;space++){
                System.out.print("  ");
            }

            for(int cols = totalcols;cols>=1;cols--){
                System.out.print(cols+" ");
            }
            for(int cols = 2;cols<=totalcols;cols++){
                System.out.print(cols+" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        int totalrows = 2*n;
        for(int rows = 1;rows<totalrows;rows++){
            for(int cols = 1; cols<totalrows;cols++){
                int index = Math.min(Math.min(rows,cols),Math.min(totalrows-rows,totalrows-cols));
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        int totalrows = 2*n;
        for(int rows = 1;rows<totalrows;rows++){
            for(int cols = 1; cols<totalrows;cols++){
                int index = n - Math.min(Math.min(rows,cols),Math.min(totalrows-rows,totalrows-cols))+1;
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}
