class SamsungMobile
{
    public static void main(String[] args)
    {
        Simple.getData();
        Simple.display();
    }
}
class Simple
{
    static int a, b = 20;
    static void getData()
    {
        System.out.println("a = " + a);
    }
    static void display()
    {
        System.out.println("b = " + b);
    }
    static
    {
        System.out.println("Samsung Mobile");
        a = 4 * b;
    }
}