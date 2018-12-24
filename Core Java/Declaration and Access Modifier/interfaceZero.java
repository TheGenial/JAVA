interface Interf{
    void m1();
    void m2();
}
abstract class serviceProvider implements Interf{
    public void m1(){
        System.out.println("inside m1");
    }
}
abstract class service implements Interf{
    public void m2(){
        System.out.println("inside m2");
    }
}
public class interfaceZero {
    public static void main(String[] args) {

    }
}
