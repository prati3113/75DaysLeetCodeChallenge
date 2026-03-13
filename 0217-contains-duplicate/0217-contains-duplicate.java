import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Hashtable<Integer, Integer> x = new Hashtable<>();
        for(int i=0;i<nums.length;i++){
            if(x.containsKey(nums[i]))
                return true;
            x.put(nums[i],1);
        }
        return false;
    }
}