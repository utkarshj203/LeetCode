class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < n ; i++) {
            if(!hash.add(nums[i]))  //true if this set did not already contain the specified element
                return true;  //Return true if a duplicate exists
        }
        return false; 
    }
}