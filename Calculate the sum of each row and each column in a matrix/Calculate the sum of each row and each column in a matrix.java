import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        int rowsum=0,colsum=0;
        
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter the Matrix Elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("**********");
        
        System.out.println("Matrix Elements are: ");
        for (int i = 0; i < rows; i++) {
            System.out.print("[ ");
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]+" "); 
                if (j < cols - 1) {
                }
            }
            System.out.print(" ]");
            System.out.println();
        }
        System.out.println();
        System.out.println("**********");
        System.out.println();
        System.out.println("\nMatrix:");
        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
                rowSum += matrix[i][j];
            }
            System.out.println(" | Row Sum: " + rowSum);
        }

        System.out.println("\nColumn Sums:");
        for (int j = 0; j < cols; j++) {
            int colSum = 0;
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + (j + 1) + ": " + colSum);
        }
        sc.close();
    }
}
