class Solution {
    public int singleNumber(int[] nums) {
        int c=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (nums[i]==nums[j]){
                    c++;
                }
            }
            if (c==1){
                k=nums[i];
            }
            c=0;
        }
        return(k);
    }
}
