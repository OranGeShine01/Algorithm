import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        switch (str) {
            case "NLCS" :
                bw.append("North London Collegiate School");
                break;
            case "BHA" :
                bw.append("Branksome Hall Asia");
                break;
            case "KIS" :
                bw.append("Korea International School");
                break;
            case "SJA" :
                bw.append("St. Johnsbury Academy");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}