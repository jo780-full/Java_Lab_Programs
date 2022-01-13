public class ThreadOne extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("Hello");
                Thread.sleep(1000);
            }
        } catch (Exception e) {

            System.out.println("thread interrupted");
        }
    }

}
