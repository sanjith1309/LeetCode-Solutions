class Solution {
    public int majorityElement(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> in = new ArrayList<Integer>();
        int c=0;
        int index=0;
        int aa=0;
        for(int i=0;i<nums.length;i++){
            if(al.contains(nums[i])){
                index=al.indexOf(nums[i]);
                aa=in.get(index);
                aa++;
                in.set(index,aa);
            }
            else{
                al.add(nums[i]);
                in.add(1);
            }
        }
        int max=0;
        for(int i=0;i<al.size();i++){
            if ((in.get(i)>max)&&(in.get(i)>(nums.length/2))){
                max=in.get(i);
            }
        }
        int number=al.get(in.indexOf(max));
        System.out.print(in);
        return number;
    }
}
