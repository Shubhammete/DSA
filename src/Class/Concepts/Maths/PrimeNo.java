package Class.Concepts.Maths;

public class PrimeNo {
    public static void main(String[] args) {
        int no = 23;
        int c = 2;
        boolean flag = true;
//        for(int i = 2;i*i<no;i++){
//            if(no%i==0){
//                flag = false;
//            }
//        }


        while(c*c<=no){
            if(no%c==0){
                flag = false;
                break;
            }
            c++;
        }
        if(flag){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }


    }
}
