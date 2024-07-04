//Q10-> WAP to accept the basic salary of an employee and find the HRA , DA,TA,PF ,GS,NP from the following criteria.[hra=percent of basic salary * inputted basic salary]/100
import java.util.Scanner;
public class b10_basic_salaery
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int bs,hra,da,ta,pf,gs,np;
        System.out.println("Enter the Basic Salary:- ");
        bs=Sc.nextInt();

        hra=10*bs/100;
        da=5*bs/100;
        ta=15*bs/100;
        pf=20*bs/100;
        gs=hra+da+ta+bs;
        np=gs-pf;
        System.out.println("HRA is your:- "+hra);
        System.out.println("DA is your:- "+da);
        System.out.println("TA is your:- "+ta);
        System.out.println("PF is your:- "+pf);
        System.out.println("Gross Salary is your:- "+gs);
        System.out.println("Net Amount is your:- "+np);

    }
}