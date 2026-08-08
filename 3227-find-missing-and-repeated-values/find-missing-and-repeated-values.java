class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int x=n*n;
        int repeat=-1;
        int miss=-1;
        for(int k=1;k<=x;k++){
            int count=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(grid[i][j]==k)
                        count++;
                }
            }
            if(count==2)
                repeat=k;
            if(count==0)
                miss=k;
        }
        return new int[] {repeat,miss};
    }
}