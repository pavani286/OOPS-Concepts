package Programs;

public class AnimalMain {

		public static void main(String[] args) {
		  Animal A = new Animal(); //static polymorphism or complie time polymorphism
		  A.eat();
		  A.food();
	     Animal s = new Animalsubclass(); //upcasting (child class object ir refering to parent clas references variable)
	      s.eat();                         //  --- know as dynamic polymorphism or run-time polymorphism
	      s.food();          // dynamic polymorphism can only call overridden methods,common methods and parent class methods
		  
		  
		  Animalsubclass s1 = new  Animalsubclass();
		  s1.sleep();
		  s1.eat();
		  s1.food();
	   
	  }  

}

/*   At runtime the method perferences goes for the  child class over ridden methods only if and only 
     if the child class methods are overrridden from parent class
 */