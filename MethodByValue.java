public class MethodByValue
{
static void increament(int num)
{
num++;
System.out.println("After increament the value is " + num);
}
public static void main(String[] args)
{
int x = 5;
increament(x);
System.out.println("The original Value is not changed by the method it is as is " + x);
System.out.println("Coded By: Vasu Mittal");
System.out.println("ERP ID: 0251BCA061");
}
} 