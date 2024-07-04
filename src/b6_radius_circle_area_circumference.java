//Q-> WAP to accept radius of circle and find area and circumference of a circle.
//Formule is area=3.14*radius^2, circumferecnce = 2*3.14*radius
import java.util.Scanner;
public class b6_radius_circle_area_circumference
{
    public static void main(String args[])
    {
        Scanner Sc=new Scanner(System.in);
        int rad,area,cir;
        float pai= (float) 3.14;
        System.out.println("Enter the number radius of a circle :- ");
        rad=Sc.nextInt();
        area= (int) (pai*rad*rad);
        cir= (int) ((int) 2*pai*rad);

        System.out.println("Area of a circle is: "+area);
        System.out.println("Circumference of a circle is: "+cir);


    }
}