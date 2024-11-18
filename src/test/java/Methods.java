public class Methods {
    int a =10;
    void a ()
    {
System.out.println("Hello world");
    }
    void b() // method with no parameters/Arguments
    {
        System.out.println(2+3);
    }
    void c(int x) // method with parameters
    {
System.out.println(x+3);
    }
    void d (int x, int y)
    {
        System.out.println(x*y);
    }
    void e (int x, float y)
    {
        System.out.println(x-y);
    }
    int x ()
    {
        System.out.println("method with return type" );
        return 5;
    }
    public static void main (String[] args)
    {
        Methods m = new Methods();
        m.a();
        System.out.println(m.a);
        m.b();
        m.c(5);
        m.c(10);
        m.d(10,20);
        m.e(10,10.5f);
        int z = m.x();
        System.out.println(z);

    }
}
