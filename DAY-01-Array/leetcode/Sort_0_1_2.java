class Solution {
        private static final int RED=0; 
        private static final int WHITE=1; 
        private static final int BLUE=2; 
        
        public void sortColors(int[]nums)
        {
            int redEnd=-1;
            int whiteEnd=-1;
            
            for (int i=0;i<nums.length;i++)
            {
                int v =nums[i];
                nums[i]=BLUE;
                if(v==RED)
                {
                    nums[++whiteEnd]=WHITE;
                    nums[++redEnd]=RED;
                }
                else if(v==WHITE)
                {
                    nums[++whiteEnd]=WHITE;
                }
            }
    }
}
