class p{
    public void property()
    {
        System.out.println("cash+loan+property");
    }
    public final void marry()
    {
        System.out.println("Suba Laxmi");
    }
}
class c extends p{
    public void marry()
    {
        System.out.println("9 tara");
    }
}
public class finalMethod {
    public static void main(String[] args) {
        p p1 = new p();
        p1.property();
        p1.marry();

        c c1 = new c();
        c.marry();
    }
}
