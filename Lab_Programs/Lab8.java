public class Lab8 {
    public static void main(String args[]) {
        ThreadOne t1 = new ThreadOne();
        ThreadTwo t2 = new ThreadTwo();
        ThreadThree t3 = new ThreadThree();
        t1.start();
        t2.start();
        t3.start();
        try {
            // Thread.sleep (15000);
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
        System.out.println("Main Thread Exits");
    }
}
