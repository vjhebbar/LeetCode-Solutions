Space complexity O(n)
Runtime complexity O(n^2)

class Solution {
    public boolean find132pattern(int[] nums) {
    
        Integer[] memo = new Integer[nums.length];
        
        if(nums.length < 3){
            return false;
        }   
        for (int i = 0;i<nums.length;i++){
            for(int j = i + 1; j < nums.length;j++){
                if(nums[j] < nums[i]){
                        if (memo[j]!=null && nums[memo[j]] < nums[j]){
                                    return true;                        
                        }
                    }else if(nums[j] > nums[i]){
                        int diff = nums[j] - nums[i];
                        if(memo[j] == null || diff > memo[j]){
                            memo[j] = i;
                        } 
                    }    
            }
        }
        return false;

        
    }
}
