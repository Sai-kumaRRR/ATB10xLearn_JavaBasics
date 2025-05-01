package ex04_If_conditions;

import java.util.Scanner;

public class Lab23_Even_Odd_program {
    public static void main(String[] args) {

        // Check weather the input is even or odd number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, I will tell you odd or even!!!");

        int num= sc.nextInt();

        // Modulus -> %
        // 10%2 -> == even -> 0
        // 10%2 == odd -> 1

        if(num%2 == 0){
            System.out.println("num is-> even");
        }
        else{
            System.out.println("num is odd!!");
        }

        sc.close();


    }
}
