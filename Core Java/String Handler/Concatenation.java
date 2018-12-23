public class Concatenation {
    public static void main(String[] args) {
        String age = "9";
        String first = "Arif is ";
        String last = " years old";
        String s = first + age + last;
        System.out.println(s);

        String s1 = "Dipa Was " + age + " years old";
        System.out.println(s1);

        s = first + age+ (2 + 2) + last;
        System.out.println(s);
    }
}
