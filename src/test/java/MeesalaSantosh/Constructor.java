package MeesalaSantosh;

public class Constructor {
    Constructor ()
    {
        System.out.println("Santosh");
    }
    Constructor (int x)
    {
        System.out.println(x);
    }
    Constructor (float y)
    {
        System.out.println(y);
    }
    public static void main(String[] args)
    {
        Constructor s = new Constructor ();
        Constructor s1 = new Constructor(2);
        Constructor s2 = new Constructor (3f);
    }
}
