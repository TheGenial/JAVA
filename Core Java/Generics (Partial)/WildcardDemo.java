class Stats2<T extends Number>{
    T[] nums;
    Stats2(T[] o){
        nums=o;
    }
    double average(){
        double sum = 0.0;
        for(int i = 0;i < nums.length;i++)
            sum +=nums[i].doubleValue();

        return sum/nums.length;
    }
    boolean sameAvg(Stats2<?>ob){
        if(average()==ob.average())
            return true;
        return false;
    }
}
public class WildcardDemo {
    public static void main(String[] args) {
        Integer inum[]={1,2,3,4,5};
        Stats2<Integer> iOb = new Stats2<Integer>(inum);
        double v = iOb.average();
        System.out.println("iOb average is: "+v);

        Double dnum[]={1.1,2.2,3.2,4.4,5.5};
        Stats2<Double> dOb = new Stats2<Double>(dnum);
        double w = dOb.average();
        System.out.println("dOb average is: "+w);

        Float fnum[]={1.0F,2.0F,3.0F,4.0F,5.0F};
        Stats2<Float>  fOb = new Stats2<Float>(fnum);
        double x = fOb.average();
        System.out.println("fOb average is: "+x);

        System.out.println("Average of iOb and dOb ");
        if(iOb.sameAvg(dOb))
            System.out.println("are the same");
        else
            System.out.println("differ.");

        System.out.println("Average of iOb and fOb ");
        if(iOb.sameAvg(fOb))
            System.out.println("are the same");
        else
            System.out.println("differ.");
    }
}
