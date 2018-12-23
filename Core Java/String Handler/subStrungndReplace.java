import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class subStrungndReplace {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String s1 = s.substring("is".length());
        System.out.println(s1);

        String search = "is";
        String sub = "was";
        String result = "";
        int i;

        do{
            System.out.println(s);
            i = s.indexOf(search);
            if(i!=-1){
                result = s.substring(0,i);
                result = result + sub;
                result = result + s.substring(i+search.length());
                s=result;
            }
        }while (i!=-1);
    }
}
