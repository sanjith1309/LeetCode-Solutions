lass Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for (int j=1;j<nums.length;j++){
                if (nums[j-1]==0){
                    int temp = nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}
