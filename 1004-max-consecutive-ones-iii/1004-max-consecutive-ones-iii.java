class Solution {
    public int longestOnes(int[] nums, int k) {

        int low =0;
        int high=0;
        int n=nums.length;

        int max_length=0;

        for(low=0;low<n;low++)
        {

            int zero_count=0;


            for(high=low;high<n;high++)
            {
                if(nums[high]==0)
                {
                    zero_count++;

                }
                if(zero_count>k)
                {
                    break;

                }

                max_length=Math.max(max_length,high-low+1);



            }


        }

        return max_length;

        
    }
}