package ex04_If_conditions;

import java.util.Scanner;

public class Lab19_if_else02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // Allowed to vote or not
        // if age > 18 -> allowed to vote.
        // else age < > 18 -> not allowed to vote.
        if(age > 18){
            System.out.println("Allowed to vote !!!");
        }
        else{
            System.out.println("not allowed ?");
        }
    }
}
