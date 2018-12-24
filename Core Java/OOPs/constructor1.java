public class constructor1 {
    String name;
    String roolno;

    constructor1(String name,String roolno){
        this.name=name;
        this.roolno=roolno;
    }
    constructor1(){}
    public void view()
    {
        System.out.println(name);
        System.out.println(roolno);
    }

    public static void main(String[] args) {
        constructor1 c1 = new constructor1();
        constructor1 c2 = new constructor1("Arif","13037");
        c1.view();
        c2.view();
    }
}
