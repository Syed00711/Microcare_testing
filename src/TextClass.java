
public class TextClass {

	public static void main(String[] args) {
	int[] num= {5,6,7,8,9,5};
	char[] b= {'a','b','c','d','e'};
	String[] text= {"This is string text","this","is","a","string"};
	System.out.println("Length of num:"+num.length);
	for(int n=1;n<num.length;n++) {
    System.out.println("Value of Num:"+num[n]);
	}
	
	
	String c="";
	
	for(int n=0;n<b.length;n++) {
		
		c=c+b[n];
	}
	
	System.out.println("Value of c:"+c);
	
	}

}
