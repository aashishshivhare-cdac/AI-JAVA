package thread;

public class CustomeRunnable implements Runnable{
    @Override
    public void run() {
        synchronized (this){
        for (int i=0; i< 500; i++)
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) {

        Runnable runnable = new CustomeRunnable();
        Thread t1 = new Thread(runnable, "Mythread1");
        Thread t2 = new Thread(runnable, "Mythread2");
        t1.start();
        t2.start();
    }
}
