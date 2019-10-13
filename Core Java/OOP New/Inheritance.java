class Parent {
    public void m1() {
        System.out.println("In Parent class method");
    }
}

class Child extends Parent {
    public void m2() {
        System.out.println("The Child class method");
    }
}

class Inheritance {
    public static void main(String args[]) {
        Parent p = new Parent();
        p.m1(); //Parent method can be called using parent ref
        //p.m2(); //Child method cannot be called using parent ref

        Child c = new Child();
        c.m1(); //Parent method can be called using child ref
        c.m2(); //Child method can be called using child ref

        Parent p1 = new Child();
        p1.m1(); //Parent ref can hold child object and can called parent method
        //p1.m2(); //Parent ref can hold child object and cannot called child method

        //Child c1 = new Parent(); //Child ref cannot hold Parent object
    }
}