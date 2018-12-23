public class getCharDemo {
    public static void main(String[] args) {
        String s = "I am Arif and I am a failure";
        int start = 5;
        int end = 12;
        char buf[] = new char[end-start];
        //System.out.println(buf);

        s.getChars(start,end,buf,0);
        System.out.println(buf);
    }
}
