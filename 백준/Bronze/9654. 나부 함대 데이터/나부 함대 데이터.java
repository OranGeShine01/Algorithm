import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.append("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n");
        bw.append("N2 Bomber      Heavy Fighter  Limited    21        \n");
        bw.append("J-Type 327     Light Combat   Unlimited  1         \n");
        bw.append("NX Cruiser     Medium Fighter Limited    18        \n");
        bw.append("N1 Starfighter Medium Fighter Unlimited  25        \n");
        bw.append("Royal Cruiser  Light Combat   Limited    4         ");
        bw.close();

    }
}