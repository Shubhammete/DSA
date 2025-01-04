package Class.Concepts.Maths;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int no = 40;
        // O(N)
        for(int i = 1;i<=no;i++){
            if(no%i==0){
                System.out.println(i);
            }
        }

        //sqrt(N)
         for(int i = 1;i<=Math.sqrt(no);i++){
             if(no%i==0){
                 if(no/i==i){
                     System.out.println(i);
                 }else{
                     System.out.println(i+" "+no/i);
                 }
             }
         }
         // dispaly in ascending order
         //  time and space complexity will be O(sqrt(N))
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1;i<=Math.sqrt(no);i++){

            if(no%i==0){
                if(no/i==i){
                    System.out.println(i);
                }else{
                    System.out.println(i+" ");
                    // add elements in list
                    list.add(no/i);
                }
            }
        }
        for(int i = list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }

    }
}
