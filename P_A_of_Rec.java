import java.util.Scanner;

public class P_A_of_Rec {
    public static void main(String[] strings) {
        double width;
        double height;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Width: ");        
        width = in.nextDouble();
        System.out.print("Enter Height: ");
        height = in.nextDouble();
        double area = width * height;
        double perimeter = 2 * (width + height);
        System.out.print("Area of Rectangle = " + area + "\n");
        System.out.print("Perimeter of Rectangle = " + perimeter + "\n");
        System.out.println("Coded By: Vasu Mittal");
        System.out.println("ERP ID: 0251BCA061");
        in.close();
    }
}