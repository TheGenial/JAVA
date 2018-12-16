class  A{ int i,j;}
class B{ int i,j;}
class C extends A{ int k;}
class D extends A{int k;}

public class InstanceOf {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A)
            System.out.println("a is instanceof A");
        if(b instanceof B)
            System.out.println("b is instanceof B");
        if(c instanceof C)
            System.out.println("c is instanceof C");
        if(c instanceof A)
            System.out.println("c is instanceof A");
        if(a instanceof C)
            System.out.println("a is instanceof C");

        System.out.println();

        A ob;
        ob = d;
        System.out.println("ob now ref to D");
        if(ob instanceof D)
            System.out.println("ob is a instance of D");

        System.out.println();

        ob = c;
        System.out.println("ob now ref to C");

        if(ob instanceof D)
            System.out.println("ob can cast to D");
        else
            System.out.println("ob cannot cast to D");

        if(ob instanceof A)
            System.out.println("ob can cast to A");

        System.out.println();

        if(a instanceof Object)
            System.out.println("a maybe cast to object");
        if(b instanceof Object)
            System.out.println("b maybe cast to object");
        if(c instanceof Object)
            System.out.println("c maybe cast to object");
        if(d instanceof Object)
            System.out.println("d maybe cast to object");
    }
}
