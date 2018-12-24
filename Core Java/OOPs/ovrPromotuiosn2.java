public class ovrPromotuiosn2 {
    public void m1(String s){
        System.out.println("String-args");
    }
    public void m1(Object o){
        System.out.println("Object-args");
    }

    public static void main(String[] args) {
        ovrPromotuiosn2 o = new ovrPromotuiosn2();
        o.m1(new Object());
        o.m1("durga");
        o.m1(null);//String will call cause compiler give presidence to child first
    }
}
