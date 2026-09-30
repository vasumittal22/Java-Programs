class Person 
{
String name;
Person(String name)
{
this.name = name;
}
}
public class MethodByReference 
{
static void changeName(Person person)
{
person.name = "John";
}
public static void main(String args[])
{
Person p = new Person("Alice");
changeName(p);
System.out.println(p.name);
System.out.println("Coded By: Vasu Mittal");
System.out.println("ERP ID: 0251BCA061");
}
}
