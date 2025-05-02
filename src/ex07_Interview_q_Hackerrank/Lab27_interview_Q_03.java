package ex07_Interview_q_Hackerrank;

public class Lab27_interview_Q_03 {

    public static void main(String[] args) {
        // step1
        // negative case we need handle

        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            System.out.println("Invalid input: Side length must be positive .");
        }else if (side1 == side2 && side2 == side3 && side1 == side3) {
            System.out.println("The triangle is equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles");

        } else {
            System.out.println("The triangle is scalene");
        }
        scanner.close();
    }
}
