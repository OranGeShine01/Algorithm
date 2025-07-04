import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] birthDay = br.readLine().split(" ");
        String[] standardDay = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();

        int[] birthDayInt = new int[birthDay.length];
        int[] standardDayInt = new int[standardDay.length];

        for (int i = 0; i < birthDayInt.length; i++) {
            birthDayInt[i] = Integer.parseInt(birthDay[i]);
        }

        for (int i = 0; i < standardDayInt.length; i++) {
            standardDayInt[i] = Integer.parseInt(standardDay[i]);
        }

        int yearGap = standardDayInt[0] - birthDayInt[0];
        int regalAge = yearGap;

        if (standardDayInt[1] < birthDayInt[1] || (standardDayInt[1] == birthDayInt[1] && standardDayInt[2] < birthDayInt[2])) regalAge--;

        sb.append(regalAge).append('\n').append(yearGap + 1).append('\n').append(yearGap);

        bw.append(sb);
        bw.close();
        br.close();
    }
}