import java.util.Scanner;

public class MagicMatrixScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows you want: ");
        int row = sc.nextInt();

        System.out.print("Enter the column you want: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter an element for [" + i + "] [ " + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // display
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int[] magicRow = new int[row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                magicRow[i] += matrix[i][j];
            }
            magicRow[i] = magicRow[i] * (i + 1);
        }

        int[] magicCol = new int[col];

        for (int i = 0; i < col; i++) {
            magicCol[i] = 1;
            for (int j = 0; j < row; j++) {
                magicCol[i] *= matrix[j][i];
            }
            magicCol[i] = magicCol[i] / (i + 1);
        }
        
          for (int i = 0; i < magicRow.length; i++) {
          System.out.println("Magic Row values are:" + magicRow[i]);
          }
         
          for (int i = 0; i < magicCol.length; i++) {
          System.out.println("Magic Column values are:" + magicCol[i]);
         
          }
         
        boolean found = false;
        System.out.println("Positions of magic numbers in the matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == magicRow[i] || matrix[i][j] == magicCol[j]) {
                    System.out.println("Row " + (i + 1) + ", Column " + (j + 1));
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("No magic numbers found in the matrix.");
        }

    }
}