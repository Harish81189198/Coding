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
        if(a%2==0)
        {
            System.out.println("The number is Even");
        }
        else
            System.out.println("The number is odd");
    }
}