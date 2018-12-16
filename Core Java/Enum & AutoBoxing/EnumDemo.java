enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("Value of ap:"+ap);
        System.out.println();

        ap = Apple.GoldenDel;
        if(ap==Apple.GoldenDel)
            System.out.println("Yes");

        switch(ap)
        {
            case Jonathan:
                System.out.println("Jonathan is RED");
                break;
            case GoldenDel:
                System.out.println("Golden is Yellow");
                break;
            case RedDel:
                System.out.println("Red Delicious is Red");
                break;
            case Winesap:
                System.out.println("Winsep is white");
                break;
            case Cortland:
                System.out.println("Cortland is Black");
                break;
        }
    }
}
