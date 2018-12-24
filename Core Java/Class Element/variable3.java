public class variable3 {
    int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        variable3 v = new variable3();
        System.out.println(v.a);
        System.out.println(v.b);

        v.a = 999;
        v.b = 888;
        System.out.println(v.a);
        System.out.println(v.b);

        variable3 v1 = new variable3();
        System.out.println(v1.a);
        System.out.println(v1.b);
        v1.b = 777;

        variable3 v2 = new variable3();
        System.out.println(v2.a);
        System.out.println(v2.b);
    }
}
