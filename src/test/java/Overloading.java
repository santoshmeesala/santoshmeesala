public class Overloading {
    void a()
    {
        System.out.println("Void a");
    }
    void a (char x)
    {
        System.out.println("char " + x);
    }
    void a (int x)
    {
        System.out.println("int " + x);
    }
    void a (float x)
    {
        System.out.println("float " + x);
    }
    int a (int x, int y)
    {
        return x+y;
    }
    public static void main(String[] args)
    {
        Overloading m = new Overloading();
        m.a();
        m.a('2');
        m.a(2);
        m.a(2f);
        int z = m.a(2,5);
        System.out.println(z);
    }
}
