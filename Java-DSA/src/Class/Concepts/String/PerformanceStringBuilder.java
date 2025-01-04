package Class.Concepts.String;

public class PerformanceStringBuilder {
    public static void main(String[] args) {
        String series = "";
        for(int i = 0; i< 26;i++){
            char c = (char)('a'+i);
            series += c;
        }
        System.out.println(series);  // will print a-z
        // problem here is it creates object at each addition like a+0, a+1, a+2.....
        // so we use StringBuilder

        StringBuilder string = new StringBuilder();
        for(int i = 0; i< 26; i++){
            char ch = (char)('a'+i);
            string.append(ch);
        }
        System.out.println(string);
        // convert StringBuilder to string
        System.out.println(string.toString());
    }
}
