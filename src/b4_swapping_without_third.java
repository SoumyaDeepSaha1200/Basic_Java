//Q4-> Write a program to accept a number and swap them without using third variable
import java.util.Scanner;
public class b4_swapping_without_third
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of A:- ");
        a=Sc.nextInt();
        System.out.println("Enter the value of B:- ");
        b=Sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping A:- "+a);
        System.out.println("After swapping B:- "+b);

    }
}