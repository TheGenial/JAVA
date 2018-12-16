public class AutoBox {
    public static void main(String[] args) {
        Integer iOb = 100; //Auto Boxing, Replace new Integer(100)
        int i = iOb; //Auto Unboxing, Replace iOb.intValue()
        System.out.println(i+ " "+ iOb);
    }
}
