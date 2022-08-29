class Mobile {
    static String str = "";
    protected Mobile() {
        str += "Mobile is : ";
    }
}
class Airtel extends Mobile {
    private Airtel() {
        str += "Airtel";
    }
}
public class Docomo extends Mobile {
    private Docomo() {
    	//super();
        str += "Docomo";
    }
    public static void main(String args[]) {
    	 new Docomo();
        System.out.println(str);
    }
}