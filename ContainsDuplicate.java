/**
* File:                 ContainsDuplicate.java
* Project:              Leet-Code
* Date:                 11/4/22
* Author:               Faint
* Description
*
* A program that returns a boolean expression that will output true if a duplicate exists within
* an integer array, false, if it does not.
**/

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        /**
        * === Problem Statement  ===
        * Given integer array of nums, return true if any value appears at least twice in the array
        * Return false if every element is distinct
        
        * === Algorithm ===
        * Iterate ever the array
        *  Using a conditional, verify that the array has distinct element
        *  If an addition to the collection fails, a duplicate exists, Other the elements will be                 stored accordingly
        *  
        *
        * === Time Complexity ===
        *      O(1) - Constant time
        **/
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        // Iterate over the array
        for(int index = 0; index < nums.length; index++){
            // Verify that an addition is a valid operation
            if(!set.add(nums[index])){
                return true;
            }
        }
        
        return false;
    }
}