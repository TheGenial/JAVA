public class overloading {
    public void m1(){
        System.out.println("No-arg");
    }
    public void m1(int i){
        System.out.println("One-arg");
    }
    public void m1(int i,int j){
        System.out.println("Two-arg");
    }

    public static void main(String[] args) {
        overloading v = new overloading();
        v.m1();
        v.m1(4);
        v.m1(4,3);
    }
}
