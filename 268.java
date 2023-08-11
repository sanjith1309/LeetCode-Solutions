class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        int sus=0;
        int f=0;
        for(int i : nums){
            if(k!=i){
                sus=k;
                f=1;
                break;
            }
            k++;
        }
        if (f==0){
            sus=nums[nums.length-1]+1;
        }
        return(sus);

    }
}
