package main.com.JavaProgrammingMasterclassUpdatedToJava17.Multithreading.CounterThreadsPractice;

public class Main {
    public static void main(String[] args) {
        Countdown countdown=new Countdown();
        CountDownThread t1=new CountDownThread(countdown);
        t1.setName("Thread 1");
        CountDownThread t2 = new CountDownThread(countdown);
        t2.setName("Thread 2");

        t1.start();
        t2.start();
    }
}

class Countdown{
    private int i;
    public void doCountDown(){
        String color;

        switch (Thread.currentThread().getName()){
            case "Thread 1":
                color=ThreadColor.ANSI_BLUE;
                break;
            case "Thread 2":
                color=ThreadColor.ANSI_PURPLE;
                break;
            default:
                color=ThreadColor.ANSI_GREEN;
        }

        synchronized (this) {
            for (i = 10; i > 0; i--) {
                System.out.println(color + Thread.currentThread().getName() + ": i = " + i);
            }
        }
    }
}

class CountDownThread extends Thread{
    private Countdown threadCountDown;
    public CountDownThread(Countdown countdown){
        threadCountDown=countdown;
    }

    public void run(){
        threadCountDown.doCountDown();
    }
}