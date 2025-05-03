package ex13_Ternary_operators;

public class Lab56_ternary02 {
    public static void main(String[] args) {
        // Create a program to check whether Sai will go to Vskp
        // take a input age = Sai -> Vskp
        // Age > 26 -> Drinking - vskp
        // ternary operator

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[3]);
        System.out.println("%s. %s, %s, args[0], args[1],args[2], args[3]");
        int age = Integer.parseInt(args[3]);
        int age2 = Integer.parseInt(args[1]);
        System.out.println();
        System.out.println(age >26 ? "Allowed to vskp" : "Not Allowed to go");
    }
}
