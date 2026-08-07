package DesignPatterns.Creational.Singleton;

public class Runner {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
        
    }
    protected static class Thread1 implements Runnable {

        @Override
        public void run() {
            Singleton thread1Singleton = Singleton.getInstance("Thread 1");
            System.out.println(thread1Singleton.value);
        }
    }
    protected static class Thread2 implements Runnable {

        @Override
        public void run() {
            Singleton thread2Singleton = Singleton.getInstance("Thread 2");
            System.out.println(thread2Singleton.value);
        }
    }
}
