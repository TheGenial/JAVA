/* Final Variable: Cannot set new value */
/* Final Method: Cannot override*/
/* Final Class: Cannot extends*/

final class Test {
    public void m1() {
        System.out.println("Inside m1 method");
    }

    public void m1(int i) {
        System.out.println("Inside int-arg method");
    }
}

class FinalExample {
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
        t.m1(10);
    }
}