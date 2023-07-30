class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int met_target = 0;
        for(int i=0;i<hours.length;i++){
            if (hours[i]>=target){ met_target++; }
        }
        return met_target;
    }
}

