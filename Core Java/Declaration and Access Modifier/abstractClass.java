abstract class Bike{
    abstract void run();
}
public class abstractClass extends Bike {
     protected void run(){
        System.out.println("Drive Safely");
    }

    public static void main(String[] args) {
        abstractClass c = new abstractClass();
        c.run();

        Bike b = new abstractClass();
        b.run();
    }
}
