import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String nick = br.readLine();
        bw.append(":fan::fan::fan:\n");
        bw.append(":fan::").append(nick).append("::fan:\n");
        bw.append(":fan::fan::fan:");
        bw.close();

    }
}