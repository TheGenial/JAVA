//In overriding method resolution always take care by Runtime. Hence it is also known as Runtime polymorphism or late binding
class Parent {
    public void property() {
        System.out.println("Cash + Home + Gold");
    }

    public void marry() {
        System.out.println("Sokina");
    }
}

class Child extends Parent {
    public void marry() {
        System.out.println("Soniya");
    }
}

class Overriding {
    public static void main(String args[]) {
        Parent p = new Parent();
        p.property();
        p.marry();

        Child c = new Child();
        c.property();
        c.marry();

        Parent p1 = new Child();
        p1.property();
        p1.marry(); //In Compiletime it will check is there any method in Child class as "marry" but in runtime it will call the Parent class "marry" method

        //Child c = new Parent(); //Can't possible
   }    
}