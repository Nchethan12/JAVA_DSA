class Solution {
    public int removeDuplicates(int[] nums) {
        int i,j=0;
        if(nums.length==0){
            return 0;
        }
      for(i=1;i<nums.length;i++){
        {
            if(nums[i]!=nums[j]){
                nums[j+1]=nums[i];
                j++;
            }
        }
      }
      return j+1; 
    }
}
