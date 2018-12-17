class Stats<T extends Number>{
    T[] nums;

    Stats(T[] o){
        nums = o;
    }
    double average(){
        double sum = 0.0;
        for(int i = 0;i < nums.length;i++)
            sum +=nums[i].doubleValue();

         return sum/nums.length;
    }
}
public class BoundDemo {
    public static void main(String[] args) {
        Integer inums[]={1,2,3,4,5};
        Stats<Integer> iOb = new Stats<Integer>(inums);
        double v = iOb.average();
        System.out.println("iOb average is: "+v);

        Double dnums[]={1.1,2.2,3.3,4.4,5.5};
        Stats<Double>dob = new Stats<Double>(dnums);
        double w = dob.average();
        System.out.println("dob average is: "+w);


    }
}
