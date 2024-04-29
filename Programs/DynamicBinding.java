 package Programs;

public class DynamicBinding {
	 public static void main( String args[ ]) {
    // parent class Reference varaible  and object is Teacher(child class) type
		  Person obj = new Teacher();         ////dynamic polymorphism
		  obj.speak();
   //Reference and object both are of Person type.
		  Person p = new Person();        //static polymorphism
		  p.speak();
  // Downcasting -- child class references variable(t) refers to parent class object(p) 		  
		  Teacher t = (Teacher)p;    
		   
		    
		  }
}

