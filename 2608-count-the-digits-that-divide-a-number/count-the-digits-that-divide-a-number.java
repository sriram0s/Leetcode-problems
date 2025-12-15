class Solution {
    public int countDigits(int n) {
        int s=0,m=n,a=0;
        while(m!=0){
            a=m%10;
            if(n%a==0&&a!=0){
                s++;
            }
            m/=10;
        }
        return s;
    }
}