package ex11_Increment_operators;

public class Lab48_Increment_example03 {
    public static void main(String[] args) {
        int a = 14;
        System.out.println(a++ + ++a);
        System.out.println(a);

        // A -> a++ -> 10 , a -> 11
        // + ->
        // a -> ++a -> 12 , a -> 12
        // A +  -> 10 + 12
    }
}
