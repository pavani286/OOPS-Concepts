package Programs;

public class Test {
 // pass null argument to a method overloading of string type and object type 
	//ans : the jvm compiler will go with string argument and string method 
	public static void main(String[] args) {
			Test t= new Test();
			t.method(null);
			//t.method("pavani");
			//t.method('A');
			}

	public void method(String x) {
		
		System.out.println("string argument...");
	}
	public void method(Object c) {
		
		System.out.println("object argument....");
		
		
	}
}
