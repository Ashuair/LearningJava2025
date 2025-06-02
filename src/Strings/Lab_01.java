package Strings;

import java.util.Locale;

public class Lab_01 {
    public static void main(String[] args) {
        String name = "Prateek";// Stored in SCP(String Constant Pool)
        name.toUpperCase(Locale.ROOT);
        System.out.println(name);//PRATEEK   X because String is unmutable in SCP


    }
}
