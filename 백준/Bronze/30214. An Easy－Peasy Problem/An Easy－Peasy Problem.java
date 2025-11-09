import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");
        int firstScore = Integer.parseInt(inputs[0]);
        int totalScore = Integer.parseInt(inputs[1]);
        char ans = firstScore * 2 >= totalScore ? 'E' : 'H';
        
        bw.append(ans);
        bw.close();
        br.close();
    }
}