
public class Reverse {

	public static void main(String[] args) {
	int[] num = {1,2,3,4,5,6,7,8,9,10};
	int[] reverse= {0} ;
	
	for(int n =1;n<num.length;n--) {
		reverse[num.length-n]=num[n-1];
		//reverse[9]=1;
		//reverse[8]=2;
		//reverse[7]=3;
		//reverse[6]=4;
	}
	System.out.println(reverse);
	
	
	
	
	//num[0],num[1],num[2],num[3]
	/*for(int n=0; n< num.length;n++) {
		if(num[n]!=(n+1)) {
			System.out.println("Missing number is:"+(n+1));
		}
	}*/
	
	
	

	}

}
