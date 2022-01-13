
public class ThreadThree extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println("WOken");
                Thread.sleep(3000);
            }
        } catch (Exception e) {

            System.out.println("thread interrupted");
        }
    }

}