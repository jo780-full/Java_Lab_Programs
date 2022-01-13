import java.util.Scanner;

abstract class Solid {
    double r;
    double h;
    final double PI = 3.14;

    abstract void SArea();

    abstract void Vol();

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radius: ");
        r = sc.nextDouble();
        System.out.println("Enter the height: ");
        h = sc.nextDouble();
        h = sc.nextDouble();
    }
}

class Cylinder extends Solid {
    void SArea() {
        double sarea = (2 * PI * r * h) + (2 * PI * r * r);
        System.out.println("Surface Area of Cylinder= " + sarea);
    }

    void Vol() {
        double vol = PI * r * r * h;
        System.out.println("Volume of Cylinder= " + vol);
    }
}

class Cone extends Solid {
    void SArea() {
        double sarea = PI * r * (r * Math.sqrt(r * r + h * h));
        System.out.println("Surface Area of Cone= " + sarea);
    }

    void Vol() {
        double vol = (PI * r * r * h) / 3;
        System.out.println("Volume of Cone= " + vol);
    }
}

class Sphere extends Solid {
    void SArea() {
        double sarea = 4 * PI * r * r;
        System.out.println("Surface Area of Sphere= " + sarea);
    }

    void Vol() {
        double vol = (4 / 3) * PI * r * r * r;
        System.out.println("Volume of Sphere= " + vol);
    }
}
