import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int len = word.length();

        List<String> list = new ArrayList<>();

        for (int i = 1; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                StringBuilder sb = new StringBuilder();
                StringBuilder str1 = new StringBuilder(word.substring(0, i)).reverse();
                StringBuilder str2 = new StringBuilder(word.substring(i, j)).reverse();
                StringBuilder str3 = new StringBuilder(word.substring(j)).reverse();
                sb.append(str1).append(str2).append(str3);
                list.add(sb.toString());
            }
        }

        Collections.sort(list);

        bw.append(list.get(0));
        br.close();
        bw.close();
    }
}