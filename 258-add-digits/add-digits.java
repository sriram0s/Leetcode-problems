class Solution {
    public int addDigits(int x) {
        if(x<0){
            x*=-1;
        }
        while(x>=10){
            int sum=0;
            while(x>0){
            sum+=x%10;
            x/=10;
            }
        x=sum;
        }
    return x;
    }
}