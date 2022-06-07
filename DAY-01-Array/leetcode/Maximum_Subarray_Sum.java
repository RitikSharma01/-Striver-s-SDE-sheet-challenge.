class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums== null || nums.length == 0)
        {
            return 0;
        }
        
        int max=nums[0];
        int max2=nums[0];
        
        
            
        for(int i=1;i< nums.length;i++)
        {
            
            max2= Math.max(max2+nums[i],nums[i]);
            max=Math.max(max,max2);
            
        }
        return max;
            
    }
}
