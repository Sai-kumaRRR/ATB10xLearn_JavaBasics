package ex15_Thread_Deadlock;

import java.util.ArrayList;

public class Lab60_Synchronized {

    public static void main(String[] args) {

    }
}
class Sync{
    void m1(){
        synchronized (this.getClass()){
            System.out.println("default object of class will be locked!");

        }
    }
    static void m2(){
        synchronized (Sync.class){
            System.out.println("Default object of class will be locked!");

        }
    }
    void m3(){
        synchronized (this){
            System.out.println("Current object of class will be locked!");

        }
    }

    void ma4(){

    }{
        ArrayList a = new ArrayList();
        synchronized (a){
            System.out.println("Third party object of class will be locked!");
        }
    }
}
