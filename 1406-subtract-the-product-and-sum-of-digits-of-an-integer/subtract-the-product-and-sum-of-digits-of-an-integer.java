class Solution {
    public int subtractProductAndSum(int n) {
        int m=1,a=0,t=0;
        while(n!=0){
            t=n%10;
            m*=t;
            a+=t;
            n/=10;
        }
        return m-a;
    }
}