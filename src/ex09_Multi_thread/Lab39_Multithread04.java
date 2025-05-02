package ex09_Multi_thread;

public class Lab39_Multithread04 {
    public static void main(String[] args) {

        Runnable w1 = new WorkerTh04();
        Thread t1 = new Thread(w1);
        t1.start();



        Runnable w2 = new WorkerTh04();
        Thread t2 = new Thread(w2);
        t1.start();

        for(int i = 0; i< 10; i++){
            System.out.println(i + " --- "+ Thread.currentThread().getName());
        }

    }
}

class WorkerTh04 implements Runnable {
    @Override
    public void run() {
        for (int i =0; i < 5; i++) {
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);

            } catch (Exception e) {
                e .printStackTrace();
            }
        }
    }
}
