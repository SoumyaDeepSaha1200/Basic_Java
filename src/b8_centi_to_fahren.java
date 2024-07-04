//Q-> WAP to accept the temperature in centigrade degree and find the temperature in Fahrenheit degree. [Fahrenheit = (centigrade * 9 / 5) + 32]5
import java.util.Scanner;
public class b8_centi_to_fahren
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int fahren,centi;
        System.out.println("Enter the Centigrade of the temperature :- ");
        centi=Sc.nextInt();
        fahren=(centi * 9/5)+32;
        System.out.println("The temperature is fahrenheit is:- "+fahren);
    }
}