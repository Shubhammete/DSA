package Class.Concepts.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // arraylist initialization and declaration
        ArrayList<Integer> name = new ArrayList<>();
        // adds element to list
        name.add(23);
        name.add(24);
        name.add(25);
        System.out.println(name);
        System.out.println(name.contains(23));
        // updates element set(index,value)
        name.set(1,29);
        System.out.println(name);
        // removes element remove(index)
        name.remove(2);
        System.out.println(name);

        //input and output
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<5;i++){
            list.add(in.nextInt());
        }
        for(int i = 0;i<5;i++){
            System.out.print(list.get(i));  // list[index] not works here
        }

        // 2D array with ArrayList
        ArrayList<ArrayList<Integer>> multidimarr = new ArrayList<>();

        // initialization of 2D arraylist as we have to add empty arraylists
        for(int i = 0;i<3;i++){
            multidimarr.add(new ArrayList<>());
        }
        //input
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                multidimarr.get(i).add(in.nextInt());
            }
        }
        System.out.print(multidimarr);
    }
}
