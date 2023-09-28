import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str;
        int count = 0;
        while (scanner.hasNextLine() && count<100) {
            bw.append(scanner.nextLine()).append('\n');
            count++;
        }

        bw.flush();
        bw.close();
        scanner.close();

    }


}