import java.io.*;
import java.util.*;
class number
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int a=obj.nextInt();
        System.out.println("Enter the number:"+a);
        obj.close();
        System.out.println("division:"+(a/3));
        System.out.println("Quotient:"+(a%3));
    }
}        
class numbers
{
    public static void main(String args[])
    {
        Scanner object=new Scanner (System.in);
        int b=object.nextInt();
        int c=object.nextInt();
        object.close();
        System.out.println("Multliplication:"+(b*c));
    }
}