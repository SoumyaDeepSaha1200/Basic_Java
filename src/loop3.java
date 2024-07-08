import java.util.Scanner;
public class loop3
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int num,i;
        int sum=0;
        int sum1=0;
        System.out.println("Enter the number:- ");
        num=Sc.nextInt();
        for(i=1;i<num;i++)
        {
            if(i%2==0)
            {
                sum+=i;
                System.out.println("The numbers are even");
            }
            else
            {
                sum1+=i;
                System.out.println("The numbers are odd");
            }
        }
        System.out.println("The Sum of even numbers is:- "+sum);
        System.out.println("The Sum of odd numbers is:- "+sum1);
    }

}