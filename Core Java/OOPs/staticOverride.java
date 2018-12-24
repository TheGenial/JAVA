class pa{
    public static void m1(){
        System.out.println("Parent Static Method");
    }
}
class ca extends pa{
    public static void m1(){
        System.out.println("child method");
    }
}
public class staticOverride {
    public static void main(String[] args) {
        pa p = new pa();
        pa.m1();

        ca c = new ca();
        ca.m1();

        pa p2 = new ca();
        p2.m1();
    }
}
