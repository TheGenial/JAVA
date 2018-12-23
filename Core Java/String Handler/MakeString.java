public class MakeString {
    public static void main(String[] args) {
        char c[] = {'J','a','v','a'};
        char s[] = {'A','r','i','f','u','l'};
        String s1 = new String(c);
        String s2 = new String(s1);
        String s3 = new String(s,1,3);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
