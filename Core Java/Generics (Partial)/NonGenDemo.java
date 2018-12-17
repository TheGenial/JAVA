class NonGen{
    Object ob;
    NonGen(Object o){
        ob = o;
    }
    Object getOb(){
        return  ob;
    }
    void showType(){
        System.out.println("Type of ob is: "+ob.getClass().getName());
    }
}
public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;
        iOb = new NonGen(88);
        iOb.showType();

        int v = (Integer) iOb.getOb();
        System.out.println("Value: "+v);

        System.out.println();

        NonGen strOb = new NonGen("Non-Generics Test");
        strOb.showType();
        String str = (String) strOb.getOb();
        System.out.println("value: "+str);

        //Return Runtime error
        iOb = strOb;
        v = (Integer) iOb.getOb();
        System.out.println(v);

    }
}
