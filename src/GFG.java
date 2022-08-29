class Test {

    static
    {
        System.out.println("static block called ");
    }
    Test() { System.out.println("Constructor called"); }
}
 
class GFG {
 
    public static void main(String args[])
    {
        Test t1 = new Test();
        Test t2 = new Test();
    }
}