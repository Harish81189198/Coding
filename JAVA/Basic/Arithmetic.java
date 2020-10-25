
import java.io.*;
import java.util.*;
class number
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        float a=obj.nextFloat();
        float b=obj.nextFloat();
        System.out.println("Enter the number:"+a+"\n"+b);
        obj.close();
        System.out.println("division:"+(a/b));
        System.out.println("Quotient:"+(a%b));
    }
}        
class numbers
{
    public static void main(String args[])
    {
        Scanner object=new Scanner (System.in);
        float b=object.nextFloat();
        float c=object.nextFloat();
        object.close();
        System.out.println("Addition:"+(b+c));
        System.out.println("Subraction:"+(b-c));
        System.out.println("Multliplication:"+(b*c));
    }
}