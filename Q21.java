//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;

public class Q21 {
    public static void Addition(int arr[][], int arr1[][], int m, int n) 
    {
        int sum[][] = new int[m][n];
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                sum[i][j] = arr[i][j] + arr1[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void Multiplication(int arr[][], int arr1[][], int m, int n, int p) throws ArrayIndexOutOfBoundsException {
        int sum[][] = new int[m][p];
        if (n != arr1.length) 
        {
            throw new ArrayIndexOutOfBoundsException("Matrix multiplication not possible: Number of columns in first matrix must be equal to the number of rows in the second matrix");
        }
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < p; j++)
            {
                sum[i][j] = 0; // Initialize the sum for current element of result matrix
                for (int k = 0; k < n; k++)
                {
                    sum[i][j] += arr[i][k] * arr1[k][j]; // Sum of products of corresponding elements
                }
                System.out.print(sum[i][j] + " "); // Print the result
            }
            System.out.println(); // Move to the next row
        }
    }

    public static void Transpose(int arr[][], int m, int n)
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Row:");
        int m = obj.nextInt();
        System.out.println("Enter the Coloumn:");
        int n = obj.nextInt();
        int arr[][] = new int[m][n];
        System.out.println("Enter the elements into the Matrix-1:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = obj.nextInt();
        System.out.println("The " + m + " by " + n + " Matrix-1 is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the Row:");
        int p = obj.nextInt();
        System.out.println("Enter the Coloumn:");
        int q = obj.nextInt();
        int arr1[][] = new int[p][q];
        System.out.println("Enter the elements into the Matrix-2:");
        for (int i = 0; i < p; i++)
            for (int j = 0; j < q; j++)
                arr1[i][j] = obj.nextInt();
        System.out.println("The " + p + " by " + q + " Matrix-2 is:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("After Addition of both the Matrix:");
        try 
        {
            Addition(arr, arr1, m, n);
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("After Multiplication of both the Matrix:");
        try
        {
            Multiplication(arr, arr1, m, n, q);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println("Transpose of Matrix is:");
        Transpose(arr, m, n);

    }
}
