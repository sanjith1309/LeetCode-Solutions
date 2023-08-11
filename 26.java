class Solution {
    public int removeDuplicates(int[] nums) {
        int c=0;
        int a=nums[0];
        int j=1;
        int[] Array = new int[nums.length];
        Array[0]=nums[0];
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]!=a){
                Array[j]=nums[i];
                j++;
                a=nums[i];
            }
        }
        for (int i=0;i<nums.length;i++){
            nums[i]=0;
        }
        for (int i=0;i<Array.length;i++){
            nums[i]=Array[i];
        }
        return j;
        
    }
}
