import java.util.Scanner;
public class V_of_Cyl
{
   public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter radius: ");
      double radius = in.nextDouble();
      System.out.print("Enter height: ");
      double height = in.nextDouble();
      double volume = (3.1415 * (radius * radius) * height);
      System.out.printf("Volume is : %.2f",volume);
      System.out.println("Coded By: Vasu Mittal");
      System.out.println("ERP ID: 0251BCA061");
      in.close();
    }
}