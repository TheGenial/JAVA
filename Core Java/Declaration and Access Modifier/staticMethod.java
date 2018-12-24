public class staticMethod {
    public static void main(String[] args) {
        System.out.println("String args");
    }

    public static void main(int[] args) {
        System.out.println("Int args");
    }
}
class c extends staticMethod{
    public static void main(String[] args) {
        System.out.println("Child method args");
    }
}
