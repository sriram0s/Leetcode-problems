class Solution {
    public boolean isPowerOfThree(int n) {
        int a=0;
        int i=0;
        int s=0;
        while(a<=n){
            a=(int)Math.pow(3,i);
            if(a==n){
                s=1;
                break;
            }
            i++;
        }
        if(a==n&&a%3==0 ||n==1){
            return true;
        }
        else{
            return false;
        }
    }
}