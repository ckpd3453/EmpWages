
public class PartTimeEmpWageUC3 {

	public static void main(String[] args) {
				int partTime = 1;
				int fullTime = 2;
				double RatePerHr = 20;
				int empHrs = 0;
				double DailyWages = 0;
						double empCheck = Math.floor(Math.random() * 10) % 3;

				if ( fullTime == empCheck )
				{
					empHrs = 8;
					DailyWages = (RatePerHr*empHrs);
	       			System.out.println("Full Time");
	       			System.out.println( DailyWages );
				}
				else if ( partTime == empCheck )
				{
					empHrs = 4;
					DailyWages = (RatePerHr*empHrs);
		       		System.out.println("Part Time");
		    	   	System.out.println( DailyWages );
				}
				else
				{
					   System.out.println("Absent");
			    	   System.out.println( DailyWages );
				}
	}

}
