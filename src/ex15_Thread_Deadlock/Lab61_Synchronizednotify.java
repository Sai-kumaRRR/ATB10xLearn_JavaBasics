package ex15_Thread_Deadlock;

import static javax.print.attribute.standard.MediaSizeName.A;
import static javax.print.attribute.standard.MediaSizeName.B;

public class Lab61_Synchronizednotify{
    public static <B, A, A, B> void main(String[] args) {
        B obj2;
        obj2 = new B( "B");
        Object st;
        new A("A");


    }
}
class Stack{
    int x;
    boolean flag = false;

    synchronized  void push(int x){
        if (flag){
            try{
                wait();

            }catch(Exception e){
                System.out.println(e);

            }
        }
        this.x = x;
        System.out.println(x + " is pushed....");
        flag = true;
        notify();

    }
    synchronized public int pop(){
        if(flag){
            try{
                wait();

            }catch(Exception e){
                System.out.println(e);

            }
        }
        System.out.println(x + " is poped!");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            System.out.println(e);

        }
        flag = false;
        notify();
        return x;
    }
}
