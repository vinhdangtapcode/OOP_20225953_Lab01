import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int row = input.nextInt();
        int col = input.nextInt();

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];
        int[][] sumMatrix = new int[row][col];

        System.out.println("Matrix 1:");
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix 2:");
        for (int i=0;i<row;i++) {
            for (int j=0;j<col; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum:");
        for (int i=0;i<row;i++) {
            for (int j=0;j<col;j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println(); 
        }

        input.close();
    }
}
