import java.util.Scanner;

class TestStack {
    public static void main(String args[]) {
        Stack<Integer> si = new Stack<Integer>();
        Stack<Double> sd = new Stack<Double>();
        Stack<String> s = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of Integer Stack");
        for (int i = 0; i < 10; i++)

        {
            int n = sc.nextInt();
            si.push(n);
        }
        System.out.println("Enter the elements of Double Stack");
        for (int i = 0; i < 10; i++) {
            Double n = sc.nextDouble();
            sd.push(n);
        }
        System.out.println("Elements of Integer Stack are:");
        for (int i = 0; i < 10; i++)
            System.out.println(si.pop());
        System.out.println("Elements of Double Stack are:");
        for (int i = 0; i < 10; i++)
            System.out.println(sd.pop());
    }
}