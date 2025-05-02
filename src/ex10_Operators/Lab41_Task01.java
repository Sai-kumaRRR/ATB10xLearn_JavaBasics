package ex10_Operators;

public class Lab41_Task01 {
    public static void main(String[] args) {

        // finds the maximum of two numbers
        //
        int x = 56;
        int y = 98;
        // Rough logic x > y -> x : y
        int max = x < y ? x : y;
        System.out.println(max);
        System.out.println(x);
        System.out.println(y);
    }
}
