class Test {
    public void m1(int i) {
        System.out.println("In int-arg method");
    }

     public void m1(double f) {
        System.out.println("In double-arg method");
    }
}

class Test2 {
    public void m2(String s) {
        System.out.println("In String-arg method");
    }

    public void m2(Object o) {
        System.out.println("In Object-arg method");
    }

}

class Test3 {
    public void m3(String s) {
        System.out.println("In String-arg method");
    }

    public void m3(StringBuffer sb) {
        System.out.println("In StringBuffer-arg method");
    }
    
}

class Test4 {
    public void m4(int i, float f) {
        System.out.println("In int - float method");
    }

     public void m4(float f, int i) {
        System.out.println("In float - int method");
    }
}

class OverloadingCases {
    public static void main(String args[]) {
        Test t = new Test();
        t.m1(10);
        t.m1(10f); //automatic promotion to double
        t.m1('a'); //automatic promotion to Int
        t.m1(10.5); 

        Test2 t2 = new Test2();
        t2.m2(new String());
        t2.m2(new Object());
        t2.m2(null); //precidency for child type (String) not the Object type here

        Test3 t3 = new Test3();
        t3.m3("Arif");
        t3.m3(new StringBuffer("Test"));
        //t3.m3(null); //ambiguity problem cause string and string buffer is in the same level

        Test4 t4 = new Test4();
        t4.m4(10,10f);
        t4.m4(10f,10);
        //t4.m4(10,10); //ref to m4 is ambiguuous
        //t4.m4(10.5f,10.5f); //cannot find symbol
        //t4.m4('a',10); //ref ambiguous
    }
}