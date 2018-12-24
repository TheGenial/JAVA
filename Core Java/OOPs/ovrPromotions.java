public class ovrPromotions {
    public void m1(){
        System.out.println("No-arg");
    }
    public void m1(int i)
    {
        System.out.println("int-arg");
    }
    public void m1(float f){
        System.out.println("float-arg");
    }

    public static void main(String[] args) {
        ovrPromotions o = new ovrPromotions();
        o.m1();
        o.m1('A');
        o.m1(1);
        o.m1(10.2f);
    }
}
