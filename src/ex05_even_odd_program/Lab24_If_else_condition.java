package ex05_even_odd_program;

import java.util.Scanner;

public class Lab24_If_else_condition {
    public static void main(String[] args) {
        // Condition - 2 outputs
        // can we have two or more outputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1");
        int num1 = sc.nextInt();
        System.out.println("Enter the num2");

        int num2 = sc.nextInt();
        // 1 -> num1 > num2
        // 2 -> num2 > num1
        // 3 -> num1 == num2
        if (num1 > num2) {
            System.out.println("num1 > num2");


        } else if (num2 > num1) {

            System.out.println("num2 > num1");
        } else {
            System.out.println("Equal");
        }
    }


}