class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] a = new int[nums.length];
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<nums.length;j=j+n){
                a[k]=nums[j];
                k++;
            }
        }
        return a;
    }
}
