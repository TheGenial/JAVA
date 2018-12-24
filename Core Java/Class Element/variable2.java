public class variable2 {
    int a = 10;
    int b = 20;

    static void m1(){
        variable2 v = new variable2();
        System.out.println(v.a);
        System.out.println(v.b);
    }
    public void m2(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        variable2 v = new variable2();
        v.m2();
        variable2.m1();
    }
}
