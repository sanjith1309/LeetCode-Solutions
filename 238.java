class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        int zerocount = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                pro=pro*nums[i];
            }
            else{
                zerocount+=1;
            }
        }
        int arr[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zerocount>1){
                arr[i]=0;
            }
            else if(zerocount==1){
                if(nums[i]==0){
                    arr[i]=pro;
                }
                else{
                    arr[i]=0;
                }
            }
            else{
                arr[i]=(int)pro/nums[i];
            }
        }
        return arr;
    }
}
