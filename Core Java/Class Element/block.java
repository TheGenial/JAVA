public class block {
    block(){
        System.out.println("Constructor");
    }
    {
        System.out.println("Second Instance Block");
    }
    {
        System.out.println("First Instance Block");
    }

    public static void main(String[] args) {
        block b = new block();
    }
}
