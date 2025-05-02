package ex09_Multi_thread;

public class Lab38_Thread03 {

    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Workers");

        WorkerTh03 w1 = new WorkerTh03(threadGroup, "W1");
        W1.start();


        WorkerTh03 w2 = new WorkerTh03(threadGroup, "W2");
        W2.start();

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);

            } catch (Exception e) {
                e.printStackTrace();

            }

        }


// Thread by class:

        class WorkerTh03 extends Thread {

            WorkerTh03(ThreadGroup threadGroup, String name) {
                super(threadGroup, name);

            }

            @Override
            public void start() {
                super.start();
            }

            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.println(Thread.currentThread().getName());

                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                }


            }

        }

    }
}