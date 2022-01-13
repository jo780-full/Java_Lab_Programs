public class BRun {
    public static void main(String[] args) {

        Bank b;
        SBI sb = new SBI();
        CanaraBank cb = new CanaraBank();
        b = sb;
        b.getDetails();
        b.calculateInterest();
        b.getMAmount();
        b = cb;
        b.getDetails();
        b.calculateInterest();
        b.getMAmount();
    }
}
