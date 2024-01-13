package Class.Concepts.Recursion.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{2,5,8,5,3,5,33,4,5,75,5,56},5,0));
        int[] arr =  new int[]{2,5,8,5,3,5,33,4,5,75,5,56};
        System.out.println(revsearch(arr,5,arr.length-1));
        searchAllIndex(arr,5,0);
        System.out.println(list);
        ArrayList<Integer> set = new ArrayList<>();
        System.out.println(searchlist(arr,5,0,set));
        System.out.println(listinbody(arr,5,0));
    }

    private static int search(int[] arr, int target,int index) {
        if(arr.length == index){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
            return search(arr, target, ++index);
    }

    private static ArrayList<Integer> listinbody(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length == index){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> answers = listinbody(arr,target,++index);
        list.addAll(answers);
        return list;
    }

    private static int revsearch(int[] arr, int target,int index) {
        if(0 == index){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return search(arr, target, --index);
    }

    static ArrayList list = new ArrayList<>();
    static void searchAllIndex(int[] arr, int target, int index){
        if(index == arr.length-1){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
        searchAllIndex(arr,target,index+1);
    }

    static ArrayList<Integer> searchlist(int[] arr,int target, int index, ArrayList<Integer> list){
        if(index == arr.length-1){
            return list;
        }
        if(arr[index]== target){
            list.add(index);
        }
        return searchlist(arr,target,++index,list);
    }

}
