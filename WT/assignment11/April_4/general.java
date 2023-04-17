package general;
import java.util.*;

public class employee
{
	public int emp_id;
	private String name;
	public double Basic;
	public double Earnings;
	Scanner sc = new Scanner(System.in);
	public employee()
	{
			System.out.println("Enter the Employee id:- ");
			emp_id=sc.nextInt();
    }
	public void earnings()
	{
			double DA;
			double HRA;
			System.out.println("Enter the basic salary:- ");
			Basic=sc.nextDouble();
			DA=0.8*Basic;
			HRA=0.15*Basic;
			Earnings=Basic+DA+HRA;
			System.out.println("Earnings:-"+" "+Earnings);
	}
}