package Inheritance;

class GrandParent {
	
	public void farm()
	{
		System.out.println("500 Acres");
	}
	
	public void cart()
	{
		System.out.println("50 carts");
	}
	
	public void cottage()
	{
		System.out.println("5 cottages");
	}
}

class Parent_A extends GrandParent
{
	public void Banglow()
	{
		System.out.println("Banglows");
	}
}

class child_X extends Parent_A
{
	public void Bike()
	{
		System.out.println("ktm");
	}
}

class child_Y extends Parent_A
{
	public void car()
	{
		System.out.println("ford");
	}
}

class Parent_B extends GrandParent
{
	public void flat()
	{
		System.out.println("3 apartments");
	}
}

class child_L extends Parent_B
{
	public void flat_A()
	{
		System.out.println("4 apartments");
	}
}

class child_M extends Parent_B
{
	public void flat_B()
	{
		System.out.println("5 apartments");
	}
}

class child_N extends Parent_B
{
	public void flat_C()
	{
		System.out.println("6 apartments");
	}
}


public class Inheritance_1 {

	public static void main(String[] args) {
		
		GrandParent gp = new GrandParent();
		
		Parent_A pa = new Parent_A();
		Parent_B pb = new Parent_B();
		
		child_X cx = new child_X();
		child_Y cy = new child_Y();
		child_L cl = new child_L();
		child_M cm = new child_M();
		child_N cn = new child_N();
		
		gp.farm();
		gp.cart();
		gp.cottage();
		pa.Banglow();
		cx.Bike();
		cy.car();
		pb.flat();
		cl.flat_A();
		cm.flat_B();
		cn.flat_C();
				
		
		
	}

}



