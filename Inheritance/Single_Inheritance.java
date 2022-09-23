package Inheritance;

class Employee {
	public void salary()
	{
        System.out.println("Salary= 200000");
    }
}

class Programmer extends Employee { 
    public void bonus() 
    {
        System.out.println("Bonus=50000");
    }
}

	public class Single_Inheritance
	{		
	    public static void main(String args[]) {
	    	Programmer m = new Programmer();
	        m.salary();
	        m.bonus();
	    }

		
	}

