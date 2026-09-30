public  class BitwiseOperations {
public static void main (String args[]){
int a = 5;
int b = 3;

int bitwiseAnd = a & b ;
System.out.println("Bitwise AND: " + bitwiseAnd);

int bitwiseOr = a | b ;
System.out.println("Bitwise OR: " + bitwiseOr);

int bitwiseXor = a ^ b;
System.out.println("Bitwise XOR: " + bitwiseXor);

int bitwiseNotA = ~a;
System.out.println("Bitwise NOT of a: " + bitwiseNotA);

int leftShift = a <<2;
System.out.println("Left shift of a: " + leftShift);

int rightShift = a >>2;
System.out.println("Right shift of a: " + rightShift);
System.out.println("Coded By: Vasu Mittal");
System.out.println("ERP ID: 0251BCA061");
}
}
