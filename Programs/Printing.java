package Programs;

import java.util.BitSet;

public class Printing {

	//printing the numbers from 1 to 100 without loop or recursion
	public static void main(String[] args) {
		String set = new BitSet(){{set(1,100);}}.toString();
        System.out.append(set, 1, set.length());
	}

}
