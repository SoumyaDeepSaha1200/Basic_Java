//Q15-> Write a program to check compound inteest
import java.util.Scanner;
public class b15_Compound_interest {
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        double p,r,t,com;
        System.out.println("Enter the principal intertest:- ");
        p=Sc.nextInt();
        System.out.println("Enter the rate intertest:- ");
        r=Sc.nextInt();
        System.out.println("Enter the time:- ");
        t=Sc.nextInt();

        com=p*(Math.pow((1+r/100),t));

        System.out.println("Compound interest is:- "+com);
    }
}