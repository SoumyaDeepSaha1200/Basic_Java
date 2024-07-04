//Q5-> WAP to accept length and breadth of a rectangle and find the area and perimeter rectangle.
// area = length * breadth / perimeter = 2 * (length + breadth)
import java.util.Scanner;
public class b5_length_breadth_area_perimeter
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int len,bre,area,peri;
        System.out.println("Enter the length of the rectriangle :-");
        len=Sc.nextInt();
        System.out.println("Enter the breadth of the rectriangle :-");
        bre=Sc.nextInt();
        area=len*bre;
        peri=2*(len+bre);
        System.out.println("The area is:- "+area);
        System.out.println("The perimeter is:- "+peri);
    }
}
