
public class CasePartTimeUC4 {

	public static void main(String[] args) {
		
		double RatePerHr = 20;
		int empHrs = 0;
		double DailyWages = 0;
		double empCheck = Math.floor(Math.random() * 10) % 3;
		int i = (int) empCheck;
		switch ( i ) 
		{
		    case 1:
						empHrs = 8;
						DailyWages = (RatePerHr*empHrs);
						System.out.println("Full Time");
						System.out.println( DailyWages );
						break;
		    case 2:
						empHrs = 4;
						DailyWages = (RatePerHr*empHrs);
						System.out.println("Part Time");
						System.out.println( DailyWages );
						break;
		    case 0:
						System.out.println("Absent");
			    	    System.out.println( DailyWages );
			    	    break;
		}
	}
}
			
		
