public class Sort {
    void sortAscending(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    void sortDescending(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    void print(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.println("array " + a[i] + " ");
        }
    }
}
