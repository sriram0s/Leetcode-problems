class Solution {
    public boolean isPalindrome(long x) {
        long y=x;
        long a=0;
        long b=0;
        if(x<0){
            return false;
        }
        else{
            while(y!=0){
                a=y%10;
                b=b*10+a;
                y/=10;
            }
            if(x==b){
                return true;
            }
            else{
                return false;
            }
        }
    }
}