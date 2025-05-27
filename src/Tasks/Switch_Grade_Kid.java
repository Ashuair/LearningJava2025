package Tasks;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Switch_Grade_Kid{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter grade");

    String grade = sc.next();
    grade = grade.toUpperCase(Locale.ROOT);

    switch (grade){
        case "A"-> System.out.println("Excellent");

        case"B"-> System.out.println("Very Good");

        case"C"-> System.out.println("Good");

        case"D"-> System.out.println("Need improvement");

        case"E"-> System.out.println("Fail");

        default -> System.out.println("Please enter the valid grade");

    }




}
}
