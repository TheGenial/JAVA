import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer s = new StringBuffer( br.readLine());
        System.out.println(s);
        StringBuffer k = s.reverse();
        System.out.println(k);
    }
}
