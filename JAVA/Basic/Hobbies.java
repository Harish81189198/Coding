import java.io.*;
import java.util.*;
class hobb
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        String a=scan.nextLine();
        String b=scan.nextLine();
        String c=scan.nextLine();
        System.out.println("Enter your Hobbies:"+a+"\n"+b+"\n"+c);
        System.out.println("My Hobbies are:"+a+"\n"+b+"\n"+c);
        scan.close();
    }
}