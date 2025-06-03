package Strings;

public class String_Buffer_vs_String_Builder {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("Hello");
        StringBuilder b1 = new StringBuilder("World");
        System.out.println(s1.reverse());
        System.out.println(b1.reverse());
    }
}
