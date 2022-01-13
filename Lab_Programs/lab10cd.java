import java.util.Scanner;

public class lab10cd {
    public static void main(String args[]) {
        String s;
        char ch;
        int count = 0;
        int count1 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;

        }
        System.out.println("No. of Vowels = " + count);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ')
                count1++;

        }
        System.out.println("No. of Alphanumeric Characters = " + count1);
    }
}