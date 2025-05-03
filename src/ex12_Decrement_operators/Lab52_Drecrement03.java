package ex12_Decrement_operators;

public class Lab52_Drecrement03 {
    public static void main(String[] args) {
        // finding the largest numbers a , b , c using the ternary operators
        // condition ? value_if_true : value_of_false;

        int a = 56;
        int b = 58;
        int c = 52;


      // In future we will ask the user for these values
      // we will take a user input.

      // Rough logic
      // a>= b , && a>= c  , : a >= c -> b > c
      int result = (a >= c && a >=b)? a : (b >= c ? b : c);
        System.out.println("max number is ->" + result);


















    }
}
