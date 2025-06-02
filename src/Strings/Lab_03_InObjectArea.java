package Strings;

public class Lab_03_InObjectArea {
    public static void main(String[] args) {
        String s1 = "Hello"; //SCP mai 1 hello
        String s2 = "Hello"; // avi bhi SCP mai 1 hello


        String s3 = new String("Hello"); //Object Area mai 1 hello hai
            String s4 = new String("Hello");//Ab object area mai 2 hello hai

        System.out.println(s3);
        System.out.println(s4);
    }
}
