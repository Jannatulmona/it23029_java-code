//compute (Convert Celsius to Fahrenheit)
import java.util.Scanner;
class Exer2_1TemperatureConver
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
double celsius,fahrenheit;
System.out.print("Enter a degree in Celsius: ");
celsius=sc.nextDouble();

fahrenheit=(9.0/5.0)*celsius+32;
System.out.println("the  fahrenheit temperature is : "+fahrenheit);


}
}