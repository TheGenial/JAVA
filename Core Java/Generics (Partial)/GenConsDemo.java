class GenCons{
    private double val;
    <T extends Number> GenCons(T args){
        val = args.doubleValue();
    }
    void showval(){
        System.out.println("val: "+val);
    }
}
public class GenConsDemo {
    public static void main(String[] args) {

        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);

        test.showval();
        test2.showval();
    }
}
