

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        

        if(nums==null ||k<0)
        return new int[0];//empty array
        int n=nums.length;
        int[] result=new int[n-k+1];
        int result_index=0;
        Deque<Integer> queue=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            //to remove the index posititons or values that are out of range k




            while(!queue.isEmpty() && queue.peek()<i-k+1)
            {
                queue.poll();

            }
            //to remove the smallest values with in the range k that are not useful for the next window(optimal appraoch)
            while(!queue.isEmpty() &&  nums[queue.peekLast()]<nums[i])
            {
                queue.pollLast();
            }
            queue.offer(i);
            if(i>=k-1)
            {
                result[result_index++]=nums[queue.peek()];
            }
            
                }

        return result;
    }
}
