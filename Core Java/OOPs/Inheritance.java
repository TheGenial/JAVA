class P{
    public void m1(){
        System.out.println("Parent Method");
    }
}
class C extends P{
    public void m2(){
        System.out.println("Child Method");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        P p1 = new P();
        p1.m1();
        //p1.m2();   //Child method Parent Ref

        C c1 = new C();
        c1.m1();
        c1.m2();

        P p2 = new C();
        p2.m1();
        //p2.m2();
    }
}
