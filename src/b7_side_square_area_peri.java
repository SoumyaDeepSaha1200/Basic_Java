//Q->  WAP to accept the value of one side of a square and find the area and perimeter of square.
//Formule is Area = Side * Side, Perimeter = 4*side
import java.util.Scanner;
public class b7_side_square_area_peri
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int side,area,peri;
        System.out.println("Enter the value of side square:- ");
        side=Sc.nextInt();

        area=side*side;
        peri=4*side;

        System.out.println("Area of a side square is:- "+area);
        System.out.println("Perimeter of a side square is:- "+peri);
    }

}