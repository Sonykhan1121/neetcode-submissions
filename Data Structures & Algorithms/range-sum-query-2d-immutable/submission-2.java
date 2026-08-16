class NumMatrix {

    int matrix[][] = new int[1000][1000];
    int prefix[][] = new int[1000][1000];
    

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;

        int row = matrix.length;
        int col = matrix[0].length;

        for(int i =0;i<row;i++)
        {
            for(int j =0;j<col;j++)
            {
                int topSide = 0;
                int leftSide = 0;
                int topLeftSide =0;

                if(i-1>=0)
                 {
                    topSide = prefix[i-1][j];
                 }

                if(j-1>=0)
                {
                    leftSide = prefix[i][j-1];
                }
                if(i-1>=0&&j-1>=0)
                {
                    topLeftSide = prefix[i-1][j-1];
                }

                prefix[i][j] = matrix[i][j];
                prefix[i][j]+=topSide;
                prefix[i][j]+=leftSide;
                prefix[i][j]-=topLeftSide;

            }
        }
       
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
    
        int res = prefix[row2][col2];

        int topside=0;
        if(row1-1>=0)
        topside = prefix[row1-1][col2];
        int leftside=0;

        if(col1-1>=0)
        leftside = prefix[row2][col1-1];

        int topleftside =0;

        if(row1-1>=0&&col1-1>=0)
        topleftside = prefix[row1-1][col1-1];

        res-=topside;
        res-=leftside;
        res+=topleftside;

        return res;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */