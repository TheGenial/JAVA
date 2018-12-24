public class variable {
    static int a = 100;
    static int b = 200;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(variable.a);
        System.out.println(variable.b);

        variable v = new variable();
        v.m1();

        System.out.println(v.b);
    }
    public void m1(){
        System.out.println(variable.a);
        System.out.println(variable.b);
    }

}
