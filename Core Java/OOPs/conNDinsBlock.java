public class conNDinsBlock {
    static int count = 0;
    {
        count++;
    }
    conNDinsBlock(){
        System.out.println("Zero-arg");
    }
    conNDinsBlock(int i){
        System.out.println("one-arg");
    }
    conNDinsBlock(int i,float j){
        System.out.println("two-arg");
    }

    public static void main(String[] args) {
        conNDinsBlock b1 = new conNDinsBlock();
        conNDinsBlock b2 = new conNDinsBlock();
        conNDinsBlock b3 = new conNDinsBlock(5);
        conNDinsBlock b4 = new conNDinsBlock(5,3.2f);

        System.out.println(count);
    }
}
