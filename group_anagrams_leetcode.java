
//https://leetcode.com/problems/group-anagrams/
import java.util.Arrays;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        ArrayList<String> list = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String word:strs )
        {
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            
            String sortedword= new String(chars);
            // inserting into map
            if(!map.containsKey(sortedword)){
                //to insert in map - put
                map.put(sortedword,new ArrayList<>());               
            }
            //get () - retireive the value for the given key

            map.get(sortedword).add(word);
        }
        return new ArrayList<>(map.values());
    }}
