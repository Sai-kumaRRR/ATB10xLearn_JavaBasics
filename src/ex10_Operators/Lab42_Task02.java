package ex10_Operators;

public class Lab42_Task02 {
    public static void main(String[] args) {
        
        // If the score is 90 or above , the grade will be 'A'.
        // If the score is between 80 and 89 the grade will be 'B'.
        // If the score is between 70 and 79 the grade will be 'C'.
        // If the score is below 60 , the grade will be 'F'.
        
        
        int score = 90;

        String grade;
        grade = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "F":
        System.out.println("Your Grade is -> "+ grade);
        System.out.printf("Your Grade is %s" , grade);
    }
}
