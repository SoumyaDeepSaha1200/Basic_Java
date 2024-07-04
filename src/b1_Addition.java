//Q1-> Write a program in java to add two numbers
import java.util.Scanner;
public class b1_Addition
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a=20,b=50;
        int c=a+b;
        System.out.println("Addition is:- "+c);

        System.out.println("Enter the first number:- ");
        int x=Sc.nextInt();
        System.out.println("Enter the second number:- ");
        int y=Sc.nextInt();

        int q=x+y;

        System.out.println("User taken addition is:- "+q);
    }

}