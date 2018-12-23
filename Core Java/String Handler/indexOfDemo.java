import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class indexOfDemo {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //char ch =(char) br.read();
        //System.out.println(ch);//Take character  input & Output

        String s = br.readLine();
        System.out.println(s);

        System.out.println("indexOf(t) = " + s.indexOf('t'));
        System.out.println("lastIndexOf(t) = " + s.lastIndexOf('t'));
        System.out.println("indexOf(the) = " + s.indexOf("the"));
        System.out.println("lastIndexOf(t) = " + s.lastIndexOf("the"));


        //int num = Integer.parseInt(str);
        //System.out.println(num+2);//Integer input and output




    }
}
