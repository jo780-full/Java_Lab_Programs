import java.util.Scanner;

public class QE {

    int a, b, c;
    double r1, d, r2;
    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter the values of a,b and c");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }

    void discriminative() {
        d = (b * b) - (4 * a * c);
        System.out.println("d= " + d);
        d = Math.abs(d);
    }

    void calculateRoots() {
        if (d > 0) {

            System.out.println("Roots are Distinct");
            r1 = (-b + Math.sqrt(d)) / (2 * a);

            r2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println("Roots are " + r1 + "& " + r2);
        } else if (d == 0) {
            System.out.println("Roots are Equal");
            r1 = (-b + Math.sqrt(d)) / (2 * a);

            r2 = r1;

            System.out.println("Roots are " + r1 + " " + r2);
        } else {
            System.out.println("Roots are imaginary");
        }

    }
}