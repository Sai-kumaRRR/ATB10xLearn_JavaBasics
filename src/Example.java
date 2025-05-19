public class Example {
    public static void main(String[] args) {
        System.out.println(" Using equals():");

        System.out.println(" str1 equals str2:" + "str1.equals(str2)"); // false



        String str11 = new String("Hello");
        String str21 = new String("hello");

        System.out.println("Using equalsIgnoreCase():");
        System.out.println("Using equals str2:" + str11.equalsIgnoreCase(str21));
    }
}
