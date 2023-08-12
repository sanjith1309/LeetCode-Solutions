class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int max1=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                max1++;
            }
            else{
                max1=0;
            }
            if(max1>max){
                max=max1;
            }
        }
        return max;
    }
}
