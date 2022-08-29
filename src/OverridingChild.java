public class OverridingChild extends OverridingParent{

	public static void main(String[] args) {
		new OverridingChild();
		OverridingParent parentchild1;
	
		OverridingParent parent =new OverridingParent();
		OverridingChild child =new OverridingChild();
		OverridingParent parentchild=new OverridingChild();
		parent.riding(8);
		child.riding(9);
		parentchild.riding(10);
	}
	
	public static int riding(int num) {
		System.out.println("child");
		return num;
		
	}

}

 class OverridingParent{
	public static int riding(int num) {	
		System.out.println("parent");
		return num;
	}
	
}
