package Switch_Statement;

import java.util.Scanner;

public class Lab02_Case_Automation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Browser");
        String Browser= sc.next();
        Browser=Browser.toLowerCase();

        switch (Browser){

            case "chrome":
                System.out.println("Starting Chrome");
                System.out.println("TC 1");
                System.out.println("TC 2");
                break;

            case"firefox":
                System.out.println("Starting Firefox");
                System.out.println("TC 1");
                System.out.println("TC 2");
                break;

            case"Safari":
                System.out.println("Starting Safari");
                System.out.println("TC 1");
                System.out.println("TC 2");
                break;

            default:
                System.out.println("I don't know this browser");

        }
    }
}
