
public class Overloading {

	public static void main(String[] args) {
		method1("8");

	}
	
	public static void method1(int num) {
		System.out.println("first method");
	}
	
     public static void method1(String text) {
		System.out.println("second method");
	}
     
     public static void method1(boolean value) {
 		System.out.println("second method");
 	}

}
