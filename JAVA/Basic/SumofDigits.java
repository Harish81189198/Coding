import java.io.*;
import java.util.*;
class number{
    public static void main(String args[])
    {
        int a,b,c,d;
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println("Input Number:"+num);
        scan.close();
        a=num%10;
        int n=num/10;
        b=n%10;
        n=n/10;
        c=n%10;
        n=n/10;
        d=n%10;
        n=n/10;
        System.out.println("The sum of the digits:"+(a+b+c+d));
    }
}