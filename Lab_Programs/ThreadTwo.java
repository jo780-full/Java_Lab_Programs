
public class ThreadTwo extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("World");
                Thread.sleep(2000);
            }
        } catch (Exception e) {

            System.out.println("thread interrupted");
        }
    }

}