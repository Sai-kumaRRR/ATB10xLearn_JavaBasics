package ex15_Thread_Deadlock;

public class Lab58_Deadlock {
    public static void main(String[] args) {
        final String resource1 = "ATB";
        final String resource2 = "MTB";

        // t1 tries to lock resource1 them resource2

        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {


                    }
                    synchronized (resource2) {
                        System.out.println("Thread:1 locked resource");
                    }
                }
            }

        }


    

    }    }