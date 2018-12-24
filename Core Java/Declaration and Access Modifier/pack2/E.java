package pack2;
import pack1.C;

public class E extends C {
    public static void main(String[] args) {
        C c = new C();
        //c.m1();   //Cant call the m1() coz protected

        E e = new E();
        e.m1();

        C c1 = new E();
        //c1.m1();   ///cant call the m1() coz protected
    }
}
