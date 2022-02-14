
public class TotalWagesUC6 {

	public static void main(String[] args) {
		int	maxRateInMonth=100;
		int	empRatePerHr=20;
		int numOfWorkingDays=20;
		int totalEmpHr=0;
		double totalsalary = 0;
		int totalWorkingDays = 0;
		int totalFullTime = 0;
		int empHrs=0;

				while (( totalFullTime <= maxRateInMonth && 
						totalWorkingDays <= numOfWorkingDays ))
				{
					totalWorkingDays++;
					double empCheck = Math.floor(Math.random() *10) % 3;
					int i = (int) empCheck;
					switch ( i ) 
					{
						case 1:
								empHrs=8;
								break;
						case 2:
								empHrs=4;
								break;
						case 0:
								empHrs=0;
								break;
					}
					
					totalEmpHr=(totalEmpHr+empHrs);
					System.out.println("Total EmpHr = " + totalEmpHr);
				}
				totalsalary=(totalEmpHr*empRatePerHr);
				System.out.println("Total Salary = " + totalsalary);
	}

}
