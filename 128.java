class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        if(nums.length==0){
            return 0;
        }
        int ma =1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
                if(nums[i]-nums[i-1]==1){
                    count++;
                }
                else if(nums[i]!=nums[i-1]){
                    count=1;
                }
                if(count>ma){
                    ma = count;
                }
            }
        
        return ma;

    }
}
