import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("24_demo.txt"));
            String s = br.readLine();
            int mx = 1;
            int cnt = 1;

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'X') {
                    cnt++;
                    if (cnt > mx) {
                        mx = cnt;
                    }
                } else {
                    cnt = 1;
                }
            }
            System.out.println(mx);

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
