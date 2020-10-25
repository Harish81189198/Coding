import java.io.*;
import java.util.*;
class date
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("current year:"+a);
        System.out.println("year of birth:"+b);
        System.out.println("Age:"+(b-a));
        scan.close();
    }
}