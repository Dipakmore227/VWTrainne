package ExceptionEx;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InsufficientBalException extends Exception{

	    private double currBal;
	    private double withAmt;
	    private int acctno;
	    
	    
	    public InsufficientBalException (double currBal, double withAmt, int acctno) {
	        super();
	        this.currBal = currBal;
	        this.withAmt = withAmt;
	        this.acctno = acctno;
	    }

	    
	  
	    @Override
	    public String toString() {
	    
	        return "InsufficientBalanceException [currBal=" + currBal + ", withAmt=" + withAmt + ", acctno=" + acctno + "]";
	    }
	    
}
