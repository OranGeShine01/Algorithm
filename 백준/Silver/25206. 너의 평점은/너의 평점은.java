import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int count = 0;
        final int sub = 20;
        double ans = 0;

        for (int i=0; i<sub; i++) {
            String[] arr = br.readLine().split(" ");
            double grade = 1.0;
            if (!arr[2].equals("P")) {
                switch (arr[2]) {
                    case "A+" :
                        grade = 4.5;
                        break;
                    case "A0" :
                        grade = 4.0;
                        break;
                    case "B+" :
                        grade = 3.5;
                        break;
                    case "B0" :
                        grade = 3.0;
                        break;
                    case "C+" :
                        grade = 2.5;
                        break;
                    case "C0" :
                        grade = 2.0;
                        break;
                    case "D+" :
                        grade = 1.5;
                        break;
                    case "D0" :
                        grade = 1.0;
                        break;
                    case "F" :
                        grade = 0.0;
                        break;
                }

                double grd = Double.parseDouble(arr[1]);
                ans+=(grd*grade);
                count+=grd;
            }
        }
        System.out.println(ans/count);
        br.close();

    }
}