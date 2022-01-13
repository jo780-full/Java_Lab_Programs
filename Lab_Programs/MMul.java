import java.util.Scanner;

public class MMul {
    int m, n, j, i, p, q, k = 0;
    int a[][] = new int[10][10];
    int b[][] = new int[10][10];
    int c[][] = new int[10][10];
    Scanner s = new Scanner(System.in);

    void input() {
        System.out.println("Enter the number of Rows and Columns");
        m = s.nextInt();
        n = s.nextInt();
        System.out.println("Enter the number of Rows and Columns of matrix two");
        p = s.nextInt();
        q = s.nextInt();
        if (n != p) {
            System.out.println("Matric=x Multiplication aint possible");
            System.exit(0);
        } else {
            System.out.println("Matrix elements 1");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = s.nextInt();
                }
            }
            System.out.println("Matrix two elements");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    b[i][j] = s.nextInt();
                }
            }

        }
    }

    void Calculates() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                c[i][j] = 0;

                for (int j2 = 0; j2 < n; j2++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
    }

    void Results() {
        System.out.println("PRoduct is ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.println(c[i][j] + "\t");

            }
            System.out.println("\n");
        }
    }
}
