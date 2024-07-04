//Q3=> Write a program to accept a number and swap them using third variable
//Q3=> Write a program to accept a number and swap them using third variable
import java.util.Scanner;
public class b3_swapping_using_third
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of A:- ");
        a=Sc.nextInt();
        System.out.println("Enter the value of B:- ");
        b=Sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping A:- "+a);
        System.out.println("After swapping B:- "+b);

    }
}