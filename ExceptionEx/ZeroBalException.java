package ExceptionEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ZeroBalException extends Exception {

	  private double currBal;
	    private double withAmt;
	    private int acctno;
	    
	    
	    public ZeroBalException (double currBal, double withAmt, int acctno) {
	        super();
	        this.currBal = currBal;
	        this.withAmt = withAmt;
	        this.acctno = acctno;
	    }

	    SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  



		@Override
		public String toString() {
			return "ZeroBalException:- Dear customer, Your a/c no  "+acctno+" & your available balance is = " + currBal+". on "+ft.format(date);
		}

	    
	 

}
