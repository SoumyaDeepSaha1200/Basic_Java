//Q14-> ASCHII Value
import java.util.Scanner;
public class b12_aschii_value
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        char ch;
        int aschi;
        System.out.println("Enter the character find there aschii value :- ");
        ch=Sc.next().charAt(0);

        aschi=ch;
        System.out.println("Aschii value is:- "+aschi);

    }
}