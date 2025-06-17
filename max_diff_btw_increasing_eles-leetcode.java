//https://leetcode.com/problems/maximum-difference-between-increasing-elements/


class Solution {
    public int maximumDifference(int[] nums) {
        
        int maxdiff=-1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]<nums[j])
            {
                int val=nums[j]-nums[i];
                if(maxdiff<val)
                {
                    maxdiff=val;
                }

            }
            }
        }
        return maxdiff;
    }
}
