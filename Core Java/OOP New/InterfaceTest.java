/* Interface variable: All the variable in the interface is by default "public static final"*/
/* Interface method: All the method in the interface is by default *public abstract**/
/* Note that Interface is 100% abstract class*/
/* For interface object creation not possible */
/* For interface compulsary we have to give value when declare a variable */
/* If two interface contain same method then we have to provide implementation for One */ 

interface left {
    public static final int i = 10;
    public abstract void m1();
}

interface right {
    public static final int i = 10;
    public abstract void m1();
}

class InterfaceTest implements left,right {

    public void m1(){
        System.out.println("Inside implemented method");
    }

    public static void main(String[] args) {
        //System.out.println(i); //reference of i is ambiguous
        System.out.println(left.i);
        System.out.println(right.i);
        InterfaceTest t = new InterfaceTest();
        t.m1();
    }
}