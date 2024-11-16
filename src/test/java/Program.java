public class Program {
    int i = 4;
    static int m = 7;
    public static void main (String[] args) {
        int k = 6;
        Program m = new Program();
        System.out.println(m.i);
        System.out.println(k);
        System.out.println(Program.m);
        if (true) {
            int x = 6;
            k = 9;
            System.out.println(x);
        }
        System.out.println(k);
    }
}

