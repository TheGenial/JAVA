public class ovrPromotions4 {
    public void m1(int i,float f){
        System.out.println("int-float version");
    }
    public void m1(float f,int i){
        System.out.println("float-int version");
    }

    public static void main(String[] args) {
        ovrPromotions4 o = new ovrPromotions4();
        o.m1(10,10.2f);
        o.m1(10.5f,2);
        o.m1('A',5.5f);
        //o.m1(10,'A'); // Coz 'A' looking for int but found float
        //o.m1(10,10);  //coz dont know which to call
        //o.m1(10.5f,10.5f) //coz dont know which to call
    }
}
