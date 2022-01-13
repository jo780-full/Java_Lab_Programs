import java.util.Scanner;

public class Lab5 {
    public static void main(String args[]) {
        int n;
        Scanner s = new Scanner(System.in);

        Sort sc = new Sort();
        System.out.println("Enter the no. of Elements");
        n = s.nextInt();
        int array[] = new int[5];
        System.out.println("Enter " + n + " Integers");
        for (int i = 0; i < n; i++) {
            try {
                array[i] = s.nextInt();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index out of Bounds " + e);
                System.exit(0);
            }
        }
        System.out.println("Entered Elements are");
        sc.print(array, n);
        System.out.println("Ascending Order:");
        sc.sortAscending(array, n);
        sc.print(array, n);
        System.out.println("Descending Order:");
        sc.sortDescending(array, n);
        sc.print(array, n);
    }
}