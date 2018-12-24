public class ovrPromotions3 {
    public void m1(String s){
        System.out.println("String Version");
    }
    public void m1(StringBuffer sb){
        System.out.println("String Buffer Version");
    }

    public static void main(String[] args) {
        ovrPromotions3 o = new ovrPromotions3();
        o.m1("durga");
        o.m1(new StringBuffer("durga"));
        //o.m1(null);  //In here null is ambigious and both ar child so error
    }
}
