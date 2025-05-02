package ex07_Interview_q_Hackerrank;

import java.util.Scanner;

public class Lab25_interview01 {
    public static void main(String[] args) {

        // Grade calculator:
        // write a program that calculates and displays the letters grade
        // for a given numerical score (e.g A , B , C  ,D)
        // based on the following grading scale:
        // 90 - 100
        //80 - 90
        // 70 - 79
        // 60 - 69
        // 0 - 59
        // logic building - java
        // step -1
        // find the inputs / outputs
        // input | score -> ( 0 -100) -> data type -> int
        // output | grade -> data type -> char
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score = sc.nextInt();
        char grade = 'F';

        if (score >= 90 && score <= 100) {
            grade = 'A';
        }else if (score >= 80 && score <= 89){
            grade = 'B';

        }else if(score >= 70 && score <= 79) {
            grade = 'C';
        }else if(score >= 60 && score <= 69) {
            grade = 'D';
        }   else if(score >=50 && score <= 59) {
            grade = 'G';
        }else if (score <= 0 || score > 100){

        }else {
            grade = 'o';
        }
        System.out.println("Your grade is ->" + grade);







    }
}
