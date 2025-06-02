package Strings;

public class Lab_04_Interview {
    public static void main(String[] args) {
        String s1="Prateek";
        String s2="Prateek";
        String s3="Prateek";

        String s5= new String("Prateek");
        String s6=new String("Prateek");
        String s7=new String("Prateek");

        // ( == Operator compare Strings with their reference Locations)

        System.out.println(s1 == s5);//false because both have different index value and also in different locations.
        System.out.println(s5==s6);//false
        System.out.println(s1==s2);//true because in String constant pool only one address is formed for same value string

        // ( = Operators compare the content of strings )

        System.out.println(s1.equals(s7));
        System.out.println(s5.equals(s2));








    }
}
