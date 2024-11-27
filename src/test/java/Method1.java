public class Method1 {
    void a (int x) {
        int i =1;
        int sum = 0;
        for (i=1; i<=x; i++)
        {
            sum = sum+i;
        }
        System.out.println(sum);
    }
    public static void main (String[] args)
    {
        Method1 m = new Method1();
        m.a(20);
        m.a(10);

    }
}
