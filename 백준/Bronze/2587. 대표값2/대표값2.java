    import java.io.*;
    import java.util.Arrays;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int[] arr = new int[5];

            int sum = 0;
            for (int i=0; i<arr.length; i++) {
                arr[i] = Integer.parseInt(br.readLine());
                sum+=arr[i];
            }

            Arrays.sort(arr);
            StringBuilder sb = new StringBuilder();
            sb.append(sum/5).append('\n').append(arr[2]);

            bw.append(sb);
            bw.close();
            br.close();
        }
    }