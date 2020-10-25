import java.util.*;
import java.io.*;
class time
{
    public static void main(String args[])
{
    System.out.println("Hour:");
    Scanner object=new Scanner(System.in);
    int a=object.nextInt();
    int b,c;
    b=a*60;
    c=a*60*60;
    System.out.println("Minutes:"+b);
    System.out.println("Seconds:"+c);
}
}