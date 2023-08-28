class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int f=1;
        for(int i=0;i<candies.length;i++){
            int tot = candies[i]+extraCandies;
            for(int j=0;j<candies.length;j++){
                if(tot < candies[j] && i!=j){
                    arr.add(false);
                    f=0;
                    break;
                }
                
            }
            if(f==1){
                    arr.add(true);
                }
                f=1;
        }
        return arr;
    }
}
