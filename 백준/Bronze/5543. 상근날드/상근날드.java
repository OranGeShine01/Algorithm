import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] burger = new int[3];
        int[] beverage = new int[2];

        for (int i = 0; i < burger.length; i++) {
            burger[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < beverage.length; i++) {
            beverage[i] = Integer.parseInt(br.readLine());
        }

        int minBurger = Integer.MAX_VALUE;

        for (int i = 0; i < burger.length; i++) {
            minBurger = Math.min(minBurger, burger[i]);
        }

        int minBeverage = Integer.MAX_VALUE;

        for (int i = 0; i < beverage.length; i++) {
            minBeverage = Math.min(minBeverage, beverage[i]);
        }

        int answer = minBeverage + minBurger - 50;
        bw.append(String.valueOf(answer));
        bw.close();
        br.close();
    }
}