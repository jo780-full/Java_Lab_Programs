import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        String name, eid;
        double bsalary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name and id of employee");
        name = scanner.nextLine();
        eid = scanner.nextLine();
        System.out.println("Enter the basic salary of employee");
        bsalary = scanner.nextDouble();
        double da = (0.4) * bsalary;
        double hra = (0.2) * bsalary;
        double cca = 250;
        double pf = (0.1) * bsalary;
        double pt = 100;
        double gincome = bsalary + da + hra + cca;
        double it = (0.1) * gincome;
        double deduction = pt + it + pf;
        double nincome = gincome - deduction;
        System.out.println("The salry of employee is " + name + " with ID is " + eid + " is RS. " + nincome);

    }
}