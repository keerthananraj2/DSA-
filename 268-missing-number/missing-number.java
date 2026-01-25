class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }
        int n = nums.length;
        int exp = 0;
        for(int i = 0;i<=n;i++){
            exp += i;
        }
        return exp-sum;
    }
}