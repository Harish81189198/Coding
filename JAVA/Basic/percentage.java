import java.io.*;
import java.util.*;
class calculation
{
    public static void main(String args[])
{
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    int c=scan.nextInt();
    System.out.println("Enter the marks:"+a+"\n"+b+"\n"+c);
    int percentage;
    percentage=(a+b+c)/3;
    System.out.println("Total marks:"+(a+b+c));
    System.out.println("Percentage:"+percentage);
    scan.close();
}
}