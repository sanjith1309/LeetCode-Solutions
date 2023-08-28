class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] larr = new int[nums.length];
        int[] rarr = new int[nums.length];
        int[] result = new int[nums.length];
        if(nums.length==1){
            return larr;
        }
        else{
            for(int i=0;i<nums.length;i++){
                int sum=0;
                for(int j=0;j<i;j++){
                    sum+=nums[j];
                }
                larr[i]=sum;
            }
            for(int i=0;i<nums.length;i++){
                int sum=0;
                for(int j=i+1;j<nums.length;j++){
                    sum+=nums[j];
                }
                rarr[i]=sum;
            }
            for(int i=0;i<nums.length;i++){
                result[i]=Math.abs(larr[i]-rarr[i]);
            }
            return result;

        }
    }
}
