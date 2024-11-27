public class Overloading2 {
    int a() {
        return 2;
    }
    int a(int x)
    {
        return x;
    }
    int a(int x, int y)
    {
        return x*y;
    }
    int a (char x )
    {
      return x;
    }
    float a ( float a, float z)
    {
        return a+z;
    }
    double a (double x) {
        return x;
    }
    public static void main (String[] args)
    {
        Overloading2 M = new Overloading2 ();
        int p =M.a(2);
        System.out.println(p);
        int q = M.a(2,3);
        System.out.println(q);
        int r= M.a('x');
        System.out.println(r);
        int s = M.a();
        System.out.println(s);
        float t=M.a(2f,3f);
        System.out.println(t);
        double u =M.a(103546978d);
        System.out.println(u);
    }
}

