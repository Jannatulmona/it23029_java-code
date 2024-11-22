//compute define the volume of a cylinder
import java.util.Scanner;
class Exer2_2VolumeCylinder
{
public static void main(String[]args)
{
final double PI=3.1416;
Scanner sc=new Scanner(System.in);
//Scanner length=new Scanner(System.in);

double area,length1,volume,radius;
System.out.print("Enter radius and length: ");
radius=sc.nextDouble();
length1=sc.nextDouble();
area=radius*radius*PI;
System.out.println("the area is : "+area);

volume=area*length1;
System.out.println("the volume of a cylinder is : "+volume);


}
}