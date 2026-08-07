class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;   
        int max=nums[0];
        int count=0;
        for(int i=0;i<n;i++){
            if(count==0)
                max=nums[i];
                if(max==nums[i])
                    count++;
                else
                    count--;
        }
        return max;
    }
}