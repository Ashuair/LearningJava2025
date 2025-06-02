package Strings;

public class Lab_05_Index {
    public static void main(String[] args) {
        String s = "Prateek";
        char c = s.charAt(2); // Index = 2
        System.out.println(c);

        // indexOf
        int idx = "Prateek".indexOf("k");
        System.out.println(idx);

        //isEmpty
        boolean b = "".isEmpty();
        System.out.println(b);

        //join
        String jn = String.join("-","Prateek","Singh");
        System.out.println(jn);





    }
}
