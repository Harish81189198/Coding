//°C to °F	Divide by 5, then multiply by 9, then add 32
//°F to °C	Deduct 32, then multiply by 5, then divide by 9
import java.io.*;
import java.util.*;
import java.lang.*;
class conversion
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        System.out.println("Celcius:"+a);
        System.out.println("Fahreheit:"+b);
        scan.close();
        System.out.println("Celcius to Fahrenheit:"+(((a/5)*9)+32));
        System.out.println("Fahrenheit to Celcius:"+(((b-32)*5)/9));
    }
}
