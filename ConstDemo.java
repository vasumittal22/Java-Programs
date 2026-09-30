public class ConstDemo
{
public static final int MAX_VALUE=100;
public static void testConstant()
{
final int localvar=25;
System.out.println("The value of Localvar is: "+ localvar);
System.out.println("The value of localvar is: "+ localvar);
}

public static void main(String args[])
{
System.out.println("The maximum value is :"+ MAX_VALUE);

testConstant();
System.out.println("Coded By: Vasu Mittal");
System.out.println("ERP ID: 0251BCA061");
}
}