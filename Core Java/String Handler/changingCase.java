import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class changingCase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println("Original String is:"+s);

        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println("UpperCase:"+upper);
        System.out.println("LowerCase:"+lower);
    }
}
