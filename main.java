
import java.util.Scanner;
class Student {
    int studentId;
    String studentName;

    void read() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student ID: ");
        studentId = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Student Name: ");
        studentName = sc.nextLine();
    }

    void display() {
        System.out.println("ID: " + studentId + " Name: " + studentName);
    }
}

public class main {
    public static void main(String args[]) {

        System.out.println("Entering details for Tyagi");
        Student tyagi = new Student();
        tyagi.read();

        System.out.println("Entering details for Jai");
        Student jai = new Student();
        jai.read();

        System.out.println("\nDisplaying Student Information--");

        tyagi.display();
        jai.display();
        System.out.println("Coded By: Vasu Mittal");
        System.out.println("ERP ID: 0251BCA061");
    }
}

