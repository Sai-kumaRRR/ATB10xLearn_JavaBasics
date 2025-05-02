package ex09_Multi_thread;

public class Lab36_thread01 {
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println(t);

        for (int i = 0; i < 10; i++)
            for (int a = 0; a < 10; a++) {
                System.out.println(i + "-" + t.getName());
                System.out.println(i + "-" + t.getPriority());
                System.out.println(a + "-" + t.getName());
                System.out.println(a + "-" + t.getPriority());
                Thread.sleep(5000);
            }
    }
}
