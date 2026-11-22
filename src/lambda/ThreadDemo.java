package lambda;

public class ThreadDemo {

    public static void main(String[] args) {
        // First thread
        Runnable thread1 = () -> {
            //body of the thread
            for (int i = 0; i < 10; i++) {
                System.out.println("Value of i is "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t = new Thread(thread1);
        t.setName("First Thread");
        t.start();

        Runnable thread2 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Value of table of two is "+2*i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t2 = new Thread(thread2);
        t2.setName("Second Thread");
        t2.start();

    }
}
