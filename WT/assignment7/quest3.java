import java.util.*;
public class quest3 
{
    public static void main(String[] args) 
    {
        int sumdiag1 = 0;
        int sumdiag2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix elements: ");
        int a[][] = new int[3][3];
        for(int i= 0; i<3; i++)
        {
            for(int j= 0; j<3; j++)
            {
                a[i][j]= sc.nextInt();
            }
        }

        for(int i=0; i<3; i++)
        {
            for(int j= 0; j<3; j++)
            {
                if( i==j)
                {
                    sumdiag1 = sumdiag1+ a[i][j];
                }
            }
        }

        sumdiag2 = a[0][2]+a[1][1]+a[2][0];

        
        System.out.println("Sum of the first diagonal: " +sumdiag1);
        System.out.println("Sum of the second diagonal: " +sumdiag2);
    }
}
