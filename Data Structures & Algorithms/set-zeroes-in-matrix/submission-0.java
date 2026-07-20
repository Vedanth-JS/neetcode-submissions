class Solution {
    public void setZeroes(int[][] a) {
        int n = a.length;
        int m = a[0].length;

        boolean[] row = new boolean[n];
        boolean[] col = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (row[i] || col[j]) {
                    a[i][j] = 0;
                }
            }
        }
    }
}