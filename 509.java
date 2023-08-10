class Solution {
    public int fib(int n) {
        if (n==1 ||n==2){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        else{
            int a=0;
            int b =1;
            int sum=0;
            for(int i=2;i<=n;i++){
                sum =a+ b;
                a=b;
                b= sum;
            }
            return b;
        }
    }
}
