public class VarNarrowing
{
public static void main(String args[])
{
float fvalue=10.5f;
//int intvalue=fvalue;//Compile time error

int intvalue=(int)fvalue;
float testinttofloat=intvalue;
System.out.println("The floating value is "+fvalue);
System.out.println("The integral value is "+intvalue);
System.out.println("The inttoflat value is "+testinttofloat);

//Using Wrapper Class

int tempwrapper=Integer.parseInt(args[0]);
System.out.println("The value received from CommandLine and after conversion into int is  "+tempwrapper);

float tempwrapperfloat=Float.parseFloat(args[0]);
System.out.println("The value received from CommandLine and after conversion into int is  "+tempwrapperfloat);

double tempwrapperdouble=Double.parseDouble(args[0]);
System.out.println("The value received from CommandLine and after conversion into int is  "+tempwrapperdouble);
System.out.println("Coded By: Vasu Mittal");
System.out.println("ERP ID: 0251BCA061");
}
}