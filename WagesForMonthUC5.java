
public class WagesForMonthUC5 {

	public static void main(String[] args) {
		int RatePerHr=20;
		int numofworkingDays=20;
		int empHrs = 0;
		double DailyWages = 0;
		double TotalSalary = 0;
		int day=1;
				for(day=1; day<=numofworkingDays; day++)
				{
					double empCheck = Math.floor(Math.random() *10) % 3;
					int i = (int) empCheck;
					switch ( i ) 
					{
					    case 1:
									empHrs = 8;	
									break;
					    case 2:
									empHrs = 4;
									break;
					    case 0:
									System.out.println("Absent");
						    	    break;
					}
					DailyWages = (RatePerHr*empHrs);
					TotalSalary = (TotalSalary+DailyWages);
					System.out.println( TotalSalary );
				}
				System.out.println("Total Salary" + TotalSalary);
	}

}
