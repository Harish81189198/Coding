import java.io.*;
import java.util.*;
class dateofbirth
{
    public static void main(String args[])
{
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    System.out.println("Date:"+a);
    System.out.println("Month:"+b);
    System.out.println("year:"+c);
    System.out.println("Date of Birth:"+a+"/"+b+"/"+c);
    scan.close();
}
}