public class conOverloading {
    conOverloading(){
        this(10);
        System.out.println("0-arg");
    }
    conOverloading(int i){
        this(10.9,20.2);
        System.out.println("1-arg");
    }
    conOverloading(double i,double j){
        System.out.println("2-arg");
    }
    public static void main(String[] args) {
        conOverloading c1 = new conOverloading();
        conOverloading c2 = new conOverloading(10);
        conOverloading c3 = new conOverloading(2.5f,2.5f);
    }
}
