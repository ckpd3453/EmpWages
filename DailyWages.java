
public class DailyWages {

	public static void main(String[] args) {
		int IS_FULL_TIME =1;
		double RatePerHr = 20;
		int empHrs = 8;
		double DailyWages = 0; 
		 double empCheck = Math.floor(Math.random() * 10) % 2; 
	       if (empCheck == IS_FULL_TIME) {  
	    	   	DailyWages = (RatePerHr*empHrs);
	       		System.out.println("Present");
	    	   	System.out.println( DailyWages );
	       }
	       else
	       {
	    	   DailyWages = 0;
	    	   System.out.println("Absent");
	    	   System.out.println( DailyWages );
	       }
	    	   		
	}

}
