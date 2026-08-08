class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=-999;
        for(int i=0;i<n;i++){
            int sum=1;
            for(int j=i;j<n;j++){
                sum*=nums[j];
                if(sum>max)
                    max=sum;
            }
        }
        return max;
    }
}