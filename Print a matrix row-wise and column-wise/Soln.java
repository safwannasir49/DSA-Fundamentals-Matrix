import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        
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

        sc.close();
    }
}
