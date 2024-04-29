package Programs;

public class StaticBinding {
	 static  int i=10;
	
	 static {
		 System.out.println("static block");
	                }
	public static void method() {
		System.out.println("method is called..");
	             }
	public static void method1(int x) {
		System.out.println("method1 is called .."+x);
	           }
    public static void method2(char c,String s) {
    	System.out.printf("method2 is called .."+c+" "+s);
            }
	public static void main(String[] args) {
		//StaticBinding st = new StaticBinding (4);
		System.out.println(StaticBinding.i);
		//System.out.println("Static Varaible.."+i1); //static variable is called with references variable i directly ..s.o.p(i)
		method();
		method1(4);  //StaticBinding.method1(4);
		//**Static methods or static variables can be called in two ways 
		//                      without creating an a object of the class
		//1.by classname (example:  StaticBinding.method1(4);)
		//2.by method name (example : method1(4))
		//***Even we can call the static methods or variables with local objects but it's warning that 
		//static methods and varaibles should be accessed in static way 
		method2('P', "Pavani");

	}

}
