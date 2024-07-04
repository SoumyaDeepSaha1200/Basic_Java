//Q9-> WAP to accept the temperature in Fahrenheit degree and find the temperature in Centigrade degree. [Centigrade = ((Fahrenheit-32)*5)/9 ]
import java.util.Scanner;
public class b9_Fahren_to_centi
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int faren,centi;
        System.out.println("Enter the temperature in Faren:- ");
        faren=Sc.nextInt();
        centi=((faren-32)*5)/9;

        System.out.println("Temperature in centigrade is:- "+centi);
    }
}