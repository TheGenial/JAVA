//In overloading method resolution always take care by compiler. Hence it is also known as Compiletime polymorphism or early binding
class Test {
    public void m1() {
        System.out.println("In no-arg method");
    }

    public void m1(int i) {
        System.out.println("In int-arg method");
    }

    public void m1(double d) {
        System.out.println("In double-arg method");
    }
}

class Overloading {
     public static void main(String args[]) {
        Test t = new Test();
        t.m1();
        t.m1(10);
        t.m1(10.5);
    }
}

