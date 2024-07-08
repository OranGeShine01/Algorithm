import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String guest = br.readLine();
        String dr = br.readLine();
        System.out.println(guest.contains(dr) ? "go" : "no");
    }
}