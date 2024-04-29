package Programs;

public class HideVariable {

   private String message = "this is instance variable";
   int i =10;
    HideVariable() {
        String message = "constructor local variable";
        System.out.println(message);
    }

    public void printLocalVariable() {
        String message = "method local variable";
        System.out.println(message);
    }

    public void printInstanceVariable() {
        String mess = "hiiiiii";
        System.out.println("instance variable of i"+i);
        System.out.println(mess);
        System.out.println(this.message);
    }
    public static void main(String[] args) {
		HideVariable m= new HideVariable();
		System.out.println(m.message);
		m.printInstanceVariable();
		m.printLocalVariable();
    }
}
