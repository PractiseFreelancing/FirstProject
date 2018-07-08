package first;

import secondPkg.Third;

public class Second {
	
	public void secondClass(){
	System.out.println("in second class");
	
	Third third = new Third();
	third.thirdClass();
	}
}
