public class block2 {
    static {
        System.out.println("Static Block 1");
    }
    static {
        System.out.println("static Block 2");
    }
    {
        System.out.println("Second Instance Block");
    }
    {
        System.out.println("First Instance Block");
    }
    block2(){
        System.out.println("0-arg cons");
    }
    block2(int i){
        System.out.println("1-arg");
    }
    public static void main(String[] args) {
        block2 b = new block2();
        block2 b1 = new block2(2);
    }
}
