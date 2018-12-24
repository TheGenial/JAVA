class p{
     void m1(){
        System.out.println("Parent");
    }
}
class c extends p{
    protected void m1(){
        System.out.println("Child");
    }
}
public class overridingScope {
    public static void main(String[] args) {
        p p = new p();
        p.m1();

        c c = new c();
        c.m1();

        p p1 = new c();
        p1.m1();
    }
}
