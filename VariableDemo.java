class temp
{
public int instancevar=100;
public void method()
{
int localvar=90;
System.out.println("Hi I am from a Lethod and I have one local variable named localvar"+localvar);
}
}
public class VariableDemo
{
static int staticvar=100;
public static void main(String args[])
{
int localvar =234;
System.out.println(localvar);
System.out.println("Static Variable"+staticvar);
temp t =new temp();
System.out.println("Instance Variable"+t.instancevar);
t.method();
System.out.println("Coded By: Vasu Mittal");
System.out.println("ERP ID: 0251BCA061");
}
}