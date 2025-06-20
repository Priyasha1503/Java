

#https://leetcode.com/problems/palindrome-partitioning/

class Solution {
    public List<List<String>> partition(String s) {
        
        List<List<String>> list = new ArrayList<>();
        backtrack(list,new ArrayList<>(),s,0);
        return list;
    }
    private void backtrack(List<List<String>> list,List<String> tempList,String s,int start)
    {
        if(start==s.length())
        {
            list.add(new ArrayList<>(tempList));
        }
        else
        {
            for(int i=start;i<s.length();i++)
            {
                if(isPalindrome(s,start,i)==true)
                {
                    tempList.add(s.substring(start,i+1));
                    backtrack(list,tempList,s,i+1);
                //here we shouldnt do start+1,instead shouuld do i+1
                    tempList.remove(tempList.size()-1);
                }
            }
        }
    }

        public boolean isPalindrome(String s,int x ,int y)
        {
            while (x<y)
            {
                if(s.charAt(x)==s.charAt(y))
                {
                x++;
                y--;
                }
                else
                return false;
            }
            return true;
        }
    
}
