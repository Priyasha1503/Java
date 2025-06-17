
#https://leetcode.com/problems/max-consecutive-ones/

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int cnt=0,maxs=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                cnt++;
                if (maxs<cnt)
                maxs=cnt;
            }
            else
            {
                cnt=0;
            }

        }
    return maxs;
}
}
