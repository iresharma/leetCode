/*
 * @lc app=leetcode id=432 lang=java
 *
 * [432] All O`one Data Structure
 */

// @lc code=start
import java.util.*;

class AllOne {

  HashMap<String, Integer> data;
  String max = "";
  String min = "";

  int maxCount = 0;
  int minCount = Integer.MAX_VALUE;

  public AllOne() {
    data = new HashMap<>();
  }

  public void updateMinMax() {
    if (maxCount != 0) maxCount = data.get(max);
    if (minCount != Integer.MAX_VALUE) minCount = data.get(min);
    for (Map.Entry<String, Integer> entry : data.entrySet()) {
      if (entry.getValue() < minCount) {
        min = entry.getKey();
        minCount = entry.getValue();
      }
      if (entry.getValue() > maxCount) {
        max = entry.getKey();
        maxCount = entry.getValue();
      }
    }
  }

  public void inc(String key) {
    System.out.println(key + "++");
    int temp = 1;
    if (data.containsKey(key)) {
      temp = data.get(key);
      data.put(key, temp + 1);
    } else data.put(key, temp);
    updateMinMax();
  }

  public void dec(String key) {
    System.out.println(key + "--");
    int temp = data.get(key);
    if (temp == 1) {
      data.remove(key);
      if (min.equals(key)) {
        min = "";
        minCount = Integer.MAX_VALUE;
      }
      if (max.equals(key)) {
        max = "";
        maxCount = 0;
      }
    } else data.put(key, temp - 1);
    updateMinMax();
  }

  public String getMaxKey() {
    return max;
  }

  public String getMinKey() {
    return min;
  }
}
/**
 * Your AllOne object will be instantiated and called as such:
 * AllOne obj = new AllOne();
 * obj.inc(key);
 * obj.dec(key);
 * String param_3 = obj.getMaxKey();
 * String param_4 = obj.getMinKey();
 */
// @lc code=end

