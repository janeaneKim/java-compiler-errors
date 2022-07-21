
public class Week4Day2 {

	public static void main(String[] args) {
//		 Create a small program that defines some variables (inside main). 
//		 Try creating some illegal variable names and see what kind of error 
//		 the compiler produces. Use the naming rules and conventions as a guide.
//		 In the program you created, try leaving the variables uninitialized 
//		 and print out their values.  
//		 
//		 Becoming familiar with common compiler errors will make it easier to recognize bugs in your code. 
		
		//illegal variables:
		
		byte bigNum = 33345678;
		System.out.println(bigNum);
		//Error: Type mismatch: cannot convert from int to byte
		
		int %number = 50;
		System.out.println(%number);
		//Error: Syntax error on token "%", delete this token
		//// variable cannot be declared with symbol as the starting char
		
		String pony = "pony" ;
		System.out.println(Pony); //variables are case sensitive
		//Error: Pony cannot be resolved to a variable
		
		String int = "some number";
		System.out.println(int);
		//Error: Syntax error on token "int", delete this token
		//Syntax error, insert ". class" to complete ArgumentList
			//Keywords cannot be variable names
			//thus, the print function recognizes int as a keyword rather than an variable
		
		System.out.println("This is in quotes");
		// ^^ this code works on its own but not here....
		
		System.out.println(unitializedVariable);
		//Error: unitializedVariable cannot be resolved to a variable.

		
	}

}
