import java.util.*;
import java.io.*;
import java.lang.*;
class details
{
    public static void main(String args[])
    {
        Scanner object=new Scanner(System.in);
        String a=object.nextLine();
        String b=object.nextLine();
        String c=object.nextLine();
        String d=object.nextLine();
        System.out.println("Name:"+a);
        System.out.println("Register number:"+b);
        System.out.println("Department:"+c);
        System.out.println("College:"+d);
        object.close();
    }
}