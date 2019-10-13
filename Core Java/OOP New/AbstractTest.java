/* Abstarct method: No implementation, Child class responsible for implementation */
/* Abstarct class: Don't allow to create object */
/* If a class contain atleast one abstract method then compulsary that class should be declare as abstract */
/* If child class didn't provide implementation of all methods then that class will also consider as abstract */
/* Next level child class is responsible for providing implementation of those methods */
/* A class maynot have any abstruct method also */

abstract class Test{
    public void m1(){
        System.out.println("Inside m1");
    }

    final public void m2(){
        System.out.println("Inside m2");
    }

    abstract public void m3();
    abstract public void m4();
}

abstract class Test2 extends Test {
    public void m3(){
        System.out.println("Inside m3");
    }
}

class Test3 extends Test2 {

    //Overriden method
    public void m3() {
        System.out.println("Inside overriden m3");
    }

    public void m4(){
        System.out.println("Inside m4");
    }

    public void m4(int i){
        System.out.println("Inside int-arg m4");
    }
}

class AbstractTest{
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.m1();
        t.m2();
        t.m3();
        t.m4();
        t.m4(10);
    }
}

