import java.util.*;
import java.io.*;
class Dis
{
    public static void main(String args[])
{
    System.out.println("Amount:");
    Scanner object=new Scanner(System.in);
    double a=object.nextDouble();
    System.out.println("Discount:"+(a*25/100));
}
}