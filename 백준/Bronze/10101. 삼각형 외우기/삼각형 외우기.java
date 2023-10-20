    import java.io.*;

    public class Main {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            int[] tri = new int[3];
            int sum = 0;
            for (int i=0; i<tri.length; i++) {
                tri[i] = Integer.parseInt(br.readLine());
                sum+=tri[i];
            }

            if (sum==180) {
                if (tri[0]==tri[1] && tri[1]==tri[2]) bw.append("Equilateral");
                else if (tri[0]!=tri[1] && tri[0]!=tri[2] && tri[1]!=tri[2]) bw.append("Scalene");
                else bw.append("Isosceles");
            } else bw.append("Error");

            bw.close();
            br.close();
        }
    }