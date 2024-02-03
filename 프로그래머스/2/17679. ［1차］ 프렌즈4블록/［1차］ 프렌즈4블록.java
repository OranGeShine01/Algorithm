class Solution {

    char[][] arr;

    public int solution(int m, int n, String[] board) {
        arr = new char[m][n];
        int answer = 0;

        for (int i=0; i<m; i++) {
            arr[i] = board[i].toCharArray();
        }

        while (true) {
            int count = answer;
            boolean[][] check = new boolean[m][n];
            for (int i=0; i<m-1; i++) {
                for (int j=0; j<n-1; j++) {
                    if (arr[i][j]!='.' && arr[i][j]==arr[i+1][j] && arr[i][j]==arr[i][j+1]
                            && arr[i][j]==arr[i+1][j+1]) {
                        for (int k=0; k<2; k++) {
                            for (int l=0; l<2; l++) {
                                if (!check[i+k][j+l]) {
                                    check[i+k][j+l] = true;
                                    answer++;
                                }
                            }
                        }
                    }
                }
            }

            for (int i=0; i<m; i++) {
                for (int j=0; j<n; j++) {
                    if (check[i][j]) arr[i][j] = '.';
                }
            }

            if (answer==count) break;

            for (int j=0; j<n; j++) {
                int space = 0;
                for (int i=m-1; i>=0; i--) {
                    if (arr[i][j]=='.') {
                        space++;
                    } else if (space!=0) {
                        arr[i+space][j] = arr[i][j];
                        arr[i][j] = '.';
                    }
                }
            }
        }

        return answer;
    }
}