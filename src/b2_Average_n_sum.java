//Q2=> Write a program accept number of 5 subjects and print there sum & average
import java.util.Scanner;
public class b2_Average_n_sum
{
    public static void main(String [] args)
    {
        Scanner Sc=new Scanner(System.in);
        int a,b,c,d,e,f,g;
        System.out.println("Enter the first subject marks");
        a=Sc.nextInt();
        System.out.println("Enter the second subject marks");
        b=Sc.nextInt();
        System.out.println("Enter the third subject marks");
        c=Sc.nextInt();
        System.out.println("Enter the forth subject marks");
        d=Sc.nextInt();
        System.out.println("Enter the fifth subject marks");
        e=Sc.nextInt();
        f=a+b+c+d+e;
        g=f/5;
        System.out.println("The sum is:- "+f);
        System.out.println("The average is:- "+g);



    }
}