package ex03_Operators;

public class Lab13_operators07 {
    public static void main(String[] args) {
        String first_name = "Sai";
        String last_name = "kumar";
        int a = 10;
        int b = 80;

        System.out.println(first_name + last_name + a +b);
        // Saikumar1080 - first operator + performed as concatenation

        System.out.println(a + b + first_name + last_name);
        // first + math -> 90Saikumar

        System.out.println(first_name + last_name + (a+b));
        // BODMAS - bracket of DIV , mul , add , sub
    }
}
