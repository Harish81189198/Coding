import java.io.*;
import java.util.*;
class squareofarea
{
   public static void main(String args[])
   {
     System.out.println("Enter the number: ");
     Scanner scan= new Scanner(System.in);
     int a=scan.nextInt();
     int squarednumber;
     squarednumber=a*a;
     System.out.println("Area of square: "+squarednumber);
     scan.close();
   } 
}