class Solution {
    public boolean hasDuplicate(int[] nums) {
   HashSet <Integer> seen = new  HashSet<>();
   for(int i =0; i<nums.length; i++){
    int current  = nums[i];
    if(seen.contains(current)){
        return true;
    }
    seen.add(current);
   }
   return false ;
    }
}