import java.util.Scanner;
public class loop2
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int num,i;
        System.out.println("Enter the number :-");
        num=Sc.nextInt();

        for(i=1;i<num;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" Even numbers");
            }
            else {
                System.out.println(i+" Odd numbers");
            }
        }
    }
}