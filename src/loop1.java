import java.util.Scanner;
public class loop1
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int i;
        System.out.println("Enter the number :- ");
        int num=Sc.nextInt();
        for(i=0;i<num;i++)
        {
            System.out.println("------------- "+i);
        }
    }
}