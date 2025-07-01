package String_Tasks;

public class ReverseString_RecursiveFunction {
    public static String reverse(String str){
        if(str.isEmpty()){
            return str;
        }
        return reverse(str.substring(1)+str.charAt(0));

    }

    public static void main(String[] args) {
        String str = "Hello Prateek";
        System.out.println(reverse(str));
}}
