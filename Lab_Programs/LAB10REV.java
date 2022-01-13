import java.util.Scanner;

public class LAB10REV {
    public static void main(String args[]) {
        String original, rev = "";
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        original = sc.nextLine();

        for (i = original.length() - 1; i >= 0; i--) {
            rev = rev + original.charAt(i);
        }
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + rev);
        if (original.equals(rev))
            System.out.println("String is a Palindrome");
        else
            System.out.println("String is not a Palindrome");

    }
}
