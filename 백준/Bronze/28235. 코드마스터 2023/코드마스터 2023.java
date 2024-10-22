import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        switch (str) {
            case "SONGDO" :
                bw.append("HIGHSCHOOL");
                break;
            case "CODE" :
                bw.append("MASTER");
                break;
            case "2023" :
                bw.append("0611");
                break;
            case "ALGORITHM" :
                bw.append("CONTEST");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
