package New_Project;

import java.util.Vector;

public class Exception_Vector {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("Dog");
        v.add("Horse");
        v.add(2, "Cat");
        System.out.println("Vector: " + v);
        
        Vector<String> animals = new Vector<>();
        animals.add("Crocodile");

        animals.addAll(v);
        System.out.println("New Vector: " + animals);
	}

}
