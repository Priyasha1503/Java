//https://leetcode.com/problems/jump-game/submissions/1677976911/

class Solution {
    public boolean canJump(int[] nums) {
        int maxs=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>maxs)
            return false;
            maxs=Math.max(nums[i]+i,maxs);
        }
        return true;
    }
}
