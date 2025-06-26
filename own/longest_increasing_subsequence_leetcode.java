
//https://leetcode.com/problems/longest-increasing-subsequence/
import java.lang.Math;
//BRUTEFORCE APPROACH
/*class Solution {
    public int lengthOfLIS(int[] nums) {
        int res=1;
        for(int ind=0;ind<nums.length;ind++)
        {
        
            res=Math.max(res,lisRec(nums,ind));
        }
        return res;
    }
    public int lisRec(int[] nums,int ind)
    {
        if(ind==0) return 1;
        int maxs=1;
        for(int prev=0;prev<ind;prev++)
        {
            if(nums[prev]<nums[ind])
            {
                maxs=Math.max(maxs,lisRec(nums,prev)+1);
            }
        }
        return maxs;

    }
}*/
//MEMOIZATION
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        int res=1;
        for(int ind=0;ind<n;ind++)
        {
            res=Math.max(res,lisRec(nums,ind,dp));
        }
        return res;

    }
    public int lisRec(int[] nums,int ind,int[] dp)
    {
        if(ind==0) return 1;
        if(dp[ind]!=-1) return dp[ind];
        int maxs=1;
        for(int prev=0;prev<ind;prev++)
        {
            if(nums[prev]<nums[ind])
            {
                maxs=Math.max(maxs,lisRec(nums,prev,dp)+1);
            }
            dp[ind]=maxs;
        }
        return maxs;

    }
}
