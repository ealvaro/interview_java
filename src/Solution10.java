//An abstract class named Arithmetic containing an abstract method named add(int,int) is provided for you in the editor.
// 
//The main method in the Solution class creates an Adder object, prints the name of the class that Adder inherited, and calls the add(int,int) method.
// 
//Write the Adder class and add(int,int) method implementation so the following output is produced upon execution:
public class Solution10 {

	abstract class Arithmetic{  
		  abstract int add(int a,int b);  
		}
	
	class Adder extends Arithmetic {

		@Override
		int add(int a, int b) {
			return a+b;
		}
		
	}
	
	public static void main(String []args) {
		Solution10 s = new Solution10();
		Adder a = s.new Adder();
		System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());	
		System.out.print(a.add(10,32)+" "+a.add(10,3)+" "+a.add(10,10)+"\n");
	}
}
