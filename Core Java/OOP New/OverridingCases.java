//In overriding return type must be same, this is applicable untill 1.4 version
//From 1.5 onward we can take co-varient return type
//This is only applicable for object type but not for premitive type
/*Remember override concept is not applicable for variable but only for method*/

class Parent {
    public Object m1() {
        System.out.println("In parent method");
        return null;
    }

    //private method cannot be overriden
    private void m2() {
        System.out.println("In parent private method");
    }

    //final method cannot be overriden but abstract can
    public final void m3() {
        System.out.println("In parent final method");
    }

    //we cannot decrease the modifier (scope) while overriding
    public void m4() {
        System.out.println("In parent public m4 method");
    }

    //we can increase the modifier (scope) while overriding
    protected void m5() {
        System.out.println("In parent public m5 method");
    }

    //we cannot override static as nonstatic "or" nonstatic as static method
    public static void m6() {
        System.out.println("In parent static m6 method");
    }

    public void m7() {
        System.out.println("In parent non-static m7 method");
    }

    /* Method Hiding: When both parent and child method is static it called as method hiding but not overriding */
    public static void m8() {
        System.out.println("In parent static m8 method");
    }
}

class Child extends Parent {
    public String m1() {
        System.out.println("In child method");
        return null;
    }

    //can define same method as parent method but it is not overriding because they cannot accesable  
    private void m2() {
        System.out.println("In child private method");
    }

    //We cannot write this code here
    //public final void m3() {
    //    System.out.println("In child final method");
    //}

    //trying to make it default but it isn't possible
    //void m4() {
    //    System.out.println("In child default m4 method");
    //}

    //trying to make it public and it is possible
    public void m5() {
        System.out.println("In child public m5 method");
    }

    //If we do the following we will get compiletime error
    //public void m6() {
    //    System.out.println("In child non-static m6 method");
    //}

    //public static void m7() {
    //    System.out.println("In child static m7 method");
    //}

    /* Method Hiding */
    public static void m8() {
        System.out.println("In child static m8 method");
    }

}

class OverridingCases {
    public static void main(String args[]) {
        Parent p = new Parent();
        p.m1(); //parent method
        Child c = new Child();
        c.m1(); //child method
        Parent p1 = new Child();
        p1.m1(); //child method

        p.m5(); //parent method
        c.m5(); //child method
        p1.m5(); //child method

        p.m8(); //parent method
        c.m8(); //child method
        p1.m8(); //parent method
    }
}