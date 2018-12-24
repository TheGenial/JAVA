abstract class shape{
    abstract void draw();
}
class circle extends shape{
    void draw(){
        System.out.println("Draw Circle");
    }
}
class rectangle extends shape{
    void draw(){
        System.out.println("Draw Rectangle");
    }
}
public class abstractAgain {
    public static void main(String[] args) {
        shape s = new circle();
        s.draw();

        shape s1 = new rectangle();
        s1.draw();
    }
}
