package ex04_If_conditions;

public class Lab22_if_breakpoint_test {
    public static void main(String[] args) {
        boolean a = true;
         a = !a;
        if (4 + 6 < 6) {
            System.out.println("Inside the loop!!");
        } else {
            System.out.println("Outside ->" + a);
        }
    }
}
