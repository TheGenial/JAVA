class Box1{
        double width;
        double height;
        double depth;

        Box1(){}

        Box1(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
        }
public String toString(){
        return"Dimension are "+width+" by "+depth+" by "+height+".";
        //return "Hi";
        }
}
public class toStringDemo {
    public static void main(String[] args) {
        Box1 b = new Box1(10,12,14);
        Box1 c = new Box1();
        String s = "Box b: " +b; //concatenate Box object

        System.out.println(b); //convert Box to string
        System.out.println(c);
        System.out.println(s);
    }
}
