import java.io.*;
import java.util.*;

class table {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Multliplication table of" + a + " is:");
        scan.close();
        for (int i = 1; i <= 15; i++) {
            System.out.println(a + "*" + i + "=" + (a * i));
        }
    }
}