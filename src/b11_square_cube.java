//Q11 -> Write a program to enter a number find there suqre and cube
import java.util.Scanner;
public class b11_square_cube
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int a;
        System.out.println("Enter A number :-");
        a=Sc.nextInt();

        int square=a*a;
        int cube=a*a*a;

        System.out.println("The Square value is:- "+square);
        System.out.println("The Cube value is:- "+cube);
    }
}