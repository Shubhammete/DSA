public class Demo {
    public static void main(String[] args) {
        System.out.println(minimizeSet(12,3,2,10));
        // expected 14
    }
    public static int minimizeSet(int divisor1, int divisor2, int uniqueCnt1, int uniqueCnt2) {
        int[] arr1 = new int[uniqueCnt1];
        int[] arr2 = new int[uniqueCnt2];
        int no = 1;
        int i = 0;
        int j = 0;
        while(uniqueCnt1 > i || uniqueCnt2 >j){

            if(no%divisor1!=0 && uniqueCnt1 > i){
                arr1[i] = no;
                i++;
            }else if(no%divisor2!=0 && uniqueCnt2 > j){
                arr2[j] = no;
                j++;
            }
            no++;
        }
        if(arr1[uniqueCnt1-1]<=arr2[uniqueCnt2-1]){
            return arr2[uniqueCnt2-1];
        }else{
            return arr1[uniqueCnt1-1];
        }
    }
    }

