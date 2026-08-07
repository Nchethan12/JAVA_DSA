class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
        }
        swap(nums,i,j);
    }
    reverse(nums,i+1,n-1);
    }
    
    public void swap(int nums[],int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void reverse(int nums[],int st,int end){
        while(st<end){
            swap(nums,st,end);
            st++;
            end--;
        }
    }
}