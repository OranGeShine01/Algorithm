    import java.io.*;
    import java.util.Arrays;
    import java.util.StringTokenizer;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int[] tri = new int[3];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i=0; i<tri.length; i++) {
                tri[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(tri);
            int sum = 0;
            for (int i=0; i<tri.length; i++) {
                if (i==tri.length-1 && tri[2]>=tri[1]+tri[0]) {
                    sum=sum*2-1;
                } else sum+=tri[i];
            }

            bw.append(String.valueOf(sum));
            bw.close();
            br.close();
        }
    }