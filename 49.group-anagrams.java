/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> sorts = new HashMap<>();
        for (String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String tempStr = new String(temp);
            if(sorts.containsKey(tempStr)) {
                ArrayList<String> curr = sorts.get(tempStr);
                curr.add(str);
                sorts.put(tempStr, curr);
            } else {
                ArrayList<String> curr = new ArrayList<String>();
                curr.add(str);
                sorts.put(tempStr, curr);
            }
        }
        List<List<String>> finalList = new ArrayList<List<String>>();
        sorts.forEach((k, v) -> finalList.add(v));
        return finalList;
    }
}
// @lc code=end

