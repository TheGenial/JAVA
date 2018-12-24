package pack1;

public class C {
    protected void m1()
    {
        System.out.println("The most missunderstood Modifier");
    }
}
class D extends C{
    public static void main(String[] args) {
        C c1 = new C();
        c1.m1();

        D d = new D();
        d.m1();

        C c2 = new C();
        c2.m1();
    }
}
