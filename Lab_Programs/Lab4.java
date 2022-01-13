public class Lab4 {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber();
        ComplexNumber c2 = new ComplexNumber(10);
        ComplexNumber c3 = new ComplexNumber(20, 30);
        ComplexNumber c4 = new ComplexNumber(c1);
        c1.add(c1, c2);
        c2.sub(c3, c4);
    }
}
