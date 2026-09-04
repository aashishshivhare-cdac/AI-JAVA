package thread;

public class CustomeThread extends Thread{
    @Override
    public void run() {
        for (int i=0; i< 500; i++)
            System.out.println(Thread.currentThread().getName() + " " + i);
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        Thread t1 = new CustomeThread();
        t1.setName("MyThread");
        t1.start();
        Thread.sleep(1);
        System.out.println(Thread.currentThread().getName());
    }
}
