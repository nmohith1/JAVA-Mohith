import java.util.Scanner;
class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the first matrix: ");
        int rows1 = sc.nextInt();
        int columns1 = sc.nextInt();
        System.out.print("Enter the number of rows and columns of the second matrix: ");
        int rows2 = sc.nextInt();
        int columns2 = sc.nextInt();
        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible. Columns of the first matrix must equal rows of the second matrix.");
            return;
        }
        int[][] m1 = new int[rows1][columns1];
        int[][] m2 = new int[rows2][columns2];
        int[][] productMatrix = new int[rows1][columns2];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns1; j++) {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < columns2; j++) {
                m2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    productMatrix[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        System.out.println("Product of the matrices:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}