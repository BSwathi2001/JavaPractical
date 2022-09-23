package Inheritance;

class Shapes {
	   public void display() {
	      System.out.println("Shapes = ");
	   }
	}
	class Rectangle extends Shapes {
	   public void area() {
	      System.out.println("Rectangle");
	   }
	}
	class Square extends Rectangle {
	   public void volume() {
	      System.out.println("Square");
	   }
	}
	public class Multilevel_Inheritance {
	   public static void main(String[] args) {
		  Square s = new Square();
	      s.display();
	      s.area();
	      s.volume();
	   }
	}
