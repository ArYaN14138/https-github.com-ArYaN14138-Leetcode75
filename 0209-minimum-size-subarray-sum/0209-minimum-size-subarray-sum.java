class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int low=0;
        int high=0;
        int min_len=Integer.MAX_VALUE;
         int sum=0;

        for(high=0;high<nums.length;high++)
        {
           

            sum=sum+nums[high];


            while(sum>=target)
            {
                min_len=Math.min(min_len,high-low+1);
                sum=sum-nums[low];
                low++;


            }
        }
if(min_len==Integer.MAX_VALUE)
{
    return 0;

}
else
{
    return min_len;

}


        
    }
}