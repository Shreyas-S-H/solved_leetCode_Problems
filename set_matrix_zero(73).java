class set_matrix_zero {

    public void setZeroes(int[][] m) {
        int R = m.length, C = m[0].length;
        boolean row0 = false;

        // mark
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                if (m[i][j] == 0) {
                    m[0][j] = 0;
                    if (i == 0)
                        row0 = true;
                    else
                        m[i][0] = 0;
                }

        // fill
        for (int i = 1; i < R; i++)
            for (int j = 1; j < C; j++)
                if (m[i][0] == 0 || m[0][j] == 0)
                    m[i][j] = 0;

        // first column
        if (m[0][0] == 0)
            for (int i = 0; i < R; i++)
                m[i][0] = 0;

        // first row
        if (row0)
            for (int j = 0; j < C; j++)
                m[0][j] = 0;
    }

    public static void main(String[] args) {
        set_matrix_zero obj = new set_matrix_zero();

        int[][] m = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };

        obj.setZeroes(m);

        // print result
        for (int[] row : m) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}