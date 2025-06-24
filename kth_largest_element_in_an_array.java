
//https://leetcode.com/problems/kth-largest-element-in-an-array/
class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            if(k>0)
            {
                pq.offer(nums[i]);
                k--;
            }
            else if(pq.peek()<nums[i])
            {
                pq.poll();
                pq.offer(nums[i]);
            }
        }
        return pq.peek();
    }
}
