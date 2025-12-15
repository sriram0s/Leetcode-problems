class Solution {
    public boolean isPowerOfFour(int n) {
        int i=1,a=0,b=0;
        while (a<n){
            a=(int)Math.pow(4,i);
            i++;
            if(a==n){
                b=1;
                break;
            }
        } 
        if(b==1&&n%4==0||n==1){
            return true;
        }
        else{
            return false;
        }
    }
}