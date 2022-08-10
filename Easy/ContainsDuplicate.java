import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        *   Specification
        *   
        *   Problem: Given an int array nums, return true iif any value appears at least twice in the array, false                 *   otherwise.
        *
        *   Design:
        *
        *   1. Initalize a HashSet
        *   2. Iterate over the length of the array
        *   2a. During the loop. verify that the addition of a new element into the set does not fail.
        *       If it does fail, return true
        *
        *   Time Complexity:
        *   Big O(n)
        */
        
        HashSet<Integer> distinctSet = new HashSet<Integer>();
        
        for(int index = 0; index < nums.length; index++){
            if(!distinctSet.add(nums[index])){
                return true;
            }
        }
      
        return false;
    }
}
