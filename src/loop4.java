import java.util.Scanner;
public class loop4
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int num,i;
        System.out.println("Enter the number check here multiplication table:- ");
        num=Sc.nextInt();
        for(i=1;i<11;i++)
        {
            System.out.println(" "+num+" X "+i+" = "+i*num);
        }
    }

}