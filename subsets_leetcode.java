class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>();
        func(0,new ArrayList<>(),res,nums);
        return res;
    }
    void func(int ind,List<Integer> arr,List<List<Integer>> res,int[] nums)
    {
        if(ind==nums.length)
        {
        res.add(new ArrayList<>(arr));
        return;
        }

        arr.add(nums[ind]);
        func(ind+1,arr,res,nums);
        arr.remove(arr.size()-1);
        func(ind+1,arr,res,nums);
        //return arr;
    }
}
