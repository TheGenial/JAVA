abstract class Vehicle{
    abstract public int getNoofWheels();
}
class Bus extends Vehicle{
    public int getNoofWheels(){
        return 7;
    }
}
public class abstractMethod {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();//can not be instantiate
    }
}
