import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoingNational {

/*
Going national

*/

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            String[] str = new String[s.length()];
            //write your code here
            for (int i = 0; i < s.length(); i++) {
                str[i] = s.substring(i, i + 1);
                //System.out.print(s.substring(i, i + 1));
            }

            if (!str[0].equals(" "))
                str[0] = str[0].toUpperCase();
            StringBuilder upS = new StringBuilder();
            for (int i = 0; i < str.length; i++) {
                if (str[i].equals(" ")) {
                    if (!str[i + 1].equals(" ")) {
                        str[i + 1] = str[i + 1].toUpperCase();
                    }
                }
                upS.append(str[i]);
            }
            System.out.println(upS);
        }
}
