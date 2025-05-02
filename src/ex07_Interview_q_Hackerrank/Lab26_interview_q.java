package ex07_Interview_q_Hackerrank;

import java.util.Scanner;

public class Lab26_interview_q {
    public static void main(String[] args) {
        //switch condition
        // user - enter int number from 1 to 7
        // which day it is it
        // 1 -> mon , 4 -> thur , 7 -> sun , 8 , 9, 10...


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from(1-7)");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;

            case 7:
             System.out.println("Sun");
             break;
            default:
                System.out.println("No idea, what day it is");
                break;
        }
        System.out.println("End of the Loop");



    }


}