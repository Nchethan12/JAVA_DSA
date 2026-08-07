class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if (n == 0)
            return 0;
        Arrays.sort(nums);
        
        int long1=1;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1])continue;
            else if(nums[i]==nums[i-1]+1)
                count++;
            else
                count=1;

            if(count>long1)
            long1=count;
        }
        return long1;
    }
}