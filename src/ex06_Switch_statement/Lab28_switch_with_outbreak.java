package ex06_Switch_statement;

import java.util.Scanner;

public class Lab28_switch_with_outbreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc . nextInt();
        switch (day) {
            case 1 :
                System.out.println("Mon");
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("Sat");
            case 7:
                System.out.println("Sun");
            default :
                System.out.println("No , idea what day it is.");
        }

        System.out.println("End of the loop");
        sc.close();
    }
}
