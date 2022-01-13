public class ComplexNumber {
    double r;
    double i;

    ComplexNumber() {
        r = 0;
        i = 0;

    }

    ComplexNumber(double var3) {
        r = var3;
        i = 0;
    }

    ComplexNumber(double var1, double var2) {
        r = var2;
        i = var1;
    }

    ComplexNumber(ComplexNumber OBJ) {
        r = OBJ.r;
        i = OBJ.i;
    }

    void add(ComplexNumber ob1, ComplexNumber ob2) {
        r = ob1.r + ob2.r;
        i = ob1.i + ob2.i;
        System.out.println("Sum is " + r + " + " + "i" + i);
    }

    void sub(ComplexNumber ob1, ComplexNumber ob2) {
        r = ob1.r - ob2.r;
        i = ob1.i - ob2.i;
        System.out.println("Differrence is " + r + " - " + "i" + i);
    }
}
