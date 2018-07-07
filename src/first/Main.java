package first;

import secondPkg.Third;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("In main method");
		
		Second second = new Second();
		second.SecondClass();
		
		System.out.println("after second class over");
		Third third1 = new Third();
		third1.thirdClass();
	}

}
