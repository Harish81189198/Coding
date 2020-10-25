import java.io.*;
import java.util.*;
class details
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        long b=scan.nextLong();
        long c=scan.nextLong();
        System.out.println("Permanent Address:"+a);
        System.out.println("Aadhaar Number:"+b);
        System.out.println("Phone number:"+c);
        scan.close();
    }
}