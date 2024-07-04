//Q12-> WAP to accept principal amount, rate of interest, time find the simple interest.

import java.util.Scanner;
public class b13_Simple_Interest
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int p,r,t,si;
        System.out.println("Enter the principal amount:- ");
        p=Sc.nextInt();
        System.out.println("Enter the rate of interest:- ");
        r=Sc.nextInt();
        System.out.println("Enter the time:- ");
        t=Sc.nextInt();

        si=(p*r*t)/100;

        System.out.println("The simple interest is:- "+si);
    }
}