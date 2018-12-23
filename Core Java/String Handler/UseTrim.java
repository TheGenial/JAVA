import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UseTrim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        System.out.println("Enter 'stop' to quit");
        System.out.println("Enter state");
        do{
            s = br.readLine();
            s = s.trim();

            if(s.equals("Arif"))
                System.out.println("Name");
            else if(s.equals("Saif"))
                System.out.println("Brother Name");
            else
                System.out.println("No Name");
        }while(!s.equals("stop"));
    }
}
