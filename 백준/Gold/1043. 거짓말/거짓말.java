import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    static int[] parent;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        String[] truthPerson = br.readLine().split(" ");
        int truthCount = Integer.parseInt(truthPerson[0]);
        Set<Integer> truthSet = new HashSet<>();
        if (truthCount > 0) {
            for (int i = 1; i < truthPerson.length; i++) {
                truthSet.add(Integer.parseInt(truthPerson[i]));
            }
        }

        List<Integer>[] parties = new ArrayList[m];
        for (int i = 0; i < m; i++) {
            parties[i] = new ArrayList<>();
            String[] partyMembers = br.readLine().split(" ");
            int partySize = Integer.parseInt(partyMembers[0]);
            int firstPerson = 0;
            if (partySize > 0) {
                firstPerson = Integer.parseInt(partyMembers[1]);
                parties[i].add(firstPerson);
            }
            for (int j = 2; j <= partySize; j++) {
                int partyMember = Integer.parseInt(partyMembers[j]);
                union(firstPerson, partyMember);
                parties[i].add(partyMember);
            }
        }

        Set<Integer> truthRoot = new HashSet<>();
        for (int person : truthSet) {
            truthRoot.add(find(person));
        }

        int answer = 0;
        for (List<Integer> party : parties) {
            boolean isAvailableLie = true;
            for (int person : party) {
                if (truthRoot.contains(find(person))) {
                    isAvailableLie = false;
                    break;
                }
            }
            if (isAvailableLie) answer++;
        }

        bw.append(String.valueOf(answer));
        bw.flush();
        bw.close();
        br.close();
    }

    static int find(int x) {
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x];
    }

    static void union(int x, int y) {
        int parentX = find(x);
        int parentY = find(y);
        if (parentX != parentY) parent[parentY] = parentX;
    }
}
