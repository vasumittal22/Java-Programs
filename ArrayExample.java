public class ArrayExample {
public static void main(String args[])
{
// One Dimensional Array
int  numbers[] = new int[5];
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;

// Multi Dimensional Array
int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
// Accessing elements 
System.out.println("Element at index two of numbers array: " + numbers[2]);
System.out.println("Element at (1,2) of matrix: " + matrix[1][2]);
System.out.println("Numbers Array:");
for (int i = 0; i < numbers.length; i++)
{
System.out.println(numbers[i] + " ");
}
// Iterating the matrix 
System.out.println("\nMatrix:");
for (int i = 0; i < matrix.length; i++)
{
for (int j = 0; j < matrix[i].length; j++)
{
System.out.println(matrix[i][j] + " ");
}
System.out.println();
System.out.println("Coded By: Vasu Mittal");
System.out.println("ERP ID: 0251BCA061");
}
}
}