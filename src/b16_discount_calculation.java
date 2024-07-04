//Q17-> A computer shop announce a special offer to their customers on purchasing laptops and printers accordingly……….
//On laptop discount 15. [Discount Amount = (Discount Percentage x Price)/100]
//On printer discount 10

import java.util.Scanner;
public class b16_discount_calculation
{
    public static void main(String [] args)
    {
        Scanner Sc=new Scanner(System.in);
        int Lamt,Pamt,Ldis,Pdis;
        System.out.println("Enter the amount of the Laptop:- ");
        Lamt=Sc.nextInt();
        System.out.println("Enter the amount of the Printer:- ");
        Pamt=Sc.nextInt();

        Ldis=(15*Lamt)/100;
        Pdis=(10*Pamt)/100;

        System.out.println("Laptop discount amount is:- "+Ldis);
        System.out.println("Printer discount amount is:- "+Pdis);


    }
}