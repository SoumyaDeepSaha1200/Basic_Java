import java.util.Scanner;
public class if_1_positive_negative_number
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number :- ");
        num=Sc.nextInt();
        if(num<0)
        {
            System.out.println("The number is negative");
        }
        else if(num>0)
        {
            System.out.println("The number is positive");
        }
        else {
            System.out.println("The number is zero");
        }
    }
}