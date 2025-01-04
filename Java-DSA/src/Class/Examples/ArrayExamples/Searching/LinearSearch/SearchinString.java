package Class.Examples.ArrayExamples.Searching.LinearSearch;

public class SearchinString {
    public static void main(String[] args) {
        String name = "Shubham";
        char target = 'h';
        if(name.length() == 0){
            System.out.println("Empty String");
        }
        for(int i = 0; i< name.length();i++){
            if(target == name.charAt(i)){
                System.out.println(target+" is at "+i+"th index of string");
            }
        }

        // for enhanced for loop use .toCharArray() method
        // use this for searching element without index
        for(char a: name.toCharArray()){
            if(target == a){
                System.out.println(a);
            }
        }
    }
}
