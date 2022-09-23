package New_Project;

public class Finally_Exception {

	public static void main(String[] args) {
		
		  int x=5,y=5,z=10;
		  int a = 0;
		  String str = null;
		  int s = 0;
		  
		  try 
		  {			  
		  a = z / (x-y);
		  }
		  catch(ArithmeticException e )
		  {
		   System.err.println("ArithmeticException="+e);
		  }
	
		  try
		  {
			  s = str.length();
		  }
		  catch(NullPointerException n)
		  {
			  System.err.println("ArithmeticException="+n);  
		  }
		  
		  finally
		  {
			  System.out.println("Types of Exception");    
		  }
	}

}
