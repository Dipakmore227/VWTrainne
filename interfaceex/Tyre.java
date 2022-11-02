package interfaceex;

public class Tyre implements Bounceable {

	    private int tf;
	    
	    private String color;
	    
	    
	   public Tyre(String tyrecolor) {
	        super();
	        this.color=tyrecolor;
	    }

	   public String getColor() {
		    return color;
		}

	  public void setColor(String color) {
		       this.color = color;
	    }
	  
	  @Override
	  public void bounce()
	    {
	       System.out.println("It's a "+ this.color+ " color Tyre bouncing with bounce factor = "+this.tf);    
	    }
	    
	  @Override
	    public void setBounceMultiple(int multiple)
	    {
	        
	        this.tf = Bounceable.BOUNCE_FACTOR * multiple;
	        
	    }
	    

}
