import java.util.Scanner;

class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] add = new int[3][3];
        int[][] sub = new int[3][3];
        int[][] mul = new int[3][3];
        int[][] trans = new int[3][3];

        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                add[i][j] = A[i][j] + B[i][j];
                sub[i][j] = A[i][j] - B[i][j];
                trans[j][i] = A[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    mul[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nMatrix Addition:");
        display(add);

        System.out.println("\nMatrix Subtraction:");
        display(sub);

        System.out.println("\nMatrix Multiplication:");
        display(mul);

        System.out.println("\nTranspose of Matrix A:");
        display(trans);

        sc.close();
        System.out.println("Coded By: Vasu Mittal");
        System.out.println("ERP ID: 0251BCA061");
    }

    static void display(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}