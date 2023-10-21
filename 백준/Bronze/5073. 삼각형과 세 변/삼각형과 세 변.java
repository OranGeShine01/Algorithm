    import java.io.*;
    import java.util.Arrays;
    import java.util.StringTokenizer;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int[] tri = new int[3];
            StringBuilder sb = new StringBuilder();

            while (true) {
                String str = br.readLine();
                if (str.equals("0 0 0")) break;
                StringTokenizer st = new StringTokenizer(str);
                for (int i=0; i<tri.length; i++) {
                    tri[i] = Integer.parseInt(st.nextToken());
                }
                Arrays.sort(tri);
                if (tri[0]==tri[1] && tri[1]==tri[2]) sb.append("Equilateral");
                else if (tri[2]>=(tri[0]+tri[1])) sb.append("Invalid");
                else if (tri[0]==tri[1] || tri[1]==tri[2]) sb.append("Isosceles");
                else sb.append("Scalene");

                sb.append('\n');
            }

            bw.append(sb);
            bw.close();
            br.close();
        }
    }