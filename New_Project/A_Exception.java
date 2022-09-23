package New_Project;

public class A_Exception {

 public static void main(String[] args) {
			  
			  int x = 5;
			  int y = 5;
			  int z = 20;
			  
			  int a = 0;
			  
			  try 
			  {			  
			  a = z / (x-y);
			  }
			  catch( Exception e )
			  {
			   System.err.println("....e....="+e);
			  }
			  
			  System.out.println("a="+a);
			  
			  System.out.println("hello");
			  

			 }               
			
		
	}

