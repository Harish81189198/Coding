import java.util.*;
import java.io.*;
class Dis
{
    public static void main(String args[])
{
    System.out.println("Amount:");
    Scanner object=new Scanner(System.in);
    int a=object.nextInt();
    int b;
    b=(a/25)*100;
    System.out.println("Discount:"+b);
}
}