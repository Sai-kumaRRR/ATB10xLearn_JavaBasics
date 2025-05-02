package ex06_Switch_statement;

public class Lab33_if_condition_switch04 {
    public static void main(String[] args) {
        // JDK  -> 23
        int itemCode = 002; // JDK > 23

        switch (itemCode){
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            case 004 -> System.out.println("004");
            case 005 -> System.out.println("005");
            default -> System.out.println("Default");
        }
    }
}
