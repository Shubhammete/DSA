package Class.Concepts.BitManipulation;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {
                {1,1,0,0},
                {1,0,0,1},
                {1,0,1,0},
                {0,1,1,1}
        };

//        for(int[] row: image){
//            int start = 0;
//            int end = image.length-1;
//            while(start<end){
//                swap(row,start,end);
//                start++;
//                end--;
//            }
//
//        }

        for(int[] row : image){
            for(int i = 0;i<(image[0].length+1)/2;i++){
                int temp = row[i]^1;
                row[i] = row[image[0].length-i-1]^1;
                row[image[0].length-i-1] = temp;
            }
        }

        for(int k = 0;k<image.length;k++) {
            System.out.println(Arrays.toString(image[k]));
        }
    }

    static void swap(int[] arr,int first, int second){
        int temp = arr[first]^1;
        arr[first] = arr[second]^1;
        arr[second] = temp;
    }

}
