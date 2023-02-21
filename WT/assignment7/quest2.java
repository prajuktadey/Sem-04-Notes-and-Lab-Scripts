import java.util.*;
public class quest2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of the matrix: ");
        int r = sc.nextInt();
        int c = sc.nextInt();


        int a[][] = new int[r][c];
        System.out.println("Enter first array elements: ");
        for(int i=0; i<r; i++)
        {
           for(int j=0; j<c; j++)
           {
              a[i][j]= sc.nextInt();
           }
        }

        int ar[][] = new int[r][c];
        System.out.println("Enter second array elements: ");
        for(int p=0; p<r; p++)
        {
           for(int q=0; q<c; q++)
           {
              ar[p][q]= sc.nextInt();
           }
        }

        System.out.println("The final array result:  ");
        int finalarray[][] = new int[r][c];
        for(int i=0; i<r; i++)
        {
           for(int j=0; j<c; j++)
           {
              finalarray[i][j]= a[i][j]+ar[i][j];
           }
        }

        for(int i=0; i<r; i++)
        {
           for(int j=0; j<c; j++)
           {
              System.out.println(finalarray[i][j]);
           }
        }
    }
}
