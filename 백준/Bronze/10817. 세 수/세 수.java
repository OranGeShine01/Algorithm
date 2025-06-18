import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] inputs = br.readLine().split(" ");

        int[] nums = new int[inputs.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(inputs[i]);
        }

        Arrays.sort(nums);

        int mid = nums.length / 2;

        bw.append(String.valueOf(nums[mid]));
        bw.close();
        br.close();
    }
}