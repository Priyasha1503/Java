///not complete code,jus the algorithm

int maxending = nums[0];
int res=nums[0];
for(int i=1;i<nums.length;i++)
{
	//now 2 possibilities
	/*1> either continue with prev eles
	2> or u need to start with new subarray*/
	
	
maxending = Math.max(maxEnding+nums[i],nums[i])//nums[i] is new subarraay
//maxenidng+nums[i] is continuing with prev eles

res=Math.max(maxending,res)
}
return res
