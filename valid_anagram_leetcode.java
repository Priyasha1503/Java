//https://leetcode.com/problems/valid-anagram/
import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        
        '''char [] str1=s.toCharArray();
        char[] str2=t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1,str2);'''
        //other method
        /*take an array stating 26 index positions in that...and store first zeroes..and then increment it if for that character...and then do thsi for two strings...nd thn compare those 2 arrays with their incrementations..*/
        //more optimised
        /*take one array for s and do that incrementation and then for the t string decrement the t string ...then if it is anagram, then the array will be zero's compeletly right */
        
    }
}
