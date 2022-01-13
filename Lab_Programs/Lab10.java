import java.util.Scanner;

public class Lab10 {
    public static void main(String args[])

    {
        String s;
        int len, mid;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        s = scanner.nextLine();
        len = s.length();
        mid = len / 2;
        if (len % 2 != 0) {
            System.out.println("Middle Characters must be" + s.charAt(mid));

        } else {
            System.out.println("Middle Characters must be" + s.charAt(mid - 1) + " & " + s.charAt(mid + 1));
        }
    }
}
