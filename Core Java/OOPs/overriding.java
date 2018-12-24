class parent{
    public void m1(){
        System.out.println("Parent Method");
    }
}
class child extends parent{
    public void m1(){
        System.out.println("Child Method");
    }
}
public class overriding {
    public static void main(String[] args) {
        parent p = new parent();
        p.m1();

        child c = new child();
        c.m1();

        parent p1 = new child();
        p1.m1();
    }
}
