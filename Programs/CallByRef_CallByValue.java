package Programs;

public class CallByRef_CallByValue {
	
	static String x="Tom";
	static String y="peter";
	 
	public static void main(String[] args) {
	  int i = 20;
	  int j = 90;
      CallByRef_CallByValue rv = new CallByRef_CallByValue();
	  rv.CallByReference(rv);
	  System.out.println("after call-by-reference: "+"x = " +x+ "  y = " +y);
	  System.out.println("before swaping call by value ..."+"i = " +i+ "  j = " +j);
	  rv.CallByvalue(i,j);
	  
	}
    public void CallByReference(CallByRef_CallByValue rv) {
    	  x="peter";
    	  y="lisa";
    	  System.out.println("Before call-by-reference: "+"x = " +x+ "  y = " +y);
    	 
    }
    public void CallByvalue(int a, int b) {
    	int c;
    	c = a;
  	    a = b;
    	b = c;
    	System.out.println("after sawping val of a & b is ..."+a+"  "+b);
    } 
}
