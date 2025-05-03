package ex12_Decrement_operators;

public class Lab54_example02 {
    public static void main(String[] args) {

        int a  = 20;
        System.out.println(--a + a++ + --a);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(++a);

        // Exp1 -> --a -> 19 , a =19
        // Exp2 -> a++ -> 19 , a = 20
        // Exp3 -> a-- -> 20 . a = 19


    }
}
