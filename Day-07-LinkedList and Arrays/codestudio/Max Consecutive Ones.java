class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0;
        int initial_count = 0;
        for(int i = 0; i<nums.length; i++){
			//Counting consecutive 1's and once '0' is seen, update the initial count with zero to start the consecutive 1's count again
            if(nums[i] == 1){
                initial_count++;
            }else{
                initial_count = 0;
            }
            //Checking consecutive 1's count with maximum consecutive 1's count and update it
            if(initial_count > max_count){
                max_count = initial_count;
            }
        }
        return max_count;
    }
}
