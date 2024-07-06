import java.util.Scanner;
public class if_2_odd_even_number
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int num;
        System.out.println("Enter the number check the number is odd or even :- ");
        num=Sc.nextInt();

        if(num%2==0)
        {
            System.out.println("The number is even");
        }
        else if(num%2==1)
        {
            System.out.println("The number is odd");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}