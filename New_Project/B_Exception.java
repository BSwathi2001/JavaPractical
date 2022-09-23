package New_Project;

public class B_Exception {
	
   public static void main(String args[])
   {
	   String[] myString={"Swathi","Anitha","Srija","Saru","Harini"};
      try
      {
	  System.out.println("myString = "+myString[5]);
      }
      catch(StringIndexOutOfBoundsException e)
      {
	  System.out.println("..e.."+e);
       }
   }
}
