package Inheritance;

class Shape {
	   public void display() {
	      System.out.println("shapes = ");
	   }
	}
     
         
     class Rectangles extends Shape {
  	   public void area() {
  	      System.out.println("Rectangle");
  	   }
  	 }
     class Squares extends Rectangle{
  	   public void area() {
  	      System.out.println("Square");
  	   }
  	 }
	 
	 public class Inheritance {
	
		public static void main(String[] args) {
	      Square i = new Square();
	      i.display();
	      i.area();
	      
	   }
	
		}
		


