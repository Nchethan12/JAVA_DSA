class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int mark=-1000;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0){
                    for(int r=0;r<n;r++){
                        if(matrix[r][j]!=0)
                            matrix[r][j]=mark;
                        }
                    for(int c=0;c<m;c++){
                        if(matrix[i][c]!=0)
                            matrix[i][c]=mark;
                        }
                    }
                }
            }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==mark)
                    matrix[i][j]=0;
            }
        }
    }
}