public class Wrapper {
    public static void main(String[] args) {
        Integer iOb = new Integer(100); // boxing
        System.out.println(iOb);

        int i = iOb.intValue();
        System.out.println(i + " " + iOb); //unboxing
    }
}
