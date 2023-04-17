package marketing;
import java.util.*;
import general.*;


public class sales extends employee
{
	public void tallowance()
	{
		System.out.println("Employee id:-"+" "+emp_id);
		System.out.println("Basic Salary:-"+" "+Basic);
		System.out.println("Travel allowance:-"+" "+0.005*Earnings);
	}
}