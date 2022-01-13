import java.util.*;
import java.io.*;

public class Lab8b {
    public static void main(String args[]) {
        try {
            char c;
            int i;
            FileInputStream fin = new FileInputStream(
                    "C:/Users/josep/Desktop/Java_Lab_Programs/Lab_Programs/src/LAB8.txt");
            FileOutputStream fout = new FileOutputStream(
                    "C:/Users/josep/Desktop/Java_Lab_Programs/Lab_Programs/src/LAB8.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the characters: q to quit");
            do {
                c = (char) br.read();
                if (c != 'q')
                    fout.write(c);

            } while (c != 'q');
            do {
                i = fin.read();
                if (i != -1)
                    System.out.print((char) i);

            } while (i != -1);
            fin.close();

            fout.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
